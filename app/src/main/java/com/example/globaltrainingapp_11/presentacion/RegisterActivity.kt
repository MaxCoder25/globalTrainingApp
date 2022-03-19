package com.example.globaltrainingapp_11.presentacion

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.ActivityRegisterBinding
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import com.example.globaltrainingapp_11.logica.UsuarioBL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    var mediaPlayer =  MediaPlayer()
    private var pause:Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)








        binding.btnRegistrarse.setOnClickListener()
        {

            lifecycleScope.launch(Dispatchers.Main)
            {
                withContext(Dispatchers.IO) {
                    UsuarioBL().insertNuevoUsuario_Register(
                        binding.campoNombre.text.toString(),
                        binding.campoEdad.text.toString().toInt(),
                        binding.campoEmail.text.toString(),
                        binding.campoNickname.text.toString(),
                        binding.campoPassword.text.toString()
                    )
                }


            }

            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }


        binding.btnIniSesionRegistrarse.setOnClickListener()
        {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }



        binding.RegisterPrincipal.setOnClickListener() {
            hiddenIME(binding.root)
        }



    }




    fun hiddenIME(view: View) {
        val imm =
            getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
