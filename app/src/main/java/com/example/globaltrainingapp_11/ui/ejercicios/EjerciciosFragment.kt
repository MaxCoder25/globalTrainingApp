package com.example.globaltrainingapp_11.ui.ejercicios

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.controladores.adapters.ListEjerciciosAdapter
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinasAdapter
import com.example.globaltrainingapp_11.controladores.adapters.tipo_movimientoAdapter
import com.example.globaltrainingapp_11.databinding.FragmentEjerciciosBinding
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity
import com.example.globaltrainingapp_11.logica.EjerciciosBL
import com.example.globaltrainingapp_11.logica.RutinasBL
import com.example.globaltrainingapp_11.logica.tipo_movimientoBL
import com.example.globaltrainingapp_11.presentacion.EntrenamientoActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class EjerciciosFragment : Fragment() {


    private lateinit var binding: FragmentEjerciciosBinding

    //private var categoriaEjercicio: String = "FULL_BODY"
    //private var page: Int = 1
    //private var mGridLayoutMgr: GridLayoutManager? = null
    //private var mSpanCount = 0
    //private var mShouldChangeSpan = false



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

       // return inflater.inflate(R.layout.fragment_ejercicios, container, false);
        binding = FragmentEjerciciosBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onStart() {
        super.onStart()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadListCategoriesByMovement()

        //loadListEjercicios()
/*
        //mSpanCount = 3
        //mShouldChangeSpan = false

        val recyclerView = view.findViewById(R.id.idRVcategoryMovementType) as RecyclerView
        recyclerView.setHasFixedSize(true)

        mGridLayoutMgr = GridLayoutManager(
            activity, mSpanCount, GridLayoutManager.VERTICAL, false
        )
        recyclerView.layoutManager = mGridLayoutMgr

*/
    }

    private fun loadListCategoriesByMovement() {
        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                tipo_movimientoBL().getCategoriesMovementList()
            }


            binding.idRVcategoryMovementType.layoutManager =
                LinearLayoutManager(binding.idRVcategoryMovementType.context)

            binding.idRVcategoryMovementType.adapter = tipo_movimientoAdapter(items) {
                getCategoryByMovementItem(it)
            }

        }
    }

    private fun getCategoryByMovementItem(tipo_movimientoEntity: tipo_movimientoEntity) {
        var i = Intent(activity, ExercisesbyMovementActivity::class.java)
        val jsonString = Json.encodeToString(tipo_movimientoEntity)
        i.putExtra("movimiento", jsonString)
        startActivity(i)
    }


}
/*
    //private fun loadListEjercicios() {
        // binding.RutinasRecyclerView.clearAnimation()


        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                EjerciciosBL().getEjerciciosList()

            }


          //  binding.idRVcategoryMovementType.layoutManager =
            //    LinearLayoutManager(binding.idRVcategoryMovementType.context)

            //  binding.RutinasRecyclerView.adapter =
            //   ListRutinasAdapter(items ) { RutinasEntity -> ItemClickOnRecycledView(RutinasEntity) }
            //binding.idRVcategoryMovementType.adapter = ListEjerciciosAdapter(items){


            }

        }
    }

*/



