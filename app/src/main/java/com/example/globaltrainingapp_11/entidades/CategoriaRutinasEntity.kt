package com.example.globaltrainingapp_11.entidades
import kotlinx.serialization.Serializable



@Serializable
data class CategoriaRutinasEntity (
                                   val id: Int = 0,
                                   val nombre: String,
                                   val descripcion: String,
                                   val cantidad:Int ){



}