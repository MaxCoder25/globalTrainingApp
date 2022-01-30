package com.example.globaltrainingapp_11.presentacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var lstFragments = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(InicioFragment())
        lstFragments.add(R.id.itInicio)

        binding.bottomNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.itInicio -> {
                    //para poner noticias favoritas en el string del fragment
                   // binding.textView.text = getString(R.string.CarritoProductos)

                    loadFragment(InicioFragment())
                    lstFragments.add(R.id.itInicio)
                    true
                }
                R.id.itRutinas-> {
                    loadFragment(RutinasFragment())
                    lstFragments.add(R.id.itRutinas)
                    true
                }

                R.id.itEjercicios-> {
                    loadFragment(EjerciciosFragment())
                    lstFragments.add(R.id.itEjercicios)
                    true
                }
                /*
                R.id.itArticulos -> {
                    binding.textView.text = getString(R.string.ListarProductos)
                    loadFragment(ListarFragment())
                    lstFragments.add(R.id.itListar)
                    true
               */
                else -> false
            }
        }
            }




    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(binding.FrameLayout.id, fragment)
            addToBackStack(null)
        }.commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (lstFragments.isNotEmpty()) {
            lstFragments.removeLast()
            binding.bottomNavView.menu.findItem(lstFragments.last()).setChecked(true)
        }
    }

}