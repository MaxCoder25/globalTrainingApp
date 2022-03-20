package com.example.globaltrainingapp_11
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.globaltrainingapp_11.databinding.ActivityTecnicaEjercYoutubeBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.presentacion.Entrenamiento_2_Activity
import com.example.globaltrainingapp_11.utils.globalTrainingApp
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class TecnicaYoutubeActivity : YouTubeBaseActivity() {

    // Change the AppCompactActivity to YouTubeBaseActivity()

    // Add the api key that you had
    // copied from google API
    // This is a dummy api key
    val api_key =  "AIzaSyAWNhxQc1OGJMyfgCw9Kdq0AQH5afqXY5Q"


    private lateinit var binding: ActivityTecnicaEjercYoutubeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        binding = ActivityTecnicaEjercYoutubeBinding.inflate(layoutInflater)
        setContentView( binding.root)

      //  setContentView(R.layout.activity_tecnica_ejerc_youtube)


       /* binding.btnVolverTecnica.setOnClickListener(){

            var i = Intent(this, Entrenamiento_2_Activity::class.java)
          //  val jsonString = Json.encodeToString(EjercParaVerTecnica)
            //i.putExtra("EjercParaVerTecnica", jsonString)
            startActivity(i)


        }
           */

        var EjercParaVerTecnica: EjerciciosEntity? = null
        intent.extras?.let {
            EjercParaVerTecnica = Json.decodeFromString<EjerciciosEntity>(it.getString("EjercParaVerTecnica").toString())
        }
        if (EjercParaVerTecnica != null) {
            cargarDatosEjerc(EjercParaVerTecnica!!)
        }

        //binding.txtNombreEjercTecnica.text = EjercParaVerTecnica?.nombreEjercicio


        // Get reference to the view of Video player
        val ytPlayer = findViewById<YouTubePlayerView>(R.id.ytPlayer)

        ytPlayer.initialize(api_key, object : YouTubePlayer.OnInitializedListener{
            // Implement two methods by clicking on red error bulb
            // inside onInitializationSuccess method
            // add the video link or the
            // playlist link that you want to play
            // In here we also handle the play and pause functionality
            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider?,
                player: YouTubePlayer?,
                p2: Boolean
            ) {

                var urlVideoEjerc = EjercParaVerTecnica?.video?.drop(17)

                var tiempo = urlVideoEjerc?.substringAfter("=")
                var tiempoFinal = tiempo.plus("000")


                var urlVideoEjercCortado =  urlVideoEjerc?.substringBefore("?")

          //   var urlVideoEjerc= "e_EKkqoHxns"

                if (tiempo != null) {
                    player?.loadVideo(urlVideoEjercCortado, tiempoFinal.toInt())
                }

                player?.play()
                Log.d("TAG","Despues de cargar video, url: " + urlVideoEjercCortado)
                Log.d("TAG","tiempo: " + tiempoFinal)

            }

            // Inside onInitializationFailure
            // implement the failure functionality
            // Here we will show toast
            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
               // Toast.makeText(this@TecnicaYoutubeActivity , "Video player Failed" , Toast.LENGTH_SHORT).show()
                Toast.makeText(this@TecnicaYoutubeActivity , p1.toString() , Toast.LENGTH_SHORT).show()

            }
        })
    }


    private fun cargarDatosEjerc( EjercParaVerTecnica: EjerciciosEntity) {
        binding.txtNombreEjercTecnica.text = "Nombre ejercicio:   "+ EjercParaVerTecnica.nombreEjercicio
        binding.txtTipMovTecnica .text = "Tipo de movimiento:   "+ EjercParaVerTecnica.tipo_movimiento
        binding.txtNivelEjercTecnica .text = "Nivel:   " + EjercParaVerTecnica.nivel
        binding.txtDescripcionEjercTecnica.text = "Técnica:  "+ EjercParaVerTecnica.descripcion
    }





}