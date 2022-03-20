package com.example.globaltrainingapp_11.data.database.dao

import androidx.room.*
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones

@Dao
interface RutinasDAO {

    @Query("SELECT * FROM rutinas")
    suspend fun getAllRutinas(): List<RutinasEntity>

    @Query("SELECT * FROM rutinas WHERE id_rutinas = :idRutina")
    suspend fun getRutinasById(idRutina: Int): RutinasEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRutinas(Rutina: RutinasEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateRutinas(Rutina: RutinasEntity)

    @Delete()
    suspend fun deleteOneRutinas(Rutina: RutinasEntity)

   // @Query("DELETE FROM rutinas")
   // suspend fun cleanDbRutinas()

    @Query("DELETE FROM rutinas WHERE id_rutinas = :idRutinas")
    suspend fun deleteRutinasById(idRutinas: Int)


    // para pantalla inicio semana rutinas
    @Transaction
    @Query("SELECT * FROM semana_rutinas")
    suspend fun getSemanaRutinas(): List<SemanaRutinas_Rutinas_Relaciones>


    //para mostrar descripcion categoria rutinas

    @Transaction
    @Query("SELECT * FROM categoria_rutinas where nombre =:category ")
    suspend fun getCategoriaRutinas(category: String): CategoriaRutinasEntity




    @Query("UPDATE semana_rutinas SET id_rutinas=:id_rutinas WHERE dia = :dia")
   // @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateSemanaRutinas(id_rutinas: Int, dia: String)


}