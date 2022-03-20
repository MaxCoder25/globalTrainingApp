package com.example.globaltrainingapp_11.entidades

import androidx.room.Embedded
import androidx.room.Relation


data class Premios_Usuarios_Relaciones(
    @Embedded val premio: PremiosEntity ,
    @Relation (
        parentColumn = "id_premio",
        entityColumn = "premios",

            )

    val usuario: Usuarios





)
