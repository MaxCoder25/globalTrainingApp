package com.example.globaltrainingapp_11.logica


import com.example.globaltrainingapp_11.casosUso.tipo_movimientoUseCase
import com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity

class tipo_movimientoBL {

    suspend fun getCategoriesMovementList(): List<tipo_movimientoEntity> {
        return tipo_movimientoUseCase().getAllCategoriesbyMovement()
    }

}