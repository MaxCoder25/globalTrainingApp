package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentRutinasListBinding
import com.example.globaltrainingapp_11.entidades.RutinasEntity


class ListRutinasAdapter(val listRutinas: List<RutinasEntity>,private val onClickItemSelected: (RutinasEntity) -> Unit) : RecyclerView.Adapter<RutinasViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RutinasViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.fragment_rutinas_list , parent, false)
        return RutinasViewHolder(view)
    }

    override fun onBindViewHolder(holder: RutinasViewHolder, position: Int) {
        val item =  listRutinas[position]
        holder.render(item, onClickItemSelected)
    }

    override fun getItemCount(): Int = listRutinas.size
}

class RutinasViewHolder(RutinasViewHolder: View) : RecyclerView.ViewHolder(RutinasViewHolder) {

    val binding = FragmentRutinasListBinding.bind(RutinasViewHolder)

    fun render(item : RutinasEntity , onClickItemSelected: (RutinasEntity) -> Unit) {

        binding.etiquetaNivel.text = "Nivel: "+ item.nivel
        binding.etiquetaNombre.text = "Nombre: "+item.nombre
        binding.etiquetaMusculos.text = "Musculos: "+item.musculos

        binding.etiquetaTiempo.text ="Duración: "+ item.tiempoMin.toString() + " min"


        itemView.setOnClickListener {
            onClickItemSelected(item)
        }


    }
}
