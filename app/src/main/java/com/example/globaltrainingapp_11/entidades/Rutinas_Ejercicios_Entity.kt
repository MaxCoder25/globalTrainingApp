package com.example.globaltrainingapp_11.entidades
import kotlinx.serialization.Serializable
import java.sql.Time


@Serializable
data class Rutinas_Ejercicios_Entity (
    val id: Int = 0,
    val id_rutina: Int,
    val id_ejerc: Int,
    val repeticiones: Int
    ){



}