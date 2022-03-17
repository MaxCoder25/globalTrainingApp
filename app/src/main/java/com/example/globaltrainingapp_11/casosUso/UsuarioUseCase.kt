package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.NivelesEntity
import com.example.globaltrainingapp_11.entidades.PremiosEntity
import com.example.globaltrainingapp_11.entidades.Usuarios
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class UsuarioUseCase {

    suspend fun getUserNameAndPass(name: String, pass: String): Int {
        var us = Usuarios
        var id_usuarioBuscado = 1
        val listaUsuarios = globalTrainingApp.getDatabase().usuariosDao().getAllUsuarios()

        listaUsuarios.forEach() {
            if (it.nicknameUsuario== name && it.passwordUsuario == pass) {
                id_usuarioBuscado = it.idUsuario
            }
        }
        return id_usuarioBuscado
    }






    suspend fun getAllUsuarios(): List<Usuarios> {

        val db = globalTrainingApp.getDatabase()
        return db.usuariosDao().getAllUsuarios()

    }


    suspend fun getOneUsuario(idUsuario: Int): Usuarios {

        return globalTrainingApp.getDatabase().usuariosDao().getOneUsuario(idUsuario)

    }

    suspend fun getNivelById(idNivel: Int): NivelesEntity {

        return globalTrainingApp.getDatabase().usuariosDao().getNivelById(idNivel)

    }

    suspend fun updateNivel_IN_UsuarioById(idNivel: Int, idUsuario: Int) {

        val db = globalTrainingApp.getDatabase()
        return db.usuariosDao().updateNivel_IN_UsuarioById(idNivel, idUsuario)

    }

    suspend fun getPremioById(id_premio: Int): PremiosEntity {

        return globalTrainingApp.getDatabase().usuariosDao().getPremioById(id_premio)

    }


    suspend fun updatePremio_IN_UsuarioById(id_premio: Int, idUsuario: Int) {


        return globalTrainingApp.getDatabase().usuariosDao()
            .updatePremio_IN_UsuarioById(id_premio, idUsuario)

    }





}