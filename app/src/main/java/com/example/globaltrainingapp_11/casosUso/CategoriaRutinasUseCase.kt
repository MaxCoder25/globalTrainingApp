package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity

class CategoriaRutinasUseCase {

    private val rutinasList = listOf<CategoriaRutinasEntity>(
        CategoriaRutinasEntity(
            1,
            "Full body ",
            "Rutinas diseñadas para ganar fuerza en todo el cuerpo",
          5
        ),
        CategoriaRutinasEntity(
            2,
            "GRUPOS MUSCULARES",
            "Rutinas diseñadas para ganar fuerza de manera mas especifica",
            10
        ),

        CategoriaRutinasEntity(
            3,
            "KETTLEBELLS",
            "Rutinas con pesas rusas para ganar potencia y movilida",
            12
        ),
        CategoriaRutinasEntity(
            4,
            "ANILLAS",
            "Rutinas con anillas de gimnasia para retar el equilibrio y ganar mayor fuerza en el cuerpo superior y en el core ",
            6
        )

        )

    fun getAllCategoriaRutinas(): List<CategoriaRutinasEntity> {
        return rutinasList
    }


}