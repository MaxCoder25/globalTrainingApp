package com.example.globaltrainingapp_11.entidades

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "usuarios")
@Serializable
data class Usuarios(
    @PrimaryKey(autoGenerate = true)
    val idUsuario: Int=0,
    val nombreUsuario: String,
    val edadUsuario:Int,
    val emailUsuario:String,
    val nicknameUsuario:String,
    val passwordUsuario:String
){

}