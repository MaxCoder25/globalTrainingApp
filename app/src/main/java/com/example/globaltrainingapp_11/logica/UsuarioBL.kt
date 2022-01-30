package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.UsuarioUseCase

class UsuarioBL {

    fun LoginUser(name: String, pass: String): Boolean {
        var us = UsuarioUseCase().getUserNameAndPass(name, pass)
        return (us.id == "-1L")
    }
}