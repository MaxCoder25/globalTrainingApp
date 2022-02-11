package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.CategoriaRutinasUseCase
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity

class CategoriaRutinasBL {

    fun getCategoriaRutinasList(): List<CategoriaRutinasEntity> {
        return CategoriaRutinasUseCase().getAllCategoriaRutinas()
    }

    fun getOneCategoriaRutinas(): CategoriaRutinasEntity {
        val r = (0..3).random()
        return CategoriaRutinasUseCase().getAllCategoriaRutinas()[r]
    }
}