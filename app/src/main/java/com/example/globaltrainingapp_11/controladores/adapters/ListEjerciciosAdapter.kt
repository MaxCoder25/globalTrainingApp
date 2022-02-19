package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentEjerciciosListBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.squareup.picasso.Picasso


class ListEjerciciosAdapter(val listEjercicios: List<EjerciciosEntity>,private val onClickItemSelected: (EjerciciosEntity) -> Unit) : RecyclerView.Adapter<EjerciciosViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EjerciciosViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.fragment_ejercicios_list , parent, false)
        return EjerciciosViewHolder(view)
    }

    override fun onBindViewHolder(holder: EjerciciosViewHolder, position: Int) {
        val item =  listEjercicios[position]
        holder.render(item, onClickItemSelected)
    }

    override fun getItemCount(): Int = listEjercicios.size
}

class EjerciciosViewHolder (EjerciciosViewHolder: View) : RecyclerView.ViewHolder(EjerciciosViewHolder) {

    val binding = FragmentEjerciciosListBinding.bind(EjerciciosViewHolder)
//    val binding2 = FragmentRutinasBinding.bind(RutinasViewHolder)

    fun render(item : EjerciciosEntity , onClickItemSelected: (EjerciciosEntity) -> Unit) {

        binding.etiquetaNombre2.text = item.nombreEjercicio
        binding.etiquetaCategoria.text = "Categoria: "+item.categoria
        binding.etiquetaTipoMov.text = "Tipo de movimiento: "+ item.tipo_movimiento
        Picasso.get().load(item.imagen).into(binding.imageView2)


        itemView.setOnClickListener {
            onClickItemSelected(item)
        }


    }
   /* fun render2(item : CategoriaRutinasEntity) {

        binding2.txtTitulo2.text=item.nombre
    }*/
}
