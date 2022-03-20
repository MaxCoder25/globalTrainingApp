package com.example.globaltrainingapp_11.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.NivelesEntity
import com.example.globaltrainingapp_11.entidades.PremiosEntity
import com.example.globaltrainingapp_11.entidades.Usuarios


@Dao
interface UsuariosDAO {

    @Query("SELECT * FROM usuarios")
    suspend fun getAllUsuarios(): List<Usuarios>


    @Query("SELECT * FROM usuarios WHERE idUsuario = :idUsuario")
    suspend fun getOneUsuario(idUsuario: Int): Usuarios


    //niveles
    @Transaction
    @Query("SELECT * FROM niveles where id_nivel =:id_nivel ")
    suspend fun getNivelById(id_nivel: Int): NivelesEntity


    @Query("UPDATE usuarios SET nivel=:id_nivel WHERE idUsuario = :idUsuario")
    // @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNivel_IN_UsuarioById(id_nivel: Int, idUsuario: Int)


    //premios

    @Transaction
    @Query("SELECT * FROM premios where id_premio =:id_premio ")
    suspend fun getPremioById(id_premio: Int): PremiosEntity


    @Query("UPDATE usuarios SET premios=:id_premio WHERE idUsuario = :idUsuario")
    // @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updatePremio_IN_UsuarioById(id_premio: Int, idUsuario: Int)


    @Query("UPDATE usuarios SET rutinasCompletadas=:rutinasCompletadas WHERE idUsuario = :idUsuario")
    // @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateRutinasCompletadas_IN_UsuarioById(rutinasCompletadas: Int, idUsuario: Int)

    @Query("UPDATE usuarios SET puntos=:puntos WHERE idUsuario = :idUsuario")
    // @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updatePuntos_IN_UsuarioById(puntos: Int, idUsuario: Int)

    @Query("INSERT INTO usuarios (nombreUsuario, edadUsuario,emailUsuario, nicknameUsuario, passwordUsuario, rutinasCompletadas, puntos, nivel, premios) values (:nombreUsuario,:edadUsuario,:emailUsuario, :nicknameUsuario, :passwordUsuario, :rutinasCompletadas, :puntos,:nivel,:premios)"  )
    suspend fun insertNuevoUsuario_Register(nombreUsuario: String ,edadUsuario: Int ,emailUsuario: String, nicknameUsuario: String, passwordUsuario: String, rutinasCompletadas: Int, puntos: Int, nivel: Int, premios: Int)



}