package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.NivelesEntity
import com.example.globaltrainingapp_11.entidades.PremiosEntity
import com.example.globaltrainingapp_11.entidades.Usuarios
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class UsuarioUseCase {

    suspend fun getUserNameAndPass(nick: String, pass: String): Int {
        var us = Usuarios
        var id_usuarioBuscado = 0
        val listaUsuarios = globalTrainingApp.getDatabase().usuariosDao().getAllUsuarios()

        listaUsuarios.forEach() {
            if (it.nicknameUsuario== nick && it.passwordUsuario == pass) {
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


    suspend fun updateRutinasCompletadas_IN_UsuarioById(rutinasCompletadas: Int, idUsuario: Int) {


        return globalTrainingApp.getDatabase().usuariosDao()
            .updateRutinasCompletadas_IN_UsuarioById(rutinasCompletadas, idUsuario)

    }


    suspend fun updatePuntos_IN_UsuarioById(puntos: Int, idUsuario: Int) {


        return globalTrainingApp.getDatabase().usuariosDao()
            .updatePuntos_IN_UsuarioById(puntos, idUsuario)

    }




    suspend fun insertNuevoUsuario_Register(nombreUsuario: String ,edadUsuario: Int ,emailUsuario: String,
                                            nicknameUsuario: String, passwordUsuario: String,
                                            ) {

        var rutinasCompletadas = 0
        var puntos = 0
        var nivel = 1
        var premios = 0

        return globalTrainingApp.getDatabase().usuariosDao()
            .insertNuevoUsuario_Register(nombreUsuario ,edadUsuario ,emailUsuario,
                nicknameUsuario, passwordUsuario,
                rutinasCompletadas, puntos, nivel,
                premios )

    }
}