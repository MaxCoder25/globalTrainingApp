package com.example.globaltrainingapp_11.presentacion

import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.ActivityEntrenamiento2Binding
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.ui.entrenamiento.fragment_entrenamiento_ejecucion_ejercicio
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class Entrenamiento_2_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEntrenamiento2Binding

    private var lstFragments = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEntrenamiento2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var n: RutinasEntity? = null
        intent.extras?.let {
            n = Json.decodeFromString<RutinasEntity>(it.getString("rutina").toString())
        }

        var Fragment2 = newInstance(n!!)

        changeFragment(R.id.nav_Rutinas, Fragment2)
        lstFragments.add(R.id. nav_Rutinas)


    }


    companion object {
        fun newInstance(rutinaObjeto: RutinasEntity): fragment_entrenamiento_ejecucion_ejercicio {
            val args = Bundle()

            // args.putParcelableArrayList("rutinaObjeto", rutinaObjeto as ArrayList<out Parcelable>?)

            args.putParcelable("rutinaObjeto", rutinaObjeto as Parcelable?)

            val fragment = fragment_entrenamiento_ejecucion_ejercicio()
            fragment.arguments = args
            return fragment
        }
    }



        private fun changeFragment(tagToChange: Int, fragment: Fragment? = null) {
            var addStack: Boolean = false
            val ft = supportFragmentManager.beginTransaction()

            if (lstFragments.isNotEmpty()) {
                val currentFragment =
                    supportFragmentManager.findFragmentByTag(lstFragments.last().toString())!!
                val toChangeFragment =
                    supportFragmentManager.findFragmentByTag(tagToChange.toString())
                currentFragment.onPause()

                if (toChangeFragment != null) {
                    if (currentFragment != toChangeFragment) {
                        addStack = true

                        ft.hide(currentFragment).show(toChangeFragment)
                        toChangeFragment.onResume()
                    }
                } else {
                    if (fragment != null) {
                        addStack = true

                        ft.hide(currentFragment)
                            .add(binding.fragmentContainerView.id, fragment, tagToChange.toString())
                    }
                }
            } else {
                if (fragment != null) {
                    ft.add(binding.fragmentContainerView.id, fragment, tagToChange.toString())
                    addStack = true
                }
            }

            if (addStack) {
                ft.commit()
                ft.addToBackStack(tagToChange.toString())
                lstFragments.add(tagToChange)
            }
        }


        override fun onBackPressed() {
            super.onBackPressed();
            if (lstFragments.size > 1) {
                lstFragments.removeLast()
            }
        }


    }

