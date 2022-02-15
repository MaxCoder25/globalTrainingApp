package com.example.globaltrainingapp_11.entidades
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable
import java.sql.Time


@Entity(tableName = "rutinas")
@Serializable
data class RutinasEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val categoria: String,
    val nivel: String,
    val musculos: String,
    val tiempoMin: Int

    ){




}