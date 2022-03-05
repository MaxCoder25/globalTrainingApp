package com.example.globaltrainingapp_11.ui.ejercicios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.controladores.adapters.ListEjerciciosAdapter
import com.example.globaltrainingapp_11.databinding.FragmentEjerciciosBinding
import com.example.globaltrainingapp_11.logica.EjerciciosBL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EjerciciosFragment : Fragment() {


    private lateinit var binding: FragmentEjerciciosBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEjerciciosBinding.inflate(inflater, container, false)


        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadListEjercicios()




    }




    private fun loadListEjercicios() {
        // binding.RutinasRecyclerView.clearAnimation()


        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                EjerciciosBL().getEjerciciosList()

            }


            binding.reciclerEjerciciosTodos.layoutManager =
                LinearLayoutManager(binding.reciclerEjerciciosTodos.context)

            //  binding.RutinasRecyclerView.adapter =
            //   ListRutinasAdapter(items ) { RutinasEntity -> ItemClickOnRecycledView(RutinasEntity) }
            binding.reciclerEjerciciosTodos.adapter = ListEjerciciosAdapter(items){


            }

        }
    }





}