package com.example.globaltrainingapp_11.data.database.dao

import androidx.room.*
import com.example.globaltrainingapp_11.entidades.RutinasEntity

@Dao
interface RutinasDAO {

    @Query("SELECT * FROM rutinas")
    suspend fun getAllRutinas(): List<RutinasEntity>

    @Query("SELECT * FROM rutinas WHERE id = :idNews")
    suspend fun getRutinasById(idNews: Int): RutinasEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRutinas(news: RutinasEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateRutinas(news: RutinasEntity)

    @Delete()
    suspend fun deleteOneRutinas(news: RutinasEntity)

    @Query("DELETE FROM rutinas")
    suspend fun cleanDbRutinas()

    @Query("DELETE FROM rutinas WHERE id = :idRutinas")
    suspend fun deleteRutinasById(idRutinas: Int)

}