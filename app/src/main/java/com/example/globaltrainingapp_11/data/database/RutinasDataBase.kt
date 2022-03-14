package com.example.globaltrainingapp_11.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.globaltrainingapp_11.data.database.dao.EjerciciosDAO
import com.example.globaltrainingapp_11.data.database.dao.RutinasDAO
import com.example.globaltrainingapp_11.entidades.*

@Database(
    entities = [RutinasEntity::class, EjerciciosEntity::class, Rutinas_Ejercicios_CrossRef::class, SemanaRutinasEntity::class, CategoriaRutinasEntity::class ],
    version = 1, exportSchema = false
)
abstract class RutinasDataBase : RoomDatabase() {

    abstract fun rutinasDao(): RutinasDAO
    abstract fun ejerciciosDao(): EjerciciosDAO
}