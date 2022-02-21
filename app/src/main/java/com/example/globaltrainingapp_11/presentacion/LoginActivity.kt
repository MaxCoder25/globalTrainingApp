package com.example.globaltrainingapp_11.presentacion

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.globaltrainingapp_11.MainActivityNavDrawer
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.controladores.UsuarioController
import com.example.globaltrainingapp_11.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtRegistrarse.setOnClickListener() {
           // Toast.makeText(this, "Pantalla en construcción", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

      /*  binding.btnLogin.setOnClickListener()
        {
            val access = UsuarioController().LoginUser(
                binding.campoEmail.text.toString(),
                binding.campoPassword.text.toString()
            )
            if (access) {
                binding.campoEmail.error = getString(R.string.errorEmail)
            } else {
                binding.campoEmail.error = null
                var intent = Intent(this,MainActivityNavDrawer::class.java)
                startActivity(intent)
            }
        }*/

        binding.txtIngreseSesion.setOnClickListener()
        {
            var intent = Intent(this,MainActivityNavDrawer::class.java)
            startActivity(intent)
        }

        binding.loginPrincipal.setOnClickListener() {
            hiddenIME(binding.root)
        }
    }


    fun hiddenIME(view: View) {
        val imm =
            getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
