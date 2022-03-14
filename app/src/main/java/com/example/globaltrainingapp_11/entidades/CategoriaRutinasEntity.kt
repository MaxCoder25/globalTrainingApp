package com.example.globaltrainingapp_11.entidades
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "categoria_rutinas")
@Serializable
data class CategoriaRutinasEntity (
    @PrimaryKey(autoGenerate = true)
    val id_catRutina: Int = 0,
    val nombre: String,
    val descripcion: String,
    val cantidad:Int ){



}