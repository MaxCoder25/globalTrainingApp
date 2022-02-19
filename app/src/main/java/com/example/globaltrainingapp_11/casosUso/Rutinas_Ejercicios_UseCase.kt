package com.example.globaltrainingapp_11.casosUso

import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_CrossRef
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones
import com.example.globaltrainingapp_11.utils.globalTrainingApp

class Rutinas_Ejercicios_UseCase {

   /* private val rutinas_ejerciciosList = listOf<Rutinas_Ejercicios_CrossRef>(
        Rutinas_Ejercicios_CrossRef(
            1,
            1,
          1,
            12,
         ),
        Rutinas_Ejercicios_CrossRef(
            2,
            1,
            2,
            8,
        ),
        Rutinas_Ejercicios_CrossRef(
            3,
            1,
            3,
            15,
        ),

        Rutinas_Ejercicios_CrossRef(
            4,
            2,
            1,
            10,
        ),

        Rutinas_Ejercicios_CrossRef(
            5,
            2,
            2,
            14,
        ),
        Rutinas_Ejercicios_CrossRef(
            6,
            3,
            4,
            8,
        ),
        Rutinas_Ejercicios_CrossRef(
            7,
            4,
            6,
            20,
        ),
        Rutinas_Ejercicios_CrossRef(
            8,
            4,
            1,
            12,
        ),
        Rutinas_Ejercicios_CrossRef(
            9,
            4,
            6,
            11,
        ),
        Rutinas_Ejercicios_CrossRef(
            10,
            4,
            5,
            18,
        ),
        )
*/


    private var rutina_ejercicio_Filtrada = listOf<Rutinas_Ejercicios_CrossRef>()



    /*     original
    fun getAllRutinas(): List<RutinasEntity> {
        return rutinasList
    }
*/

    private val rutinas_ejerciciosList2 = listOf<Rutinas_Ejercicios_Relaciones>()
    private var rutina_ejercicio_Filtrada2 = listOf<Rutinas_Ejercicios_Relaciones>()
    private var ejerciciosDeRutinas_Filtrados = listOf<EjerciciosEntity>()

    //----------------
fun getRutinas_Ejercicios2(
    id_Rutina: Int,

    ): List<EjerciciosEntity> {

    //  rutina_ejercicio_Filtrada= rutinas_ejerciciosList.filter { it.id_rutinas == id_Rutina}

    val db = globalTrainingApp.getDatabase()

       rutina_ejercicio_Filtrada2= db.ejerciciosDao().getRutinas_Ejercicios_RelacionesFiltradas(id_Rutina)
     val  soloEjercicios= rutina_ejercicio_Filtrada2. component1().ejercicios


    return soloEjercicios
}


    //------------------------------------------------------------
    fun getRutinas_Ejercicios3(
        id_Rutina: Int,

        ): List<Rutinas_Ejercicios_Relaciones> {

      //  rutina_ejercicio_Filtrada= rutinas_ejerciciosList.filter { it.id_rutinas == id_Rutina}

        val db = globalTrainingApp.getDatabase()

       // rutina_ejercicio_Filtrada2= db.ejerciciosDao().getRutinas_Ejercicios_Relaciones()
        rutina_ejercicio_Filtrada2= db.ejerciciosDao().getRutinas_Ejercicios_Relaciones().filter { it.rutinas.id_rutinas == id_Rutina }

        print (rutina_ejercicio_Filtrada2)


        return rutina_ejercicio_Filtrada2
    }

//------------------------------------------------------------
   /* fun getRutinas_Ejercicios(
        id_Rutina: Int,

    ): List<Rutinas_Ejercicios_CrossRef> {

        rutina_ejercicio_Filtrada= rutinas_ejerciciosList.filter { it.id_rutinas == id_Rutina}

       // val db = globalTrainingApp.getDatabase()

       // rutina_ejercicio_Filtrada= db.ejerciciosDao().getRutinas_Ejercicios_Relaciones().filter { it.id_rutinas == id_Rutina }


        return rutina_ejercicio_Filtrada
    }
*/
}