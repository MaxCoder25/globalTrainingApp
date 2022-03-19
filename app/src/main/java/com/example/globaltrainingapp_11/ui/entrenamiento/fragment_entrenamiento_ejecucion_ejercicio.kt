package com.example.globaltrainingapp_11.ui.entrenamiento

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter
import com.example.globaltrainingapp_11.databinding.FragmentEntrenamientoEjecucionEjercicioBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.utils.globalTrainingApp


class fragment_entrenamiento_ejecucion_ejercicio : Fragment() {

    private lateinit var binding: FragmentEntrenamientoEjecucionEjercicioBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEntrenamientoEjecucionEjercicioBinding.inflate(inflater, container, false)

        val ListaEjercicios = arguments?.getParcelableArrayList<EjerciciosEntity >("listaEjerc")

        if (ListaEjercicios != null) {
            saveSharedPreference(ListaEjercicios.size)
        }

        binding.reciclerEjerc2doUso .layoutManager =
            LinearLayoutManager(binding.reciclerEjerc2doUso.context)

        binding.reciclerEjerc2doUso.adapter =
            ListaEjercicios?.let { ListRutinas_Ejercicios_Adapter(it) { EjerciciosEntity -> ItemClickOnCambioEjercicio(EjerciciosEntity) } }



        binding.btnEmpezar.setOnClickListener() {

            val ListaEjercicios = arguments?.getParcelableArrayList<EjerciciosEntity >("listaEjerc")




            val listaEjerc2: MutableList<EjerciciosEntity> = ArrayList()

            if (ListaEjercicios != null) {
                listaEjerc2.addAll(ListaEjercicios)
            }



// se hacen 3 veces toca (series - 1)
            var rep = getIntSharedPreference() -  1

            while (rep > 0){

                if (ListaEjercicios != null) {
                    listaEjerc2.addAll(ListaEjercicios)
                }

                rep--
            }


            //paso lista a arraylist y llamo a funcion que pone en bundle la lista de ejercicios
             val arrayList = ArrayList(listaEjerc2)



                var frag_A_Enviar = newInstance(arrayList)


                val fragmentManager: FragmentManager? = parentFragmentManager
                val fragmentTransaction = fragmentManager!!.beginTransaction()

                fragmentTransaction.replace(R.id.fragmentContainerView, frag_A_Enviar)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commitAllowingStateLoss()


            }



            return binding.root



    }

    companion object {
        fun newInstance(lstEjercEntity : ArrayList<EjerciciosEntity>): fragment_configuraciones {
            val args = Bundle()

            args.putParcelableArrayList("listaEjerc", lstEjercEntity as ArrayList<out Parcelable>?)

            val fragment = fragment_configuraciones()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        }


    fun ItemClickOnCambioEjercicio(EjercicioSeleccionado: EjerciciosEntity) {
       // Toast.makeText(binding.reciclerEjerc2doUso.context, EjerciciosEntity.categoria , Toast.LENGTH_SHORT).show()
        val ListaEjercicios = arguments?.getParcelableArrayList<EjerciciosEntity >("listaEjerc")


        val args = Bundle()

        args.putParcelable("EjercicioSeleccionado", EjercicioSeleccionado)
        args.putParcelableArrayList("listaEjerc", ListaEjercicios as ArrayList<out Parcelable>?)

        val frag_A_Enviar = fragment_entrenamiento_cambio_ejercicio()

          frag_A_Enviar.arguments = args



        val fragmentManager: FragmentManager? = parentFragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()

        fragmentTransaction.replace(R.id.fragmentContainerView, frag_A_Enviar)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commitAllowingStateLoss()


    }


    fun getIntSharedPreference(): Int {
        var editorSP = globalTrainingApp.getShareDB()
        var repsRutina = editorSP.getInt("repsRutina", 1)

        return repsRutina

    }


    fun saveSharedPreference(size: Int) {
        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putInt("numeroEjercRutinaOriginal", size)
        editorSP.putInt("numeroEjercRutina", size)
        editorSP.putInt("cuentaNumRutina", 1 )

        editorSP.commit()
    }

}




















