package com.example.globaltrainingapp_11

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.globaltrainingapp_11.databinding.ActivityMainBinding
import com.example.globaltrainingapp_11.logica.UsuarioBL
import com.example.globaltrainingapp_11.presentacion.RegisterActivity
import com.example.globaltrainingapp_11.utils.globalTrainingApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityNavDrawer : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding:  ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMainActivityNavDrawer.toolbar)

      // aqui va la logica del boton del main content main
      binding.appBarMainActivityNavDrawer.toolbar.setOnClickListener {
              view ->

            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()


        }

        /*
        binding.navView.getHeaderView(0).findViewById<TextView>(R.id.nav_articulos).setOnClickListener(){

            var intent = Intent(this@MainActivityNavDrawer, RegisterActivity::class.java)

            startActivity(intent)
        }
        */

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController =
            findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                //aqui puedo definir que aparezca una flecha para volver al anterior fragment principal en lugar del menu principal
                R.id.nav_inicio, R.id.nav_Rutinas, R.id.nav_ejercicios,R.id.nav_articulos,R.id.nav_asistente,R.id.nav_logros
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                UsuarioBL().getOneUsuario(getIntSharedPreference_idUsuarioLogin())

            }
            binding.navView.getHeaderView(0). findViewById<TextView>(R.id.txt_nombreUsuarioNAVHEADER).text = items.nombreUsuario
            binding.navView.getHeaderView(0). findViewById<TextView>(R.id.txt_correoUsuarioNAVHEADER).text = items.emailUsuario


        }







    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController =
            findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun getIntSharedPreference_idUsuarioLogin(): Int {
        var editorSP = globalTrainingApp.getShareDB()
        var idUsuarioLogin = editorSP.getInt("idUsuarioLogin", 1)

        return idUsuarioLogin

    }




}