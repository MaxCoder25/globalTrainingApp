package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.ExercisesByMovementTypeRvItemBinding
import com.example.globaltrainingapp_11.databinding.FragmentEjerciciosListBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.squareup.picasso.Picasso


class ListEjerciciosAdapter(val listEjercicios: List<EjerciciosEntity>,private val onClickItemSelected: (EjerciciosEntity) -> Unit) : RecyclerView.Adapter<EjerciciosViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EjerciciosViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.exercises_by_movement_type_rv_item , parent, false)
        return EjerciciosViewHolder(view)
    }

    override fun onBindViewHolder(holder: EjerciciosViewHolder, position: Int) {
        val item =  listEjercicios[position]
        holder.render(item, onClickItemSelected)
    }

    override fun getItemCount(): Int = listEjercicios.size
}

class EjerciciosViewHolder (EjerciciosViewHolder: View) : RecyclerView.ViewHolder(EjerciciosViewHolder) {

    val binding = ExercisesByMovementTypeRvItemBinding.bind(EjerciciosViewHolder)


    fun render(item : EjerciciosEntity , onClickItemSelected: (EjerciciosEntity) -> Unit) {



        Picasso.get().load(item.imagen).into(binding.idIVExerciseBymovementType)
        binding.idTVExerciseBymovementTypeLevel.text =  item.nivel
        binding.idTVExerciseBymovementTypeLevel.text =  item.nombreEjercicio


        itemView.setOnClickListener {
            onClickItemSelected(item)
        }


    }

}
