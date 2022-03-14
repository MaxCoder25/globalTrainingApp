package com.example.globaltrainingapp_11.entidades

import androidx.room.Embedded
import androidx.room.Relation


data class SemanaRutinas_Rutinas_Relaciones(
    @Embedded val semanaRutinas: SemanaRutinasEntity,
    @Relation (
        parentColumn = "id_rutinas",
        entityColumn = "id_rutinas"

            )

    val rutinas: RutinasEntity


)
