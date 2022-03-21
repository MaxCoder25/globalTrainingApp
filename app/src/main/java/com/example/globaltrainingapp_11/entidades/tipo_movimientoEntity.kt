package com.example.globaltrainingapp_11.entidades

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "tipo_movimiento")
@Serializable
data class tipo_movimientoEntity(
    @PrimaryKey
    val id_tipo_movimiento: Int=0 ,
    val movimiento: String,
    val url_image_movimiento: String ){

    }

