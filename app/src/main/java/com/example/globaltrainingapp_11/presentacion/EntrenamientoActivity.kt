package com.example.globaltrainingapp_11.presentacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinasAdapter
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter
import com.example.globaltrainingapp_11.databinding.ActivityEntrenamientoBinding
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Entity
import com.example.globaltrainingapp_11.logica.RutinasBL
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import com.example.globaltrainingapp_11.utils.EnumRutinas
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class EntrenamientoActivity : AppCompatActivity() {

        private lateinit var binding: ActivityEntrenamientoBinding
    private var id_Rutina: Int = 1

    //private var fav: Boolean = false

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

                loadRutinas_Ejercicios(n!!.id)
               // loadRutinas_Ejercicios(id_Rutina)
            }

       //     binding.floatingActionButtonItem.setOnClickListener {
           //     saveFavNews(n)
          //  }
        }




        private fun loadRutinas(rutinasEntity: RutinasEntity) {
            binding.TXTNOMBRE.text = "Nombre: "+ rutinasEntity.nombre
            binding.TXTNIVEL.text = "Nivel: "+ rutinasEntity.nivel
            binding.TXTMUSCULOS.text = "Musculos: " +rutinasEntity.musculos
            binding.TXTTIEMPO.text = "Duración: "+rutinasEntity.tiempoMin.toString() + " min"

            //  Picasso.get().load(RutinasEntity.img).into(binding.imgNews)

            /*lifecycleScope.launch(Dispatchers.Main) {
                fav = withContext(Dispatchers.IO) { CategoriaRutinasBL().checkIsSaved(CategoriaRutinasEntity.id) }

                if (fav) {
                    binding.floatingActionButtonItem.setImageResource(R.drawable.ic_favorite_24)
                }
            }*/
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
            ListRutinas_Ejercicios_Adapter(items) { Rutinas_Ejercicios_Entity -> ItemClickOnRecycledView(Rutinas_Ejercicios_Entity) }
        //binding.reciclerEntrenamiento.adapter = ListRutinasAdapter(items) { getRutinaItem(it) }


    }
}

    fun ItemClickOnRecycledView(Rutinas_Ejercicios_Entity: Rutinas_Ejercicios_Entity) {
        Toast.makeText(binding.reciclerEntrenamiento.context, "Cambio del ejercicio: "+ Rutinas_Ejercicios_Entity.id_ejerc.toString(), Toast.LENGTH_SHORT).show()
    }


    /*  private fun saveFavNews(news: NewsEntity?) {

          if (news != null) {
              if (!fav) {
                  lifecycleScope.launch {
                      NewsController().saveFavNews(news)
                      binding.floatingActionButtonItem.setImageResource(R.drawable.ic_favorite_24)
                  }
              } else {
                  lifecycleScope.launch {
                      NewsController().deleteFavNews(news)
                      binding.floatingActionButtonItem.setImageResource(R.drawable.ic_favorite_border_12)
                  }
              }
          }
      }*/
    }