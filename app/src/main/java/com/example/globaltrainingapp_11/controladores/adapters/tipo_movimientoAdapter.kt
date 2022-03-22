package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.MovementTypeRvItemBinding
import com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity
import com.squareup.picasso.Picasso


class tipo_movimientoAdapter  (val listEjerciciosbyMovement: List<tipo_movimientoEntity>, private val onClickItemSelected: (tipo_movimientoEntity) -> Unit): RecyclerView.Adapter<CategoriaEjerciciosbyMovementViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriaEjerciciosbyMovementViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(
            R.layout.movement_type_rv_item,
            parent,
            false
        )
        return CategoriaEjerciciosbyMovementViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriaEjerciciosbyMovementViewHolder, position: Int ) {
        val item = listEjerciciosbyMovement[position]
        holder.render(item,onClickItemSelected )
    }

    override fun getItemCount(): Int= listEjerciciosbyMovement.size

}



class CategoriaEjerciciosbyMovementViewHolder  (CategoriaEjerciciosViewHolder: View) :
    RecyclerView.ViewHolder(CategoriaEjerciciosViewHolder) {

    val binding = MovementTypeRvItemBinding.bind(
        CategoriaEjerciciosViewHolder
    )

    fun render(item: tipo_movimientoEntity, onClickItemSelected: (tipo_movimientoEntity) -> Unit) {
        Picasso.get().load(item.url_image_movimiento).into(binding.idIVmovementType)
        binding.idTVmovementType.text = item.movimiento
        itemView.setOnClickListener {
            onClickItemSelected(item)
        }
    }

}
