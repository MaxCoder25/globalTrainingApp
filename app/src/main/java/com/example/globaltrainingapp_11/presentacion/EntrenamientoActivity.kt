package com.example.globaltrainingapp_11.presentacion

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc
import com.example.globaltrainingapp_11.databinding.ActivityEntrenamientoBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import com.example.globaltrainingapp_11.utils.globalTrainingApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.*



class EntrenamientoActivity : AppCompatActivity() {

        private lateinit var binding: ActivityEntrenamientoBinding


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityEntrenamientoBinding.inflate(layoutInflater)
            setContentView(binding.root)

            var n: RutinasEntity? = null
            intent.extras?.let {
                n = Json.decodeFromString<RutinasEntity>(it.getString("rutina").toString())
            }

            if (n != null) {
                loadRutinas(n!!)

                loadRutinas_Ejercicios(n!!.id_rutinas)

                saveSharedPreference(n!!)

            }


            binding.btnAdelanteActivity.setOnClickListener() {

                lifecycleScope.launch(Dispatchers.Main)
                {
                    val items = withContext(Dispatchers.IO) {
                        Rutinas_Ejercicios_BL().getRutinas_EjerciciosList(n!!.id_rutinas)

                    }

                    val arrayListRutinaEjerc = ArrayList(items)


                   var i = Intent(this@EntrenamientoActivity, Entrenamiento_2_Activity::class.java)
                    val jsonString = Json.encodeToString(arrayListRutinaEjerc)
                    i.putExtra("listaEjerc", jsonString)

                    startActivity(i)



                }
            }


            }


    private fun getRutinaItem(EjerciciosEntity: List<EjerciciosEntity>) {
        var i = Intent(this, Entrenamiento_2_Activity::class.java)
        val jsonString = Json.encodeToString(EjerciciosEntity)
        i.putExtra("rutina", jsonString)
        startActivity(i)
    }

        private fun loadRutinas(rutinasEntity: RutinasEntity) {
            binding.TXTNOMBRE.text = "NOMBRE: "+ rutinasEntity.nombre
            binding.TXTNIVEL.text = "NIVEL: "+ rutinasEntity.nivel
            binding.TXTMUSCULOS.text = "MÚSCULOS: " +rutinasEntity.musculos
            binding.TXTTIEMPO.text = "DURACIÓN: "+rutinasEntity.tiempoMin.toString() + " min"
            binding.TXTSERIES.text = "SERIES: " + rutinasEntity.series.toString()
        }


private fun loadRutinas_Ejercicios(id_Rutina: Int) {
    binding.reciclerEntrenamiento
    lifecycleScope.launch(Dispatchers.Main)
    {
        val items = withContext(Dispatchers.IO) {
            Rutinas_Ejercicios_BL().getRutinas_EjerciciosList(id_Rutina)

        }

        binding.reciclerEntrenamiento.layoutManager =
            LinearLayoutManager(binding.reciclerEntrenamiento.context)

        binding.reciclerEntrenamiento.adapter =
            ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc(items)


    }
}

    fun ItemClickOnRecycledView(EjerciciosEntity: EjerciciosEntity) {
        Toast.makeText(binding.reciclerEntrenamiento.context, EjerciciosEntity.categoria , Toast.LENGTH_SHORT).show()
    }

    fun saveSharedPreference(n: RutinasEntity ) {

        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putInt("repsRutina", n.series)
        editorSP.putInt("puntosRutinaActual", n.puntos)
        editorSP.commit()
    }



    }