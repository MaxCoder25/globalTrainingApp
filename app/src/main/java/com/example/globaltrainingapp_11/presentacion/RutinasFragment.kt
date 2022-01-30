package com.example.globaltrainingapp_11.presentacion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.globaltrainingapp_11.databinding.FragmentRutinasBinding

class RutinasFragment : Fragment() {


    private lateinit var binding: FragmentRutinasBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRutinasBinding.inflate(inflater, container, false)


        return binding.root


    }

}