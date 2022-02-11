package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentCategoriaRutinasListBinding
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.squareup.picasso.Picasso


class ListCategoriaRutinasAdapter(val listCategoriaRutinas: List<CategoriaRutinasEntity>,private val onClickItemSelected: (CategoriaRutinasEntity) -> Unit) : RecyclerView.Adapter<CatRutinasViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatRutinasViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.fragment_categoria_rutinas_list , parent, false)
        return CatRutinasViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatRutinasViewHolder, position: Int) {
        val item =  listCategoriaRutinas[position]
        holder.render(item, onClickItemSelected)
    }

    override fun getItemCount(): Int = listCategoriaRutinas.size
}

class CatRutinasViewHolder(catRutinasViewHolder: View) : RecyclerView.ViewHolder(catRutinasViewHolder) {

    val binding = FragmentCategoriaRutinasListBinding.bind(catRutinasViewHolder)

    fun render(CategoriaRutinasEntity : CategoriaRutinasEntity, onClickItemSelected: (CategoriaRutinasEntity) -> Unit) {
        binding.txtNombreCategoriaRutina.text = CategoriaRutinasEntity.nombre
        binding.txtDescripcionCategoriaRutina.text = CategoriaRutinasEntity.descripcion
        binding.txtCantidadCategoriaRutina.text = CategoriaRutinasEntity.cantidad.toString()


        itemView.setOnClickListener {
            onClickItemSelected(CategoriaRutinasEntity)
        }

    }

}
