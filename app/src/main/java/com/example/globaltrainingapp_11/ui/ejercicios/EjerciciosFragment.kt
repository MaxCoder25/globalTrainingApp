package com.example.globaltrainingapp_11.ui.ejercicios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.globaltrainingapp_11.databinding.FragmentEjerciciosBinding

class EjerciciosFragment : Fragment() {


    private lateinit var binding: FragmentEjerciciosBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEjerciciosBinding.inflate(inflater, container, false)


        return binding.root


    }

}