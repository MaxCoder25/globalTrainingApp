package com.example.globaltrainingapp_11.ui.inicio

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.TecnicaYoutubeActivity
import com.example.globaltrainingapp_11.databinding.FragmentInicioBinding
import com.example.globaltrainingapp_11.presentacion.EntrenamientoActivity
import com.example.globaltrainingapp_11.ui.ejercicios.EjerciciosFragment
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class InicioFragment : Fragment() {

    private lateinit var inicioViewModel: InicioViewModel
    private var _binding: FragmentInicioBinding? = null
    private var lstFragments = mutableListOf<Int>()
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inicioViewModel =
            ViewModelProvider(this).get(InicioViewModel::class.java)

        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        val root: View = binding.root

      /*  val textView: TextView = binding.textHome
        inicioViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
       // return root

        binding.btnAdelante.setOnClickListener() {


           /* val fragment2 = EjerciciosFragment()
            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.nav_host_fragment_content_main , fragment2)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

            */
           // var i = Intent(activity, TecnicaYoutubeActivity::class.java)
          //  val jsonString = Json.encodeToString(RutinasEntity)
         //   i.putExtra("rutina", jsonString)
          //  startActivity(i)


        }

        binding.btnSemanaInicioFrag.setOnClickListener() {

            val fragmentSemRut = SemanaRutinasFragment()
            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.nav_host_fragment_content_main , fragmentSemRut)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }




        return binding.root


    }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}