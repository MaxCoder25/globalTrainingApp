package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.Usuario

class UsuarioUseCase {

    private val usuariosDb = listOf<Usuario>(
        Usuario("ADMIN", "admin"),
        Usuario("MAC", "mac123"),

    )

    fun getUserNameAndPass(name: String, pass: String): Usuario {
        var us = Usuario()

        usuariosDb.forEach() {
            println(it)
            if (it.nombre == name && it.password == pass) {
                us = it
            }
        }
        return us
    }


}