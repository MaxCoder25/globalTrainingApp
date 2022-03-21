package com.example.globaltrainingapp_11.data.database.dao

import androidx.room.*
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones
import com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity

@Dao
interface EjerciciosDAO {

    @Query("SELECT * FROM ejercicios")
    suspend fun getAllEjercicios(): List<EjerciciosEntity>

    @Query("SELECT * FROM ejercicios WHERE id_ejercicios = :idEjercicio")
    suspend fun getEjerciciosById(idEjercicio: Int): EjerciciosEntity

    @Query("SELECT * FROM ejercicios WHERE categoria = :EjerciciosCategory")
    suspend fun getEjerciciosByCategory (EjerciciosCategory: String): List<EjerciciosEntity>

    @Query("SELECT * FROM ejercicios WHERE tipo_movimiento = :EjerciciosTipoMovimiento")
    suspend fun getEjerciciosByTipoMovimiento(EjerciciosTipoMovimiento: String): List<EjerciciosEntity>


    //Query para La lista de Ejercicios segun su tipo de movimiento
    @Query("SELECT * FROM tipo_movimiento")
    suspend fun getAllCategoriesbyMovement(): List<tipo_movimientoEntity>




    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEjercicios (ejercicio: EjerciciosEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateEjercicios(ejercicio: EjerciciosEntity)

  //  @Delete()
  //  suspend fun deleteOneEjercicios(ejercicio: EjerciciosEntity)

  //  @Query("DELETE FROM ejercicios")
   // suspend fun cleanDbEjercicios()

 //   @Query("DELETE FROM ejercicios WHERE id_ejercicios = :idEjercicios")
   // suspend fun deleteEjerciciosById(idEjercicios: Int)



    //Nuevas querys, muchos a muchos
    @Transaction
    @Query ("SELECT * FROM rutinas")
    fun getRutinas_Ejercicios_Relaciones(): List <Rutinas_Ejercicios_Relaciones>


    @Transaction
    @Query ("SELECT * FROM rutinas  WHERE id_rutinas =:id_rutinas")
    fun getRutinas_Ejercicios_RelacionesFiltradas(id_rutinas: Int): List <Rutinas_Ejercicios_Relaciones>


}