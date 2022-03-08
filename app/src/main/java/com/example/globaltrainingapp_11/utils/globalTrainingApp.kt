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
        //private lateinit var dbShare: SharedPreferences

        fun getDatabase():RutinasDataBase {
            return db!!
        }

       // fun getShareDB(): SharedPreferences {
      //      return dbShare!!
      //  }
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(applicationContext, RutinasDataBase::class.java, "rutinas_DB")
            .createFromAsset("databases/rutinas.db")
            //agregado por error de que no deja ahcer la busqueda en el main threat para pasar una lista entre activitys, pero no arreglo el problema
            //.allowMainThreadQueries()
            .build()


        //dbShare = applicationContext.getSharedPreferences("login_data", Context.MODE_PRIVATE)
    }
}