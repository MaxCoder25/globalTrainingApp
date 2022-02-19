package com.example.globaltrainingapp_11.entidades
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable
import java.sql.Time

@Entity (tableName = "ejercicios")
@Serializable
data class EjerciciosEntity (
    @PrimaryKey(autoGenerate = true)
    val id_ejercicios: Int = 0,
    val nombreEjercicio: String,
    val categoria: String,
    val repeticiones: Int,
    val tipo_movimiento: String,
    val imagen : String
    ){



}