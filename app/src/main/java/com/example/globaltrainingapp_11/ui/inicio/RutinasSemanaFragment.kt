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
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinas_Ejercicios_Adapter
import com.example.globaltrainingapp_11.controladores.adapters.ListSemanaRutinasAdapter
import com.example.globaltrainingapp_11.databinding.FragmentRutinasBinding
import com.example.globaltrainingapp_11.databinding.FragmentRutinasSemanaBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones
import com.example.globaltrainingapp_11.logica.RutinasBL
import com.example.globaltrainingapp_11.presentacion.EntrenamientoActivity
import com.example.globaltrainingapp_11.utils.EnumRutinas
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class RutinasSemanaFragment : Fragment() {


    private lateinit var binding: FragmentRutinasSemanaBinding
    private var category: String = EnumRutinas.SelectionCategoryRutinas.FULL_BODY.toString()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRutinasSemanaBinding.inflate(inflater, container, false)




        return  binding.root
    }

    override fun onStart() {
        super.onStart()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadListRutinas(category)

        binding.tabLayout.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    val idCat = tab?.position!!
                    category = EnumRutinas.SelectionCategoryRutinas.fromPosition(idCat)
                    clear()


                    loadListRutinas(category)
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {}
                override fun onTabUnselected(tab: TabLayout.Tab?) {}
            }
        )





    }



    private fun loadListRutinas(category: String) {




        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                RutinasBL().getRutinasList(category)

            }

            val items1 = withContext(Dispatchers.IO) {
                RutinasBL().getCategoriaRutinas(category)

            }
            binding.txtDescripCategoria.text = items1.descripcion
            binding.txtNumRutinas.text = items1.cantidad.toString()

            binding.RutinasRecyclerView.layoutManager =
                LinearLayoutManager(binding.RutinasRecyclerView.context)


          //  binding.RutinasRecyclerView.adapter = getRutinaItem(it)
            binding.RutinasRecyclerView.adapter =   ListRutinasAdapter(items) { RutinasEntity -> ItemClickOnRecycledView(RutinasEntity) }

        }






    }




    fun ItemClickOnRecycledView(RutinasEntity: RutinasEntity) {

        val rutinaSemana =
            arguments?.getParcelable<SemanaRutinasEntity>("rutinaSemanaDia")



        lifecycleScope.launch(Dispatchers.Main)
        {
            val items2 = withContext(Dispatchers.IO) {
                if (rutinaSemana != null) {
                    RutinasBL().updateSemanaRutinas(

                        RutinasEntity.id_rutinas,
                        rutinaSemana.dia
                    )
                }

            }


            var frag_A_Enviar = SemanaRutinasFragment()


            val fragmentManager: FragmentManager? = parentFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()

            fragmentTransaction.replace(R.id.nav_host_fragment_content_main, frag_A_Enviar)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commitAllowingStateLoss()




            Toast.makeText(
                binding.RutinasRecyclerView.context,
                "Rutina agregada correctamente",
                Toast.LENGTH_SHORT
            ).show()


        }

    }

    fun clear() {
        binding.RutinasRecyclerView.adapter = ListRutinasAdapter(emptyList()) { }
    }

}

