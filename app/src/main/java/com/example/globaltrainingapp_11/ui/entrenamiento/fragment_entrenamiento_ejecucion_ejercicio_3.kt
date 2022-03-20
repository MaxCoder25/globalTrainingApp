package com.example.globaltrainingapp_11.ui.entrenamiento

import android.content.Intent
import android.media.MediaPlayer
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
import com.example.globaltrainingapp_11.MainActivityNavDrawer
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc
import com.example.globaltrainingapp_11.databinding.FragmentEntrenamientoEjecucionEjercicio3Binding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.logica.Rutinas_Ejercicios_BL
import com.example.globaltrainingapp_11.ui.rutinas.RutinasFragment
import com.example.globaltrainingapp_11.utils.globalTrainingApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class fragment_entrenamiento_ejecucion_ejercicio_3 : Fragment() {

    private lateinit var binding: FragmentEntrenamientoEjecucionEjercicio3Binding

    var mediaPlayer =  MediaPlayer()
    var sonidoBoolean= false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEntrenamientoEjecucionEjercicio3Binding.inflate(inflater, container, false)




        binding.txtDESCANSO.text = getSharedPreferenceTXTDescanso()

        var tiempoDescanso  = getIntSharedPreferenceDescEjer()
        var tiempoDescanso2 = (tiempoDescanso + 1)  * 1000

        val timer = object: CountDownTimer(tiempoDescanso2.toLong(), 1000) {


            override fun onTick(millisUntilFinished: Long) {
                binding.txtTiempoDescanso.setText((millisUntilFinished/1000).toString())

             //   saveSharedPreference()
            }

            override fun onFinish() {

                sonidoBoolean = getSharedPreferenceSonidoBoolean() == true

                if(sonidoBoolean) {

                    lifecycleScope.launch(Dispatchers.Main)
                    {
                        withContext(Dispatchers.IO) {


                            mediaPlayer =
                                MediaPlayer.create(
                                    getActivity(),
                                    R.raw.inicio_entrenamiento_ejercicios
                                )
                            mediaPlayer.start()
                            //no vale toast con corutinas
                            // Toast.makeText(getActivity(), "Descanso terminado", Toast.LENGTH_SHORT)
                            //     .show()


                            Thread.sleep(2600)

                            mediaPlayer.stop()
                        }

                    }

                }



                //hace algo al finalizar el timer
                val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")


                val arrayList = ArrayList(listaEjerc)
                var frag_A_Enviar3 =newInstance3(arrayList)



                val fragment2 = frag_A_Enviar3
                val fragmentManager: FragmentManager? = parentFragmentManager
                val fragmentTransaction = fragmentManager!!.beginTransaction()

                fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commitAllowingStateLoss()

            }

        }

        timer.start()

        if(getIntSharedPreferenceEjercRutina() == 0){
//Reinicio el numero de ejercicios
            saveSharedPreferenceEjercRutina ( getIntSharedPreferenceOriginal() )
            saveSharedPreferenceDescansoEjerc( getIntSharedPreferenceDescEjerOriginal() )
            saveSharedPreferenceTXTDescanso("DESCANSO EJERCICIO")
        }



/*
        binding.txt10Mas3.setOnClickListener() {
         //solo se cancela el cambio ed la etiqueta tiempo del primer timer

            //se añade el nuevo timer pero vale 1 vez la segunda vez el anterior timer sigue
            timer.cancel()

            //timer2.cancel()

            var tiempoDescanso  = getIntSharedPreference2()

            var tiempoDescanso2 = (tiempoDescanso + 10)  * 1000

           // var tiempoDescanso = 14000

            val timer2 = object : CountDownTimer(tiempoDescanso2.toLong(), 1000) {

                override fun onTick(millisUntilFinished: Long) {
                    binding.txtTiempoDescanso.setText((millisUntilFinished/1000).toString())
                    saveSharedPreference()
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
                    fragmentTransaction.commitAllowingStateLoss()
                }


            }

           // timer2.cancel()
            timer2.start()
        }
*/

        binding.btnSaltar.setOnClickListener() {

            timer.cancel()

            sonidoBoolean = getSharedPreferenceSonidoBoolean() == true

            if(sonidoBoolean){

                lifecycleScope.launch(Dispatchers.Main)
                {
                    withContext(Dispatchers.IO) {


                        mediaPlayer =
                            MediaPlayer.create(getActivity(), R.raw.inicio_entrenamiento_ejercicios)
                        mediaPlayer.start()
                       //no vale toast con corutinas
                        // Toast.makeText(getActivity(), "Descanso terminado", Toast.LENGTH_SHORT)
                       //     .show()


                        Thread.sleep(2600)

                        mediaPlayer.stop()
                    }

                }


            }


            val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")


            val arrayList = ArrayList(listaEjerc)
            var frag_A_Enviar3 =newInstance3(arrayList)



            val fragment2 = frag_A_Enviar3
            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            fragmentTransaction.replace(R.id.fragmentContainerView, fragment2)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commitAllowingStateLoss()
          //  fragmentTransaction.commit()


        }

        binding.btnSalirEntrenamDesc.setOnClickListener(){

            timer.cancel()

                var intent = Intent(context, MainActivityNavDrawer::class.java)

                startActivity(intent)


        }





        return  binding.root
    }



    fun saveSharedPreference() {
        var editorSP = globalTrainingApp.getShareDB().edit()

        binding.txtTiempoDescanso.text.toString().toIntOrNull()
            ?.let { editorSP.putInt("tiempoDescansoEjerc2", it) }

        editorSP.commit()
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
        listaEjerc?.let { ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc(it) }




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


    fun getIntSharedPreferenceDescEjer(): Int {
        var editorSP = globalTrainingApp.getShareDB()
        var tiempoDescansoEjerc = editorSP.getInt("tiempoDescansoEjerc", 1)

        return tiempoDescansoEjerc

    }

    fun getIntSharedPreferenceDescEjerOriginal(): Int {
        var editorSP = globalTrainingApp.getShareDB()
        var tiempoDescansoEjerc = editorSP.getInt("tiempoDescansoEjercOriginal", 1)

        return tiempoDescansoEjerc

    }

/////////////////////////////////

    fun getIntSharedPreferenceOriginal(): Int {
        var editorSP = globalTrainingApp.getShareDB()
        var repsRutina = editorSP.getInt("numeroEjercRutinaOriginal", 1)

        return repsRutina

    }

    fun getIntSharedPreferenceEjercRutina(): Int {
        var editorSP = globalTrainingApp.getShareDB()
        var repsRutina = editorSP.getInt("numeroEjercRutina", 1)

        return repsRutina

    }


    fun getIntSharedPreferenceDescansoSerie(): Int {
        var editorSP = globalTrainingApp.getShareDB()
        var tiempoDescansoSerie = editorSP.getInt("tiempoDescansoSerie", 1)

        return tiempoDescansoSerie

    }


    fun getSharedPreferenceTXTDescanso(): String? {

        var editorSP = globalTrainingApp.getShareDB()
        var tiempoDescansoSerie = editorSP.getString ("ejercOSerie", "ejercOSerie")

        return tiempoDescansoSerie

    }


    fun getSharedPreferenceSonidoBoolean(): Boolean? {

        var editorSP = globalTrainingApp.getShareDB()
        var sonidoBoolean = editorSP.getBoolean ("sonidoBoolean", true)

        return sonidoBoolean

    }


    fun saveSharedPreferenceEjercRutina(size: Int) {
        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putInt("numeroEjercRutina", size)

        editorSP.commit()
    }

    fun saveSharedPreferenceDescansoEjerc(tiempo: Int) {
        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putInt("tiempoDescansoEjerc", tiempo)
        editorSP.commit()
    }

    fun saveSharedPreferenceTXTDescanso(ejercOSerie: String) {
        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putString("ejercOSerie", ejercOSerie)
        editorSP.commit()
    }


}




















