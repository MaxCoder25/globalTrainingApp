package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class RutinasUseCase {


    private var rutinasFiltradas = listOf<RutinasEntity>()

    suspend fun  getRutinasById (
        id_rutinas: Int
    ):
            RutinasEntity  {

        return globalTrainingApp.getDatabase().rutinasDao().getRutinasById(id_rutinas)
    }


    suspend fun getAllRutinas(
        category: String

    ): List<RutinasEntity> {

        val db = globalTrainingApp.getDatabase()

     rutinasFiltradas= db.rutinasDao().getAllRutinas().filter { it.categoria == category }


        return rutinasFiltradas
    }



}