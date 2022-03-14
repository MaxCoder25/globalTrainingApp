package com.example.globaltrainingapp_11.ui.entrenamiento

import android.content.Intent
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
import com.example.globaltrainingapp_11.TecnicaYoutubeActivity
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc
import com.example.globaltrainingapp_11.databinding.FragmentEntrenamientoEjecucionEjercicio2Binding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class fragment_entrenamiento_ejecucion_ejercicio_2 : Fragment() {

    private lateinit var binding: FragmentEntrenamientoEjecucionEjercicio2Binding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEntrenamientoEjecucionEjercicio2Binding.inflate(inflater, container, false)



        binding.btnFinEjercicio.setOnClickListener() {


            val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")

            if (listaEjerc != null) {
                listaEjerc.removeAt(0)
            }

            if  (listaEjerc.isNullOrEmpty()) {


                val fragment3 = fragment_fin_entrenamiento2()
                val fragmentManager: FragmentManager? = parentFragmentManager
                val fragmentTransaction = fragmentManager!!.beginTransaction()

                fragmentTransaction.replace(R.id.fragmentContainerView, fragment3)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commitAllowingStateLoss()

            }


            if (listaEjerc != null) {

                if  (listaEjerc.isNotEmpty()) {
                    val arrayList = ArrayList(listaEjerc)
                    var frag2 = newInstance2(arrayList)

                    val fragAEnviar = frag2
                    val fragmentManager: FragmentManager? = parentFragmentManager
                    val fragmentTransaction = fragmentManager!!.beginTransaction()

                    fragmentTransaction.replace(R.id.fragmentContainerView, fragAEnviar)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commitAllowingStateLoss()

                }
            }

        }


        binding.btnTecnica.setOnClickListener() {

            val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")

            //var EjercParaVerTecnica = listaEjerc?.get(0)

            if (listaEjerc != null) {
               var EjercParaVerTecnica2= listaEjerc.component1()


            var i = Intent(activity, TecnicaYoutubeActivity::class.java)
            val jsonString = Json.encodeToString(EjercParaVerTecnica2)
            i.putExtra("EjercParaVerTecnica", jsonString)
            startActivity(i)
            }


            /*
           if (listaEjerc != null) {

                if (listaEjerc.isNotEmpty()) {
                    val arrayList = ArrayList(listaEjerc)


                    var frag_A_Enviar2 = newInstance2(arrayList)

                    val fragment3 = frag_A_Enviar2
                    val fragmentManager: FragmentManager? = parentFragmentManager
                    val fragmentTransaction = fragmentManager!!.beginTransaction()

                    fragmentTransaction.replace(R.id.fragmentContainerView, fragment3)
                    //fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commitAllowingStateLoss()

                }

            }
        }


*/

        }


        return  binding.root
    }



    companion object {
        fun newInstance2(lstEjercEntity : ArrayList<EjerciciosEntity>): fragment_entrenamiento_ejecucion_ejercicio_3 {
            val args = Bundle()
            // args.putParcelableArrayList("listaEjerc",lstEjercEntity);

            args.putParcelableArrayList("listaEjerc", lstEjercEntity as ArrayList<out Parcelable>?)

            val fragment = fragment_entrenamiento_ejecucion_ejercicio_3()
            fragment.arguments = args
            return fragment
        }
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")

        if (listaEjerc != null) {
            loadEjerc(listaEjerc.component1())
        }


        binding.reciclerEjerc2doUso .layoutManager =
            LinearLayoutManager(binding.reciclerEjerc2doUso.context)

        binding.reciclerEjerc2doUso.adapter =
            listaEjerc?.let { ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc(it) }








        }



    private fun loadRutinas_Ejercicios(id_Rutina: Int) {
        binding.reciclerEjerc2doUso

        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                Rutinas_Ejercicios_BL().getRutinas_EjerciciosList(id_Rutina)

            }

            binding.reciclerEjerc2doUso.layoutManager =
                LinearLayoutManager(binding.reciclerEjerc2doUso.context)

            binding.reciclerEjerc2doUso.adapter =
                ListRutinas_Ejercicios_Adapter(items) { EjerciciosEntity -> ItemClickOnRecycledView(EjerciciosEntity) }

         //   binding.reciclerEjerc2doUso.adapter = ListRutinasAdapter(items) { getRutinaItem(it) }


        }
    }

    fun ItemClickOnRecycledView(EjerciciosEntity: EjerciciosEntity) {
        Toast.makeText(binding.reciclerEjerc2doUso.context, EjerciciosEntity.categoria , Toast.LENGTH_SHORT).show()
    }



    private fun loadEjerc(ejerciciosEntity: EjerciciosEntity) {
        binding.txtReps.text = ejerciciosEntity.repeticiones.toString() + "  Repeticiones"
        binding.txtNombreEjerc.text = ejerciciosEntity.nombreEjercicio

        Picasso.get().load(ejerciciosEntity.imagen).into(binding.imgEjercFrag)

    }



}




















