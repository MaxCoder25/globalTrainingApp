package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class Rutinas_Ejercicios_UseCase {


    private var rutina_ejercicio_Filtrada2 = listOf<Rutinas_Ejercicios_Relaciones>()


fun getRutinas_Ejercicios2(
    id_Rutina: Int,

    ): List<EjerciciosEntity> {

      val db = globalTrainingApp.getDatabase()

       rutina_ejercicio_Filtrada2= db.ejerciciosDao().getRutinas_Ejercicios_RelacionesFiltradas(id_Rutina)
     val  soloEjercicios= rutina_ejercicio_Filtrada2.component1().ejercicios


    return soloEjercicios
}


}