package com.example.globaltrainingapp_11.utils

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.globaltrainingapp_11.data.database.RutinasDataBase

class globalTrainingApp : Application() {

    companion object {
        private var db: RutinasDataBase? = null
        private lateinit var dbShare: SharedPreferences

        fun getDatabase():RutinasDataBase {
            return db!!
        }

        fun getShareDB(): SharedPreferences {
            return dbShare
        }

    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(applicationContext, RutinasDataBase::class.java, "rutinas_DB")
            .createFromAsset("databases/rutinas.db")
            //agregado por error de que no deja hacer la busqueda en el main threat para pasar una lista entre activitys, pero no arreglo el problema
            //Esta desaconsejado porque en consultar grandes no habria control de la app hasta realizar la consulta y es posible que salga mensaje que la app no responde
            //POr eso se quito no mas y se soluciono de otra forma, enviando con bundle la lista
            //.allowMainThreadQueries()
            .build()


        dbShare = applicationContext.getSharedPreferences("confData", Context.MODE_PRIVATE)
    }
}