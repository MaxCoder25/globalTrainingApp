package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.R
import com.example.globaltrainingapp_11.databinding.FragmentRutinasBinding
import com.example.globaltrainingapp_11.databinding.FragmentRutinasEntrenamientoListBinding
import com.example.globaltrainingapp_11.databinding.FragmentRutinasListBinding
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Entity


class ListRutinas_Ejercicios_Adapter(val listRutinas_Ejercicios: List<Rutinas_Ejercicios_Entity>,private val onClickItemSelected: (Rutinas_Ejercicios_Entity) -> Unit) : RecyclerView.Adapter<Rutinas_EjerciciosViewHolder>() {


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
//    val binding2 = FragmentRutinasBinding.bind(RutinasViewHolder)

    fun render(item : Rutinas_Ejercicios_Entity , onClickItemSelected: (Rutinas_Ejercicios_Entity) -> Unit) {

        binding.etiquetaEjercicio.text = "Ejercicio: "+item.id_ejerc.toString()
        binding.etiquetaRepeticiones.text = "Reps: "+item.repeticiones.toString()
        //binding.imgEjerc.añadirImagen = item.imagenjpg


        itemView.setOnClickListener {
            onClickItemSelected(item)
        }


    }
   /* fun render2(item : CategoriaRutinasEntity) {

        binding2.txtTitulo2.text=item.nombre
    }*/
}
