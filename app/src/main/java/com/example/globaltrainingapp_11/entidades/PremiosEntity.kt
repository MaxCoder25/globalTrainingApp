package com.example.globaltrainingapp_11.entidades
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "premios")
@Serializable
data class PremiosEntity (
    @PrimaryKey(autoGenerate = true)
    val id_premio: Int = 0,
    val premio: String,
    val ubicacion: String,
    val codigoRetiro: String,
    val img_premio: String
    ){



}