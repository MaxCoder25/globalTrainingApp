package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.CategoriaRutinasUseCase
import com.example.globaltrainingapp_11.casosUso.RutinasUseCase
import com.example.globaltrainingapp_11.casosUso.Rutinas_Ejercicios_UseCase
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Entity

class Rutinas_Ejercicios_BL {

    fun getRutinas_EjerciciosList(id_Rutina: Int): List<Rutinas_Ejercicios_Entity> {
        return Rutinas_Ejercicios_UseCase().getRutinas_Ejercicios(id_Rutina)
    }


}