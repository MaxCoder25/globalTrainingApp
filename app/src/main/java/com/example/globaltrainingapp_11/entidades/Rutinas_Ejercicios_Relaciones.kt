package com.example.globaltrainingapp_11.entidades

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation


data class Rutinas_Ejercicios_Relaciones(
    @Embedded val rutinas: RutinasEntity,
    @Relation (
        parentColumn = "id_rutinas",
        entityColumn = "id_ejercicios",
        associateBy = Junction(Rutinas_Ejercicios_CrossRef::class)
            )

    val ejercicios: List<EjerciciosEntity>





)
