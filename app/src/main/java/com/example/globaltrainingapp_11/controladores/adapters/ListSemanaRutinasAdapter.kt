package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentSemanaListBinding
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones


class ListSemanaRutinasAdapter(val listSemanaRutinas: List<SemanaRutinas_Rutinas_Relaciones>,private val onClickItemSelected: (SemanaRutinas_Rutinas_Relaciones) -> Unit) : RecyclerView.Adapter<SemanaRutinasViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SemanaRutinasViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.fragment_semana_list , parent, false)
        return SemanaRutinasViewHolder(view)
    }

    override fun onBindViewHolder(holder: SemanaRutinasViewHolder, position: Int) {
        val item =  listSemanaRutinas[position]
        holder.render(item, onClickItemSelected)
    }

    override fun getItemCount(): Int = listSemanaRutinas.size
}

class SemanaRutinasViewHolder(SemanaRutinasViewHolder: View) : RecyclerView.ViewHolder(SemanaRutinasViewHolder) {

    val binding = FragmentSemanaListBinding.bind(SemanaRutinasViewHolder)

    fun render(item : SemanaRutinas_Rutinas_Relaciones , onClickItemSelected: (SemanaRutinas_Rutinas_Relaciones) -> Unit) {

       binding.etiquetaDiaSemana .text =  item.semanaRutinas.dia
       binding.etiquetaNivelSemana.text = "Nivel: " + item.rutinas.nivel +  System.lineSeparator()  + System.lineSeparator() + item.rutinas.nombre



        binding.btnCambioRutinaSemana.setOnClickListener {
            onClickItemSelected(item)
        }


    }
}
