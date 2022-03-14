package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.EjerciciosUseCase
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity

class EjerciciosBL {

    suspend fun getEjerciciosList(): List<EjerciciosEntity> {
        return EjerciciosUseCase().getAllEjercicios()
    }

    suspend fun getEjerciciosByTipoMovimiento(TipoMovimiento: String): List<EjerciciosEntity> {
        return EjerciciosUseCase().getEjerciciosByTipoMovimiento(TipoMovimiento)
    }
}