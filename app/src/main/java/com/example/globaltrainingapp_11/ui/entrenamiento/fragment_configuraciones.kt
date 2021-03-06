package com.example.globaltrainingapp_11.ui.entrenamiento

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.lifecycleScope
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentConfiguracionesBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.utils.globalTrainingApp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class fragment_configuraciones : Fragment() {


    private lateinit var binding: FragmentConfiguracionesBinding
    var mediaPlayer =  MediaPlayer()
    var sonidoBoolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentConfiguracionesBinding.inflate(inflater, container, false)
        var seekBar =binding.seekBarTiempoDescansoEjerc

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, currentValue: Int, p2: Boolean) {
              //  Log.i("TAG" , currentValue.toString())
                binding.txtTiempoDescansoConfig.setText(currentValue.toString() + " segundos")
            }


            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

        var seekBar2 = binding.seekBarTiempoDescansoSerie

        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, currentValue: Int, p2: Boolean) {
                //  Log.i("TAG" , currentValue.toString())
                binding.txtTiempoDescansoConfigSerie.setText(currentValue.toString() + " segundos")
            }


            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })




        binding.btnEmpezarConfigs.setOnClickListener(){
        val listaEjerc = arguments?.getParcelableArrayList<EjerciciosEntity>("listaEjerc")

          //  binding.switchSonido.setOnCheckedChangeListener { buttonView, isChecked ->

            if( binding.switchSonido.isChecked) {
                     sonidoBoolean = true
                saveSharedPreference(sonidoBoolean)

                if (sonidoBoolean) {

                    lifecycleScope.launch(Dispatchers.Main)
                    {
                        withContext(Dispatchers.IO) {


                            mediaPlayer =
                                MediaPlayer.create(
                                    getActivity(),
                                    R.raw.fin_ejercicios
                                )
                            mediaPlayer.start()
                            //no vale toast con corutinas
                            // Toast.makeText(getActivity(), "Descanso terminado", Toast.LENGTH_SHORT)
                            //     .show()


                            // Thread.sleep(2600)

                            //  mediaPlayer.stop()
                        }

                    }



                }












            }

            else{
                var sonidoBoolean = false
                saveSharedPreference(sonidoBoolean)
            }



            val arrayList = ArrayList(listaEjerc)

            var fragment2 = newInstance(arrayList)

            val fragmentAEnviar = fragment2

            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            fragmentTransaction.replace(R.id.fragmentContainerView, fragmentAEnviar)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commitAllowingStateLoss()
        }



        return binding.root
    }





    fun saveSharedPreference(sonidoBoolean :Boolean) {
        var editorSP = globalTrainingApp.getShareDB().edit()
        editorSP.putInt("tiempoDescansoEjercOriginal", binding.seekBarTiempoDescansoEjerc.getProgress())
        editorSP.putInt("tiempoDescansoEjerc", binding.seekBarTiempoDescansoEjerc.getProgress())
        editorSP.putInt("tiempoDescansoSerie", binding.seekBarTiempoDescansoSerie.getProgress())
        Log.d("TAG", "sonidoBoolean: $sonidoBoolean")
        editorSP.putBoolean("sonidoBoolean", sonidoBoolean)


        editorSP.commit()



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



}