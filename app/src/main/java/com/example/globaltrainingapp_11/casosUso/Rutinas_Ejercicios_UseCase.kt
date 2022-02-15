package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Entity

class Rutinas_Ejercicios_UseCase {

    private val rutinas_ejerciciosList = listOf<Rutinas_Ejercicios_Entity>(
        Rutinas_Ejercicios_Entity(
            1,
            1,
          1,
            12,
         ),
        Rutinas_Ejercicios_Entity(
            2,
            1,
            2,
            8,
        ),
        Rutinas_Ejercicios_Entity(
            3,
            1,
            3,
            15,
        ),

        Rutinas_Ejercicios_Entity(
            4,
            2,
            1,
            10,
        ),

        Rutinas_Ejercicios_Entity(
            5,
            2,
            2,
            14,
        ),
        )



    private var rutina_ejercicio_Filtrada = listOf<Rutinas_Ejercicios_Entity>()



    /*     original
    fun getAllRutinas(): List<RutinasEntity> {
        return rutinasList
    }
*/
    fun getRutinas_Ejercicios(
        id_Rutina: Int,

    ): List<Rutinas_Ejercicios_Entity> {

        rutina_ejercicio_Filtrada= rutinas_ejerciciosList.filter { it.id_rutina == id_Rutina}


        return rutina_ejercicio_Filtrada
    }

}