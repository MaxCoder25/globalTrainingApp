package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class EjerciciosUseCase {

    private var ejerciciosPorTipoDeMovimiento = listOf<EjerciciosEntity>()


     suspend fun getAllEjercicios(): List<EjerciciosEntity> {
         val db = globalTrainingApp.getDatabase()
         return db.ejerciciosDao().getAllEjercicios()
     }



    suspend fun getEjerciciosByTipoMovimiento(
        TipoMovimiento: String,

    ): List<EjerciciosEntity> {

        val db = globalTrainingApp.getDatabase()

        ejerciciosPorTipoDeMovimiento= db.ejerciciosDao().getEjerciciosByTipoMovimiento(TipoMovimiento)



        return ejerciciosPorTipoDeMovimiento
    }


}