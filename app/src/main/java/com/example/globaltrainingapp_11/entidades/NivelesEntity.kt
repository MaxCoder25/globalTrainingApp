package com.example.globaltrainingapp_11.entidades
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "niveles")
@Serializable
data class NivelesEntity (
    @PrimaryKey(autoGenerate = true)
    val id_nivel: Int = 0,
    val nivel: String
    ){



}