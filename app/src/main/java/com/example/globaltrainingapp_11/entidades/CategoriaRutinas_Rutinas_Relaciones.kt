package com.example.globaltrainingapp_11.entidades

import androidx.room.Embedded
import androidx.room.Relation


data class CategoriaRutinas_Rutinas_Relaciones(
    @Embedded val categoriarutinas: CategoriaRutinasEntity ,
    @Relation (
        parentColumn = "nombre",
        entityColumn = "categoria",

            )

    val rutinas: RutinasEntity





)
