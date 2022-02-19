package com.example.globaltrainingapp_11.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.globaltrainingapp_11.data.database.dao.EjerciciosDAO
import com.example.globaltrainingapp_11.data.database.dao.RutinasDAO
import com.example.globaltrainingapp_11.entidades.EjerciciosEntity
import com.example.globaltrainingapp_11.entidades.RutinasEntity
import com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_CrossRef

@Database(
    entities = [RutinasEntity::class, EjerciciosEntity::class, Rutinas_Ejercicios_CrossRef::class],
    version = 1, exportSchema = false
)
abstract class RutinasDataBase : RoomDatabase() {

    abstract fun rutinasDao(): RutinasDAO
    abstract fun ejerciciosDao(): EjerciciosDAO
}