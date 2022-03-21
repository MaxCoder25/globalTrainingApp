package com.example.globaltrainingapp_11.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.globaltrainingapp_11.entidades.RutinasEntity.class, com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity.class, com.example.globaltrainingapp_11.entidades.EjerciciosEntity.class, com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_CrossRef.class, com.example.globaltrainingapp_11.entidades.SemanaRutinasEntity.class, com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity.class, com.example.globaltrainingapp_11.entidades.Usuarios.class, com.example.globaltrainingapp_11.entidades.PremiosEntity.class, com.example.globaltrainingapp_11.entidades.NivelesEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/globaltrainingapp_11/data/database/RutinasDataBase;", "Landroidx/room/RoomDatabase;", "()V", "ejerciciosDao", "Lcom/example/globaltrainingapp_11/data/database/dao/EjerciciosDAO;", "rutinasDao", "Lcom/example/globaltrainingapp_11/data/database/dao/RutinasDAO;", "usuariosDao", "Lcom/example/globaltrainingapp_11/data/database/dao/UsuariosDAO;", "app_debug"})
public abstract class RutinasDataBase extends androidx.room.RoomDatabase {
    
    public RutinasDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.globaltrainingapp_11.data.database.dao.RutinasDAO rutinasDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.globaltrainingapp_11.data.database.dao.EjerciciosDAO ejerciciosDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.globaltrainingapp_11.data.database.dao.UsuariosDAO usuariosDao();
}