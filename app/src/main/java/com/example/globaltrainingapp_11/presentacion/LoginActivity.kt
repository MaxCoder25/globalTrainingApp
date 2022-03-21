package com.example.globaltrainingapp_11.presentacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.lifecycle.lifecycleScope
import com.example.globaltrainingapp_11.MainActivityNavDrawer
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.ActivityLoginBinding
import com.example.globaltrainingapp_11.entidades.Usuarios
import com.example.globaltrainingapp_11.logica.UsuarioBL
import com.example.globaltrainingapp_11.utils.globalTrainingApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    var access = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.txtIngreseSesion.setOnClickListener() {

            var intent = Intent(this, MainActivityNavDrawer::class.java)
            startActivity(intent)
        }


        binding.btnRegistrarse.setOnClickListener() {

            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener()
        {

            lifecycleScope.launch(Dispatchers.Main)
            {
                val items = withContext(Dispatchers.IO) {

                    UsuarioBL().LoginUser(
                        binding.campoEmail.text.toString(),
                        binding.campoPassword.text.toString()
                    )

                }


                if (items == null){
                    access = true
                }


                //aqui guardar con shared preferences los datos del usuario




                if (access) {
                    binding.campoEmail.error = getString(R.string.errorEmail)
                    binding.campoEmail.error = getString(R.string.errorPassword)
                } else {
                    binding.campoEmail.error = null

                    //mando el id del usuario a un shard prefe para controlar los datos de logros y guardar rutinas
                    // y rutinas guardadas
                    saveSharedPreference(items)
                    saveSharedPreferenceRutinaLunes("DESCANSO","NO HAY ENTRENAMIENTO PROGRAMADO")





                    var intent = Intent(this@LoginActivity,MainActivityNavDrawer::class.java)

                    startActivity(intent)

                }

                }




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

    fun saveSharedPreference(Usuario: Usuarios) {
        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putInt("idUsuarioLogin", Usuario.idUsuario )
       editorSP.commit()
    }



    fun saveSharedPreferenceRutinaLunes(nivel :String, nombre:String) {
        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putString("nivelRutinaLunes", nivel)
        editorSP.putString("nombreRutinaLunes", nombre)


        editorSP.commit()



    }

}
