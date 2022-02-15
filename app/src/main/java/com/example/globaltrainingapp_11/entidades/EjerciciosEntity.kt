package com.example.globaltrainingapp_11.entidades
import kotlinx.serialization.Serializable
import java.sql.Time


@Serializable
data class EjerciciosEntity (
    val id: Int = 0,
    val nombreEjercicio: String,
    val categoria: String,
    val repeticiones: Int,
    val tipo_movimiento: String,
    val imagen : String
    ){



}