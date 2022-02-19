package com.example.globaltrainingapp_11.entidades
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable
import java.sql.Time

/*
@Serializable
data class Rutinas_Ejercicios_Entity (
    val id: Int = 0,
    val id_rutina: Int,
    val id_ejerc: Int,
    val repeticiones: Int
    ){
*/

@Entity (tableName = "rutinas_ejercicios",  primaryKeys = ["id_rutinas","id_ejercicios"])
    @Serializable
    data class Rutinas_Ejercicios_CrossRef (

        val id_rutinas: Int,
        val id_ejercicios: Int

    ) {

}