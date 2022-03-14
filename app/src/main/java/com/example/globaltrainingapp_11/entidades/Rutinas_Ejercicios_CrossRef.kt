package com.example.globaltrainingapp_11.entidades
import androidx.room.Entity
import kotlinx.serialization.Serializable



@Entity (tableName = "rutinas_ejercicios",  primaryKeys = ["id_rutinas","id_ejercicios"])
    @Serializable
    data class Rutinas_Ejercicios_CrossRef (

        val id_rutinas: Int,
        val id_ejercicios: Int

    ) {

}