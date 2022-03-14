package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class SemanaRutinasUseCase {


    private var SemanaRutinas = listOf<SemanaRutinas_Rutinas_Relaciones>()


    suspend fun getSemanaRutinas(


    ): List<SemanaRutinas_Rutinas_Relaciones> {

        val db = globalTrainingApp.getDatabase()

        SemanaRutinas= db.rutinasDao().getSemanaRutinas()


        return SemanaRutinas
    }

}