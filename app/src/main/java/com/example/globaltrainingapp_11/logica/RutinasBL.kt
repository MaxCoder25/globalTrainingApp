package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.CategoriaRutinasUseCase
import com.example.globaltrainingapp_11.casosUso.RutinasUseCase
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity

class RutinasBL {

    suspend fun getRutinasList(category: String): List<RutinasEntity> {
        return RutinasUseCase().getAllRutinas(category)
    }


    fun getOneRutinas(): CategoriaRutinasEntity {
        val r = (0..3).random()
        return CategoriaRutinasUseCase().getAllCategoriaRutinas()[r]
    }
}