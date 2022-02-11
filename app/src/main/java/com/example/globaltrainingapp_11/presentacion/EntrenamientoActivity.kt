package com.example.globaltrainingapp_11.presentacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.globaltrainingapp_11.databinding.ActivityEntrenamientoBinding
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class EntrenamientoActivity : AppCompatActivity() {

        private lateinit var binding: ActivityEntrenamientoBinding

        private var fav: Boolean = false

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
            }

       //     binding.floatingActionButtonItem.setOnClickListener {
           //     saveFavNews(n)
          //  }
        }


        private fun loadRutinas(rutinasEntity: RutinasEntity) {
            binding.TXTNOMBRE.text = "Nombre: "+ rutinasEntity.nombre
            binding.TXTNIVEL.text = "Nivel: "+ rutinasEntity.nivel
            binding.TXTMUSCULOS.text = "Musculos: " +rutinasEntity.musculos
            binding.TXTTIEMPO.text = "Duración: "+rutinasEntity.tiempoMin.toString()

            //  Picasso.get().load(RutinasEntity.img).into(binding.imgNews)

            /*lifecycleScope.launch(Dispatchers.Main) {
                fav = withContext(Dispatchers.IO) { CategoriaRutinasBL().checkIsSaved(CategoriaRutinasEntity.id) }

                if (fav) {
                    binding.floatingActionButtonItem.setImageResource(R.drawable.ic_favorite_24)
                }
            }*/
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