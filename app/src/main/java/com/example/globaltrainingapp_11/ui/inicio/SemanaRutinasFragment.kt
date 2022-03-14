package com.example.globaltrainingapp_11.ui.inicio

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinasAdapter
import com.example.globaltrainingapp_11.controladores.adapters.ListSemanaRutinasAdapter
import com.example.globaltrainingapp_11.databinding.FragmentSemanaRutinasBinding
import com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones
import com.example.globaltrainingapp_11.logica.SemanaRutinasBL

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SemanaRutinasFragment : Fragment() {


    private lateinit var binding: FragmentSemanaRutinasBinding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSemanaRutinasBinding.inflate(inflater, container, false)

         loadListSemanaRutinas()


        binding.btbMenuInicio.setOnClickListener(){

            val fragment = InicioFragment()
            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            fragmentTransaction.replace(R.id.nav_host_fragment_content_main, fragment)
            //fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commitAllowingStateLoss()

        }



        return  binding.root
    }

    override fun onStart() {
        super.onStart()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            }






    private fun loadListSemanaRutinas() {

        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                SemanaRutinasBL().getSemanaRutinas()

            }

            binding.reciclerDiasSemana.layoutManager =
                LinearLayoutManager(binding.reciclerDiasSemana.context)

                // binding.reciclerDiasSemana.adapter = ListSemanaRutinasAdapter(items) {
                 //    getCategoriaRutinaItem(it.rutinas) }

            binding.reciclerDiasSemana.adapter = ListSemanaRutinasAdapter(items) {
                getCategoriaRutinaItem(it) }
            }
        }






    private fun getCategoriaRutinaItem(SemanaRutinas_Rutinas_Relaciones: SemanaRutinas_Rutinas_Relaciones) {


        var frag_A_Enviar = newInstance(SemanaRutinas_Rutinas_Relaciones.semanaRutinas)


        val fragmentManager: FragmentManager? = parentFragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()

        fragmentTransaction.replace(R.id.nav_host_fragment_content_main , frag_A_Enviar)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commitAllowingStateLoss()




    }


    companion object {
        fun newInstance(RutinaSemana: SemanaRutinasEntity): RutinasSemanaFragment {
            val args = Bundle()

            args.putParcelable("rutinaSemanaDia", RutinaSemana as Parcelable)

            val fragment = RutinasSemanaFragment()
            fragment.arguments = args
            return fragment
        }
    }




    fun clear() {
        binding.reciclerDiasSemana.adapter = ListRutinasAdapter(emptyList()) { }
    }

}

