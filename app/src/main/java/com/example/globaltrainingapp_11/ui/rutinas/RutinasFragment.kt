package com.example.globaltrainingapp_11.ui.rutinas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.globaltrainingapp_11.databinding.FragmentRutinasBinding

class RutinasFragment : Fragment() {

    private lateinit var rutinasViewModel: RutinasViewModel
    private var _binding: FragmentRutinasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rutinasViewModel =
            ViewModelProvider(this).get(RutinasViewModel::class.java)

        _binding = FragmentRutinasBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}