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
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.controladores.adapters.ListCategoriaRutinasAdapter
import com.example.globaltrainingapp_11.controladores.adapters.ListRutinasAdapter
import com.example.globaltrainingapp_11.databinding.FragmentRutinasBinding
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.logica.CategoriaRutinasBL
import com.example.globaltrainingapp_11.logica.RutinasBL
import com.example.globaltrainingapp_11.logica.UsuarioBL
import com.example.globaltrainingapp_11.presentacion.EntrenamientoActivity
import com.example.globaltrainingapp_11.utils.EnumRutinas
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class RutinasFragment : Fragment() {

    //private lateinit var rutinasViewModel: RutinasViewModel
   // private var _binding: FragmentRutinasBinding? = null
    private lateinit var binding: FragmentRutinasBinding
    private var category: String = EnumRutinas.SelectionCategoryRutinas.FULL_BODY.toString()
    private var page: Int = 1
    // This property is only valid between onCreateView and
    // onDestroyView.
  //  private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRutinasBinding.inflate(inflater, container, false)
       //loadListRutinas( RutinasBL().getRutinasList())



        return  binding.root
    }

    override fun onStart() {
        super.onStart()
        // binding.progressBar.visibility = View.INVISIBLE
        // loadListCatRutinas( CategoriaRutinasBL().getCategoriaRutinasList())
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadListRutinas(category, 1)

        binding.tabLayout.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    val idCat = tab?.position!!
                    category = EnumRutinas.SelectionCategoryRutinas.fromPosition(idCat)
                    clear()
                    loadListRutinas(category, 1)
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {}
                override fun onTabUnselected(tab: TabLayout.Tab?) {}
            }
        )

      /*  binding.listRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (!recyclerView.canScrollVertically(1)) {
                    page += 1
                    loadNews(category, page)
                }
            }
        })

        binding.swipeRefresh.setOnRefreshListener {
            loadNews(category, page)
            binding.swipeRefresh.isRefreshing = false
        }*/
    }




/*Original
    private fun loadListRutinas(lstRutinas: List<RutinasEntity>) {
        //Para listar las categoria de rutinas (recycler view)
        //Ya no es necesario porque le doy como parametro esa misma lista
        //  val lstCatRutinas = CategoriaRutinasBL().getCategoriaRutinasList()
        binding.RutinasRecyclerView.layoutManager =
            LinearLayoutManager(binding.RutinasRecyclerView.context)

        binding.RutinasRecyclerView.adapter = ListRutinasAdapter(lstRutinas) { RutinasEntity -> ItemClickOnRecycledView(RutinasEntity) }
        //binding.RutinasRecyclerView.adapter = ListRutinasAdapter(lstRutinas) { getRutinaItem(it) }

    }
*/


    private fun loadListRutinas(category: String, page: Int) {
        // binding.RutinasRecyclerView.clearAnimation()


        lifecycleScope.launch(Dispatchers.Main)
        {
            val items = withContext(Dispatchers.IO) {
                RutinasBL().getRutinasList(category, 1)

            }


            binding.RutinasRecyclerView.layoutManager =
                LinearLayoutManager(binding.RutinasRecyclerView.context)

          //  binding.RutinasRecyclerView.adapter =
             //   ListRutinasAdapter(items ) { RutinasEntity -> ItemClickOnRecycledView(RutinasEntity) }
            binding.RutinasRecyclerView.adapter = ListRutinasAdapter(items) { getRutinaItem(it) }

        }
    }




    private fun getRutinaItem(RutinasEntity: RutinasEntity) {
        var i = Intent(activity, EntrenamientoActivity::class.java)
        val jsonString = Json.encodeToString(RutinasEntity)
        i.putExtra("rutina", jsonString)
        startActivity(i)
    }


    fun ItemClickOnRecycledView(RutinasEntity: RutinasEntity) {
        Toast.makeText(binding.RutinasRecyclerView.context, RutinasEntity.nombre, Toast.LENGTH_SHORT).show()
    }

    fun clear() {
        binding.RutinasRecyclerView.adapter = ListRutinasAdapter(emptyList()) { }
    }

}

