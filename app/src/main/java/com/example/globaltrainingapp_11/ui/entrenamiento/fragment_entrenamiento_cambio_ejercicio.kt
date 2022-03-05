package com.example.globaltrainingapp_11.ui.entrenamiento

import android.os.Bundle
import android.os.CountDownTimer
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
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
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

        val rutinaObjeto = arguments?.getParcelable<RutinasEntity>("rutinaObjeto")

        rutinaObjeto?.let { loadRutinas_Ejercicios(it.id_rutinas) }


        binding.btnEscoger.setOnClickListener() {

            val rutinaObjeto = arguments?.getParcelable<RutinasEntity>("rutinaObjeto")

            lifecycleScope.launch(Dispatchers.Main)
            {
                val items = withContext(Dispatchers.IO) {
                    rutinaObjeto?.let { Rutinas_Ejercicios_BL().getRutinas_EjerciciosList(it.id_rutinas ) }

                }


                //paso lista a arraylist y llamo a funcion que pone en bundle la lista de ejercicios
                val arrayList = ArrayList(items)



                var frag_A_Enviar = newInstance(arrayList)

                val fragment2 = frag_A_Enviar
                val fragmentManager: FragmentManager? = parentFragmentManager
                val fragmentTransaction = fragmentManager!!.beginTransaction()

                fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
                fragmentTransaction.addToBackStack(null)

             //   fragmentTransaction.commit()
                fragmentTransaction.commitAllowingStateLoss();

            }

        }

            return binding.root



    }

    companion object {
        fun newInstance(lstEjercEntity : ArrayList<EjerciciosEntity>): fragment_entrenamiento_ejecucion_ejercicio_2 {
            val args = Bundle()

            args.putParcelableArrayList("listaEjerc", lstEjercEntity as ArrayList<out Parcelable>?)

            val fragment = fragment_entrenamiento_ejecucion_ejercicio_2()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // loadRutinas_Ejercicios(1)

        }


private fun loadListaEjercicios(id_Rutina: Int){
    binding
    lifecycleScope.launch(Dispatchers.Main)
    {
        val items = withContext(Dispatchers.IO) {
            Rutinas_Ejercicios_BL().getRutinas_EjerciciosList(id_Rutina)
        }


        val arrayList = ArrayList(items)
        var frag_A_Enviar3 = newInstance(arrayList)

        val fragment2 = frag_A_Enviar3


       // Thread.sleep(5000)

        val fragmentManager: FragmentManager? = parentFragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()

        fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
        fragmentTransaction.addToBackStack(null)
       // fragmentTransaction.commit()
        fragmentTransaction.commitAllowingStateLoss();
    }
}
    private fun loadRutinas_Ejercicios(id_Rutina: Int) {
        binding.reciclerEjerc2doUso
        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                Rutinas_Ejercicios_BL().getRutinas_EjerciciosList(id_Rutina)

            }

            //paso lista a arraylist y llamo a funcion que pone en bundle la lista de ejercicios
           // val arrayList = ArrayList(items)
          //  newInstance(arrayList)


            binding.reciclerEjerc2doUso .layoutManager =
                LinearLayoutManager(binding.reciclerEjerc2doUso.context)

            binding.reciclerEjerc2doUso.adapter =
                ListRutinas_Ejercicios_Adapter(items) { EjerciciosEntity -> ItemClickOnRecycledView(EjerciciosEntity) }

         //   binding.reciclerEjerc2doUso.adapter = ListRutinasAdapter(items) { getRutinaItem(it) }


        }
    }

    fun ItemClickOnRecycledView(EjerciciosEntity: EjerciciosEntity) {
        Toast.makeText(binding.reciclerEjerc2doUso.context, EjerciciosEntity.categoria , Toast.LENGTH_SHORT).show()
    }



}




















