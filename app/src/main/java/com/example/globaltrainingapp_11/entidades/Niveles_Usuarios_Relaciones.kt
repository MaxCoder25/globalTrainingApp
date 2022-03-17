package com.example.globaltrainingapp_11.entidades

import androidx.room.Embedded
import androidx.room.Relation


data class Niveles_Usuarios_Relaciones(
    @Embedded val nivel: NivelesEntity ,
    @Relation (
        parentColumn = "id_nivel",
        entityColumn = "nivel",

            )

    val usuario: Usuarios





)
