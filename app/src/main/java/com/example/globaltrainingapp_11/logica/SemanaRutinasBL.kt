package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.RutinasUseCase
import com.example.globaltrainingapp_11.casosUso.SemanaRutinasUseCase
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones

class SemanaRutinasBL {

    suspend fun getSemanaRutinas(): List<SemanaRutinas_Rutinas_Relaciones> {
        return SemanaRutinasUseCase().getSemanaRutinas()
    }

}