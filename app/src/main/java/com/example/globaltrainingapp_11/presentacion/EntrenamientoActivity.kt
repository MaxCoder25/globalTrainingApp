package com.example.globaltrainingapp_11.presentacion

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter
import com.example.globaltrainingapp_11.databinding.ActivityEntrenamientoBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
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
            }


            binding.btnEmpezarEntrenamiento.setOnClickListener(){
                var i = Intent(this, Entrenamiento_2_Activity::class.java)
                val jsonString = Json.encodeToString(n)
                i.putExtra("rutina", jsonString)

                startActivity(i)





            }




        }

    private fun getRutinaItem(EjerciciosEntity: List<EjerciciosEntity>) {
        var i = Intent(this, Entrenamiento_2_Activity::class.java)
        val jsonString = Json.encodeToString(EjerciciosEntity)
        i.putExtra("rutina", jsonString)
        startActivity(i)
    }

        private fun loadRutinas(rutinasEntity: RutinasEntity) {
            binding.TXTNOMBRE.text = "Nombre: "+ rutinasEntity.nombre
            binding.TXTNIVEL.text = "Nivel: "+ rutinasEntity.nivel
            binding.TXTMUSCULOS.text = "Musculos: " +rutinasEntity.musculos
            binding.TXTTIEMPO.text = "Duración: "+rutinasEntity.tiempoMin.toString() + " min"

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
            ListRutinas_Ejercicios_Adapter(items) { EjerciciosEntity -> ItemClickOnRecycledView(EjerciciosEntity) }
        //binding.reciclerEntrenamiento.adapter = ListRutinasAdapter(items) { getRutinaItem(it) }


    }
}

    fun ItemClickOnRecycledView(EjerciciosEntity: EjerciciosEntity) {
        Toast.makeText(binding.reciclerEntrenamiento.context, EjerciciosEntity.categoria , Toast.LENGTH_SHORT).show()
    }


    }