package com.example.globaltrainingapp_11.ui.asistente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.globaltrainingapp_11.databinding.FragmentAsistenteBinding

class AsistenteFragment : Fragment() {


    private lateinit var binding: FragmentAsistenteBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAsistenteBinding.inflate(inflater, container, false)


        return binding.root


    }

}