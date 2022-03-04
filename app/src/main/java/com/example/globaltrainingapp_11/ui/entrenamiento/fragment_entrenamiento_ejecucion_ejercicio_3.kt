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
import com.example.globaltrainingapp_11.databinding.FragmentEntrenamientoEjecucionEjercicio3Binding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class fragment_entrenamiento_ejecucion_ejercicio_3 : Fragment() {

    private lateinit var binding: FragmentEntrenamientoEjecucionEjercicio3Binding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEntrenamientoEjecucionEjercicio3Binding.inflate(inflater, container, false)

        val timer = object: CountDownTimer(11000, 1000) {


            override fun onTick(millisUntilFinished: Long) {
                binding.txtTiempoDescanso.setText((millisUntilFinished/1000).toString())
            }

            override fun onFinish() {
                //hace algo al finalizar el timer
                val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")


                val arrayList = ArrayList(listaEjerc)
                var frag_A_Enviar3 =newInstance3(arrayList)



                val fragment2 = frag_A_Enviar3
                val fragmentManager: FragmentManager? = parentFragmentManager
                val fragmentTransaction = fragmentManager!!.beginTransaction()

                fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()

            }
        }
        timer.start()
//se añade el nuevo timer pero el anterior sigue
        binding.txt10Mas3.setOnClickListener() {
         //solo se cancela el cambio ed la etiqueta tiempo del primer timer
               // timer.cancel()
            val timer2 = object : CountDownTimer(14000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    binding.txtTiempoDescanso.setText((millisUntilFinished/1000).toString())
                }

                override fun onFinish() {
                    val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")


                    val arrayList = ArrayList(listaEjerc)
                    var frag_A_Enviar3 =newInstance3(arrayList)



                    val fragment2 = frag_A_Enviar3
                    val fragmentManager: FragmentManager? = parentFragmentManager
                    val fragmentTransaction = fragmentManager!!.beginTransaction()

                    fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
                    fragmentTransaction.addToBackStack(null)
                    fragmentTransaction.commit()
                }


            }


            timer2.start()
        }


        binding.btnSaltar.setOnClickListener() {


            val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")


            val arrayList = ArrayList(listaEjerc)
            var frag_A_Enviar3 =newInstance3(arrayList)



            val fragment2 = frag_A_Enviar3
            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()



        }


        return  binding.root
    }



    companion object {
        fun newInstance3(lstEjercEntity : ArrayList<EjerciciosEntity>): fragment_entrenamiento_ejecucion_ejercicio_2 {
            val args = Bundle()
            // args.putParcelableArrayList("listaEjerc",lstEjercEntity);

            args.putParcelableArrayList("listaEjerc", lstEjercEntity as ArrayList<out Parcelable>?)

            val fragment = fragment_entrenamiento_ejecucion_ejercicio_2()
            fragment.arguments = args
            return fragment
        }
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // loadRutinas_Ejercicios(1)
        val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")


        binding.reciclerEjerc3erUso.layoutManager =
            LinearLayoutManager(binding. reciclerEjerc3erUso.context)

        binding. reciclerEjerc3erUso.adapter =
            listaEjerc?.let { ListRutinas_Ejercicios_Adapter(it) { EjerciciosEntity -> ItemClickOnRecycledView(EjerciciosEntity) } }





    }



    private fun loadRutinas_Ejercicios(id_Rutina: Int) {
        binding.reciclerEjerc3erUso
        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                Rutinas_Ejercicios_BL().getRutinas_EjerciciosList(id_Rutina)

            }

            binding.reciclerEjerc3erUso .layoutManager =
                LinearLayoutManager(binding.reciclerEjerc3erUso.context)

            binding.reciclerEjerc3erUso.adapter =
                ListRutinas_Ejercicios_Adapter(items) { EjerciciosEntity -> ItemClickOnRecycledView(EjerciciosEntity) }

         //   binding.reciclerEjerc2doUso.adapter = ListRutinasAdapter(items) { getRutinaItem(it) }


        }
    }

    fun ItemClickOnRecycledView(EjerciciosEntity: EjerciciosEntity) {
        Toast.makeText(binding.reciclerEjerc3erUso.context, EjerciciosEntity.categoria , Toast.LENGTH_SHORT).show()
    }



}




















