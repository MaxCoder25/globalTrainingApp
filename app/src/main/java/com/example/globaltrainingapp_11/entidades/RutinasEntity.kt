package com.example.globaltrainingapp_11.entidades
import kotlinx.serialization.Serializable
import java.sql.Time


@Serializable
data class RutinasEntity (
    val id: Int = 0,
    val nombre: String,
    val categoria: String,
    val nivel: String,
    val musculos: String,
    val tiempoMin: Int,
    val ejercicios: String

    ){



}