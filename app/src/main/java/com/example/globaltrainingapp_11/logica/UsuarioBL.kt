package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.EjerciciosUseCase
import com.example.globaltrainingapp_11.casosUso.UsuarioUseCase
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.NivelesEntity
import com.example.globaltrainingapp_11.entidades.PremiosEntity
import com.example.globaltrainingapp_11.entidades.Usuarios
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class UsuarioBL {

    suspend fun LoginUser(nick: String, pass: String): Usuarios {
        var idUsuario = UsuarioUseCase().getUserNameAndPass(nick, pass)

        var UsuarioLogeado = UsuarioUseCase().getOneUsuario(idUsuario)

        return UsuarioLogeado
    }



    suspend fun getAllUsuarios(): List<Usuarios> {

      return  UsuarioUseCase().getAllUsuarios()

    }


    suspend fun getOneUsuario(idUsuario: Int): Usuarios {

        return  UsuarioUseCase().getOneUsuario(idUsuario)

    }


    suspend fun getNivelById(idNivel: Int): NivelesEntity {

        return  UsuarioUseCase().getNivelById(idNivel)

    }

    suspend fun updateNivel_IN_UsuarioById(idNivel: Int, idUsuario: Int) {

        return  UsuarioUseCase().updateNivel_IN_UsuarioById(idNivel, idUsuario)

    }

    suspend fun getPremioById(id_premio: Int): PremiosEntity {

        return  UsuarioUseCase().getPremioById(id_premio)

    }


    suspend fun updatePremio_IN_UsuarioById(id_premio: Int, idUsuario: Int) {


        return  UsuarioUseCase().updatePremio_IN_UsuarioById(id_premio, idUsuario)

    }

    suspend fun updateRutinasCompletadas_IN_UsuarioById(rutinasCompletadas: Int, idUsuario: Int) {


        return UsuarioUseCase().updateRutinasCompletadas_IN_UsuarioById(rutinasCompletadas, idUsuario)

    }


    suspend fun updatePuntos_IN_UsuarioById(puntos: Int, idUsuario: Int) {


        return UsuarioUseCase().updatePuntos_IN_UsuarioById(puntos, idUsuario)

    }

    suspend fun insertNuevoUsuario_Register(nombreUsuario: String ,edadUsuario: Int ,emailUsuario: String,
                                            nicknameUsuario: String, passwordUsuario: String,
    ) {

        return UsuarioUseCase().insertNuevoUsuario_Register(nombreUsuario ,edadUsuario ,emailUsuario,
                nicknameUsuario, passwordUsuario)

    }








}