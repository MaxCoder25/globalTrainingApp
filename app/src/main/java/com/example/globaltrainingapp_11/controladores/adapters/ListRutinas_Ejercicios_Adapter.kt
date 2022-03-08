package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentRutinasEntrenamientoListBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.squareup.picasso.Picasso


class ListRutinas_Ejercicios_Adapter(val listRutinas_Ejercicios: List<EjerciciosEntity>, private val onClickItemSelected: (EjerciciosEntity) -> Unit) : RecyclerView.Adapter<Rutinas_EjerciciosViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Rutinas_EjerciciosViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.fragment_rutinas_entrenamiento_list , parent, false)
        return Rutinas_EjerciciosViewHolder(view)
    }

    override fun onBindViewHolder(holder: Rutinas_EjerciciosViewHolder, position: Int) {
        val item =  listRutinas_Ejercicios[position]
        holder.render(item, onClickItemSelected)
    }

    override fun getItemCount(): Int = listRutinas_Ejercicios.size
}

class Rutinas_EjerciciosViewHolder(Rutinas_EjerciciosViewHolder: View) : RecyclerView.ViewHolder(Rutinas_EjerciciosViewHolder) {

    val binding = FragmentRutinasEntrenamientoListBinding.bind(Rutinas_EjerciciosViewHolder)

    fun render(item: EjerciciosEntity, onClickItemSelected: (EjerciciosEntity) -> Unit) {

        binding.etiquetaEjercicio.text = item.nombreEjercicio
        binding.etiquetaRepeticiones.text = "Reps: " + item.repeticiones
        Picasso.get().load(item.imagen).into(binding.imgEjerc)


        binding.btnCambioEjercicio.setOnClickListener {
            onClickItemSelected(item)
        }


    }



}