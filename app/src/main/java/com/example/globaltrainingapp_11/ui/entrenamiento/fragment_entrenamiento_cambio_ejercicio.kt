package com.example.globaltrainingapp_11.ui.entrenamiento

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
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter
import com.example.globaltrainingapp_11.databinding.FragmentEntrenamientoCambioEjercicioBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.logica.EjerciciosBL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class fragment_entrenamiento_cambio_ejercicio : Fragment() {

    private lateinit var binding: FragmentEntrenamientoCambioEjercicioBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEntrenamientoCambioEjercicioBinding.inflate(inflater, container, false)

    val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")
    val EjercicioSeleccionado  = arguments?.getParcelable<EjerciciosEntity>("EjercicioSeleccionado")


        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                EjerciciosBL().getEjerciciosByTipoMovimiento(EjercicioSeleccionado?.tipo_movimiento.toString())

            }


            binding.reciclerEjerc2doUso.layoutManager =
                LinearLayoutManager(binding.reciclerEjerc2doUso.context)

            binding.reciclerEjerc2doUso.adapter =
                items?.let {
                    ListRutinas_Ejercicios_Adapter(it) { EjerciciosEntity ->
                        ItemClickOnCambioEjercicio(EjerciciosEntity)
                    }
                }


        }



            return binding.root



    }

    companion object {
        fun newInstance(lstEjercEntity : ArrayList<EjerciciosEntity>): fragment_entrenamiento_ejecucion_ejercicio {
            val args = Bundle()

            args.putParcelableArrayList("listaEjerc", lstEjercEntity as ArrayList<out Parcelable>?)

            val fragment = fragment_entrenamiento_ejecucion_ejercicio()
            fragment.arguments = args
            return fragment
        }
    }


    fun ItemClickOnCambioEjercicio(NuevoEjercicio: EjerciciosEntity) {
       val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")
        val EjercicioSeleccionado  = arguments?.getParcelable<EjerciciosEntity >("EjercicioSeleccionado")



  if (listaEjerc != null) {

    if (EjercicioSeleccionado != null) {


        listaEjerc.set (  listaEjerc.indexOf(EjercicioSeleccionado)   , NuevoEjercicio )


        val arrayList = ArrayList(listaEjerc)

        var frag_A_Enviar = newInstance(arrayList)

        val fragment2 = frag_A_Enviar
        val fragmentManager: FragmentManager? = parentFragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()

        fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commitAllowingStateLoss();



            }

        }







    }



}




















