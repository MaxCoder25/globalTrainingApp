package com.example.globaltrainingapp_11.casosUso


import com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class tipo_movimientoUseCase {


    private var categoriasTipoDeMovimiento = listOf<tipo_movimientoEntity>()


    suspend fun getAllCategoriesbyMovement(): List<tipo_movimientoEntity> {
        val db = globalTrainingApp.getDatabase()
        return db.ejerciciosDao().getAllCategoriesbyMovement()
    }




}