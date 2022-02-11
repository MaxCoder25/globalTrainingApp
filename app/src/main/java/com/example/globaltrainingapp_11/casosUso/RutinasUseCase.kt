package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.RutinasEntity

class RutinasUseCase {

    private val rutinasList = listOf<RutinasEntity>(
        RutinasEntity(
            1,
            "Brazos y piernas",
            "FULL_BODY",
            "Básico",
            "Biceps, Triceps, Cuadriceps, Gluteos",
            30,
            "Flexiones normales, Dominadas pronas, Sentadillas, Levantamientos de cadera"
        ),
        RutinasEntity(
            2,
            "GLOBAL Core",
            "FULL_BODY",
            "Básico",
            "Biceps, Triceps, Cuadriceps, Gluteos, Core",
            30,
            "Flexiones abiertas, Dominadas pronas, Sentadillas, Plancha, Burpee"
        ),
        RutinasEntity(
            3,
            "PUSH / PULL",
            "CUERPO_SUPERIOR",
            "Básico",
            "Biceps, Triceps, Pectorales",
            40,
            "Flexiones normales, Dominadas pronas, Flexion Hindu, Remos en mesa"
        ),

    RutinasEntity(
    4,
    "PIERNAS ROBUSTAS",
    "PIERNAS",
    "Avanzado",
    "Cuadriceps, Gluteos, GEMELOS",
    40,
        " Sentadillas, Zancadas, Levantamientos de cadera, Levantamientos de pantorrilla"
    ),

        RutinasEntity(
            5,
            "300",
            "KETTLEBELLS",
            "Intermedio",
            "Biceps, Triceps, Cuadriceps, Gluteos",
            25,
            "Snatch, Thruster, Swing, Flexiones normales, Dominadas pronas, Burpees, Squat en rack, "
        ),
        )



    private var rutinasFiltradas = listOf<RutinasEntity>()



    /*     original
    fun getAllRutinas(): List<RutinasEntity> {
        return rutinasList
    }
*/
    fun getAllRutinas(
        category: String,
        page: Int,
    ): List<RutinasEntity> {

        //rutinasFiltradas  = rutinasList.subList(0,2)
        rutinasFiltradas= rutinasList.filter { it.categoria == category }


        return rutinasFiltradas
    }

}