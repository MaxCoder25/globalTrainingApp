package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class RutinasUseCase {

   /* private val rutinasList = listOf<RutinasEntity>(
        RutinasEntity(
            1,
            "Brazos y piernas",
            "FULL_BODY",
            "Básico",
            "Biceps, Triceps, Cuadriceps, Gluteos",
            30,
          //  "Flexiones normales, Dominadas pronas, Sentadillas, Levantamientos de cadera"
        ),
        RutinasEntity(
            2,
            "GLOBAL Core",
            "FULL_BODY",
            "Básico",
            "Biceps, Triceps, Cuadriceps, Gluteos, Core",
            40,
        //    "Flexiones abiertas, Dominadas pronas, Sentadillas, Plancha, Burpee"
        ),
        RutinasEntity(
            3,
            "PUSH / PULL",
            "CUERPO_SUPERIOR",
            "Básico",
            "Biceps, Triceps, Pectorales",
            40,
          //  "Flexiones normales, Dominadas pronas, Flexion Hindu, Remos en mesa"
        ),

    RutinasEntity(
    4,
    "PIERNAS ROBUSTAS",
    "PIERNAS",
    "Avanzado",
    "Cuadriceps, Gluteos, GEMELOS",
    40,
       // " Sentadillas, Zancadas, Levantamientos de cadera, Levantamientos de pantorrilla"
    ),

        RutinasEntity(
            5,
            "300",
            "KETTLEBELLS",
            "Intermedio",
            "Biceps, Triceps, Cuadriceps, Gluteos",
            25,
            //"Snatch, Thruster, Swing, Flexiones normales, Dominadas pronas, Burpees, Squat en rack, "
        ),
        RutinasEntity(
            6,
            "Venganza Dr burpee",
            "FULL_BODY",
            "Intermedio",
            "Biceps, Triceps, Cuadriceps, Gluteos",
            25,
          //  " Burpees"
        ),
        )

*/

    private var rutinasFiltradas = listOf<RutinasEntity>()



    /*     original
    fun getAllRutinas(): List<RutinasEntity> {
        return rutinasList
    }
*/

   /* suspend fun getAllRutinas(): List<RutinasEntity> {
        val db = globalTrainingApp.getDatabase()
        return db.rutinasDao().getAllRutinas()
    }
*/

    suspend fun getAllRutinas(
        category: String,
        page: Int,
    ): List<RutinasEntity> {
        //val db = globalTrainingApp.getDatabase()
           // db.rutinasDao().getAllRutinas()
        val db = globalTrainingApp.getDatabase()

     rutinasFiltradas= db.rutinasDao().getAllRutinas().filter { it.categoria == category }


        return rutinasFiltradas
    }

}