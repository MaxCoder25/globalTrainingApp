package com.example.globaltrainingapp_11.ui.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.TecnicaYoutubeActivity
import com.example.globaltrainingapp_11.controladores.adapters.ListEjerciciosAdapter
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc
import com.example.globaltrainingapp_11.databinding.ActivityEntrenamientoBinding
import com.example.globaltrainingapp_11.databinding.ActivityExercisesbyMovementBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity
import com.example.globaltrainingapp_11.logica.EjerciciosBL
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import com.example.globaltrainingapp_11.presentacion.Entrenamiento_2_Activity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ExercisesbyMovementActivity : AppCompatActivity() {


    private lateinit var binding: ActivityExercisesbyMovementBinding
    val rejillalayoutManager= GridLayoutManager(this,2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercisesbyMovementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recycler=findViewById<RecyclerView>(R.id.idRVExercisesByMovement)


        recycler.layoutManager = rejillalayoutManager

        var n: tipo_movimientoEntity? = null
        intent.extras?.let {
            n = Json .decodeFromString<tipo_movimientoEntity>(it.getString("movimiento").toString())
        }


        if (n != null) {
            load_EjerciciosbyMovement(n!!.movimiento)

        }


    }

    private fun load_EjerciciosbyMovement(tipo_movimiento: String) {
        binding.idRVExercisesByMovement
        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                EjerciciosBL().getEjerciciosByTipoMovimiento(tipo_movimiento)

            }

            binding.idRVExercisesByMovement.layoutManager =
                LinearLayoutManager(binding.idRVExercisesByMovement.context)

            binding.idRVExercisesByMovement.layoutManager =rejillalayoutManager

            binding.idRVExercisesByMovement.adapter =
                ListEjerciciosAdapter(items){
                    getEjercicioItem(it)
                }

        }




    }

    fun getEjercicioItem(it: EjerciciosEntity) {

            var i = Intent(this@ExercisesbyMovementActivity, TecnicaYoutubeActivity::class.java)
            val jsonString = Json.encodeToString(tipo_movimientoEntity)
            i.putExtra("EjercParaVerTecnica", jsonString)
            startActivity(i)


    }

}