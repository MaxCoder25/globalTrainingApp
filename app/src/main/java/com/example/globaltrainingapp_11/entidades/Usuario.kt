package com.example.globaltrainingapp_11.entidades

import java.util.*

data class Usuario(var id: String = "-1L", var nombre: String = "", var password: String = "") {
//comentario 2 prueba github
    constructor (nombre: String, password: String) : this() {
        this.nombre = nombre
        this.password = password
        this.id = UUID.randomUUID().toString()
    }
}