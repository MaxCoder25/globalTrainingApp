package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity

class CategoriaRutinasUseCase {

    private val CatrutinasList = listOf<CategoriaRutinasEntity>(
        CategoriaRutinasEntity(
            1,
            "FULL BODY",
            "Rutinas diseñadas para ganar fuerza en todo el cuerpo",
          5
        ),
        CategoriaRutinasEntity(
            2,
            "CUERPO SUPERIOR",
            "Rutinas diseñadas para ganar fuerza de manera mas especifica",
            11
        ),
    CategoriaRutinasEntity(
    3,
    "PIERNAS",
    "Rutinas diseñadas para ganar fuerza en las piernas",
    12
    ),

        CategoriaRutinasEntity(
            4,
            "KETTLEBELLS",
            "Rutinas con pesas rusas para ganar potencia y movilida",
            12
        ),
        CategoriaRutinasEntity(
            5,
            "ANILLAS",
            "Rutinas con anillas de gimnasia para retar el equilibrio y ganar fuerza en el torso y core ",
            6
        )

        )

    fun getAllCategoriaRutinas(): List<CategoriaRutinasEntity> {
        return CatrutinasList
    }

   /* fun getnCategoriaRutinas(): List<CategoriaRutinasEntity>{

        return CatrutinasList[i]
    }
*/
}