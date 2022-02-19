package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class EjerciciosUseCase {

   /* private val ejerciciosList = listOf<EjerciciosEntity>(
    EjerciciosEntity(
    1,
    "Flexiones normales",
    "CUERPO_SUPERIOR",
    10,
    "EMPUJE",
        "flex.jpg"
    ),
    EjerciciosEntity(
    2,
    "Burpee",
    "FULL_BODY",
    15,
    "FULL_BODY",
        "flex1.jpg"
    ),
    EjerciciosEntity(
    3,
    "Sentadillas",
    "PIERNAS",
    20,
    "DOMINANTE_DE_RODILLA",
        "flex2.jpg"
    ),

    EjerciciosEntity(
    4,
    "Levantamientos de cadera",
    "PIERNAS",
    15,
    "DOMINANTE_DE_CADERA",
        "flex3.jpg"
    ),

    EjerciciosEntity(
    5,
    "Plancha",
    "FULL_BODY",
    30,
    "ESTABILIZACION_ESTATICA",
        "flex4.jpg"

    ),
        EjerciciosEntity(
            5,
            "Dominada prona",
            "CUERPO_SUPERIOR",
            8,
            "JALAR",
            "flex4.jpg"

        ),
        EjerciciosEntity(
            5,
            "ABS colgado (rodillas dobladas)",
            "CUERPO_SUPERIOR",
            12,
            "ESTABILIZACION_DINAMICA",
            "flex4.jpg"

        ),
    )

*/

    private var ejerciciosFiltrados = listOf<EjerciciosEntity>()




     suspend fun getAllEjercicios(): List<EjerciciosEntity> {
         val db = globalTrainingApp.getDatabase()
         return db.ejerciciosDao().getAllEjercicios()
     }


    suspend fun getEjerciciosByCategory(
        category: String,
        page: Int,
    ): List<EjerciciosEntity> {

        val db = globalTrainingApp.getDatabase()

        ejerciciosFiltrados= db.ejerciciosDao().getAllEjercicios().filter { it.categoria == category }



        return ejerciciosFiltrados
    }


}