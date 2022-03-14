package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.CategoriaRutinasUseCase
import com.example.globaltrainingapp_11.casosUso.RutinasUseCase
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones

class RutinasBL {

    suspend fun getRutinasList(category: String): List<RutinasEntity> {
        return RutinasUseCase().getAllRutinas(category)
    }

    suspend fun getCategoriaRutinas(category: String): CategoriaRutinasEntity {
        return CategoriaRutinasUseCase().getCategoriaRutinas(category)
    }

    suspend fun updateSemanaRutinas(id_rutinas: Int, dia: String) {
        CategoriaRutinasUseCase().updateSemanaRutinas(id_rutinas, dia)
    }



}