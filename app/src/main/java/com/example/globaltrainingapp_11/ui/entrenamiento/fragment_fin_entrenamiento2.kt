package com.example.globaltrainingapp_11.ui.entrenamiento

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.MainActivityNavDrawer
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentFinEntrenamiento2Binding
import com.example.globaltrainingapp_11.presentacion.EntrenamientoActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class fragment_fin_entrenamiento2 : Fragment() {

    private lateinit var binding: FragmentFinEntrenamiento2Binding

    private var id_Rutina: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFinEntrenamiento2Binding.inflate(inflater, container, false)


        binding.btnMenuPrincipal2.setOnClickListener() {


            var i = Intent(activity, MainActivityNavDrawer::class.java)

            startActivity(i)


        }



        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }




}




















