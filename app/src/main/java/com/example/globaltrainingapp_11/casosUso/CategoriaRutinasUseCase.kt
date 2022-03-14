package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class CategoriaRutinasUseCase {



    suspend fun getCategoriaRutinas(

        category: String

    ): CategoriaRutinasEntity {

        val db = globalTrainingApp.getDatabase()

      var  CatrutinasList = db.rutinasDao().getCategoriaRutinas(category)


        return CatrutinasList
    }

    suspend fun updateSemanaRutinas(id_rutinas: Int, dia: String) {
        globalTrainingApp.getDatabase().rutinasDao ().updateSemanaRutinas(id_rutinas, dia)
    }




}