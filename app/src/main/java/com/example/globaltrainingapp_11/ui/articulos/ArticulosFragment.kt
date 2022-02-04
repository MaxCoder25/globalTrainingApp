package com.example.globaltrainingapp_11.ui.articulos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.globaltrainingapp_11.databinding.FragmentArticulosBinding

class ArticulosFragment : Fragment() {

    private lateinit var articulosViewModel: ArticulosViewModel
    private var _binding: FragmentArticulosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        articulosViewModel =
            ViewModelProvider(this).get(ArticulosViewModel::class.java)

        _binding = FragmentArticulosBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}