package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentRutinasEntrenamientoListSinBotonCambioEjercBinding
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.squareup.picasso.Picasso


class ListRutinas_Ejercicios_Adapter_Sin_Boton_Cambio_Ejerc(val listRutinas_Ejercicios: List<EjerciciosEntity>) : RecyclerView.Adapter<Rutinas_EjerciciosViewHolder_Sin_Boton_Cambio_Ejerc>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Rutinas_EjerciciosViewHolder_Sin_Boton_Cambio_Ejerc {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(
            R.layout.fragment_rutinas_entrenamiento_list_sin_boton_cambio_ejerc,
            parent,
            false
        )
        return Rutinas_EjerciciosViewHolder_Sin_Boton_Cambio_Ejerc(view)
    }

    override fun onBindViewHolder(holder: Rutinas_EjerciciosViewHolder_Sin_Boton_Cambio_Ejerc, position: Int) {
        val item = listRutinas_Ejercicios[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listRutinas_Ejercicios.size


}

    class Rutinas_EjerciciosViewHolder_Sin_Boton_Cambio_Ejerc(Rutinas_EjerciciosViewHolder: View) :
        RecyclerView.ViewHolder(Rutinas_EjerciciosViewHolder) {

        val binding = FragmentRutinasEntrenamientoListSinBotonCambioEjercBinding.bind(
            Rutinas_EjerciciosViewHolder
        )

        fun render(item: EjerciciosEntity) {

            binding.etiquetaEjercicio.text = item.nombreEjercicio
            binding.etiquetaRepeticiones.text = "Reps: " + item.repeticiones
            Picasso.get().load(item.imagen).into(binding.imgEjerc)


        }



    }


