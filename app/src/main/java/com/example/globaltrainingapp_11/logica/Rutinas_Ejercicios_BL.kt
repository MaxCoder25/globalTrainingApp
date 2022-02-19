package com.example.globaltrainingapp_11.logica

import com.example.globaltrainingapp_11.casosUso.Rutinas_Ejercicios_UseCase
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_CrossRef
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones

class Rutinas_Ejercicios_BL {

    fun getRutinas_EjerciciosList(id_Rutina: Int): List<EjerciciosEntity> {
        return Rutinas_Ejercicios_UseCase().getRutinas_Ejercicios2(id_Rutina)
    }


}