package com.example.globaltrainingapp_11
import android.os.Bundle
import android.widget.Toast
import com.example.globaltrainingapp_11.databinding.ActivityEntrenamientoBinding
import com.example.globaltrainingapp_11.databinding.ActivityTecnicaEjercYoutubeBinding
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class TecnicaYoutubeActivity : YouTubeBaseActivity() {

    // Change the AppCompactActivity to YouTubeBaseActivity()

    // Add the api key that you had
    // copied from google API
    // This is a dummy api key
    val api_key =  "AIzaSyAWNhxQc1OGJMyfgCw9Kdq0AQH5afqXY5Q"


   // private lateinit var binding: ActivityTecnicaEjercYoutubeBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityTecnicaEjercYoutubeBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_tecnica_ejerc_youtube)

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
                // e_EKkqoHxns?t=40
                player?.loadVideo("HzeK7g8cD0Y")
                player?.play()
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
}