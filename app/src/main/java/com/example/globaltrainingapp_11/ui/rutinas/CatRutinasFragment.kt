package com.example.globaltrainingapp_11.ui.rutinas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globaltrainingapp_11.controladores.adapters.ListCategoriaRutinasAdapter
import com.example.globaltrainingapp_11.databinding.FragmentCatRutinasBinding
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.logica.CategoriaRutinasBL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class CatRutinasFragment : Fragment() {

    //private lateinit var rutinasViewModel: RutinasViewModel
    // private var _binding: FragmentRutinasBinding? = null
    private lateinit var binding: FragmentCatRutinasBinding
    // This property is only valid between onCreateView and
    // onDestroyView.
    //  private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //  rutinasViewModel =
        //   ViewModelProvider(this).get(RutinasViewModel::class.java)

        //   _binding = FragmentRutinasBinding.inflate(inflater, container, false)

        binding = FragmentCatRutinasBinding.inflate(inflater, container, false)
     //   loadListCatRutinas( CategoriaRutinasBL().getCategoriaRutinasList())


        return binding.root
    }


    override fun onStart() {
        super.onStart()
     //   binding.progressBar.visibility = View.VISIBLE
        lifecycleScope.launch(Dispatchers.Main) {
            val items = withContext(Dispatchers.IO) {
                CategoriaRutinasBL().getCategoriaRutinasList()
            }

          //  binding.progressBar.visibility = View.INVISIBLE

            loadListCatRutinas( items)
        }
    }




    private fun loadListCatRutinas(lstCatRutinas: List<CategoriaRutinasEntity>) {
        //Para listar las categoria de rutinas (recycler view)
     //Ya no es necesario porque le doy como parametro esa misma lista
        val lstCatRutinas = CategoriaRutinasBL().getCategoriaRutinasList()
        binding.catRutinasRecyclerView.layoutManager =
            LinearLayoutManager(binding.catRutinasRecyclerView.context)

                //    binding.catRutinasRecyclerView.adapter = ListCategoriaRutinasAdapter(lstCatRutinas) { CategoriaRutinasEntity -> ItemClickOnRecycledView(CategoriaRutinasEntity) }
        binding.catRutinasRecyclerView.adapter = ListCategoriaRutinasAdapter(lstCatRutinas) { getCatRutinaItem(it) }

    }

    private fun getCatRutinaItem(CategoriaRutinasEntity: CategoriaRutinasEntity) {
        var i = Intent(activity, RutinasFragment::class.java)
        val jsonString = Json.encodeToString(CategoriaRutinasEntity)
        i.putExtra("CatRutina", jsonString)
        startActivity(i)
    }


    fun ItemClickOnRecycledView(categoriaRutinasEntity: CategoriaRutinasEntity) {
        Toast.makeText(binding.catRutinasRecyclerView.context, categoriaRutinasEntity.nombre, Toast.LENGTH_SHORT).show()
    }
}