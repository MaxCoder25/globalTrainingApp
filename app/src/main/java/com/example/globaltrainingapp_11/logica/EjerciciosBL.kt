package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.CategoriaRutinasUseCase
import com.example.globaltrainingapp_11.casosUso.EjerciciosUseCase
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity

class EjerciciosBL {

    suspend fun getEjerciciosList(): List<EjerciciosEntity> {
        return EjerciciosUseCase().getAllEjercicios()
    }

}