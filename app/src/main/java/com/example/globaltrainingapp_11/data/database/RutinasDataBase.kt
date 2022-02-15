package com.example.globaltrainingapp_11.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.globaltrainingapp_11.data.database.dao.RutinasDAO
import com.example.globaltrainingapp_11.entidades.RutinasEntity

@Database(
    entities = [RutinasEntity::class],
    version = 1
)
abstract class RutinasDataBase : RoomDatabase() {

    abstract fun rutinasDao(): RutinasDAO

}