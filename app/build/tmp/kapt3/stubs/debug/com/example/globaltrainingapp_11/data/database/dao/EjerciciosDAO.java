package com.example.globaltrainingapp_11.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0016\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eH\'J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u001a\u001a\u00020\u0007H\'J\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/globaltrainingapp_11/data/database/dao/EjerciciosDAO;", "", "cleanDbEjercicios", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEjerciciosById", "idEjercicios", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOneEjercicios", "ejercicio", "Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;", "(Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEjercicios", "", "getEjerciciosByCategory", "EjerciciosCategory", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEjerciciosById", "idEjercicio", "getEjerciciosByTipoMovimiento", "EjerciciosTipoMovimiento", "getRutinas_Ejercicios_Relaciones", "Lcom/example/globaltrainingapp_11/entidades/Rutinas_Ejercicios_Relaciones;", "getRutinas_Ejercicios_RelacionesFiltradas", "id_rutinas", "insertEjercicios", "updateEjercicios", "app_debug"})
public abstract interface EjerciciosDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ejercicios")
    public abstract java.lang.Object getAllEjercicios(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.EjerciciosEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ejercicios WHERE id_ejercicios = :idEjercicio")
    public abstract java.lang.Object getEjerciciosById(int idEjercicio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.EjerciciosEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ejercicios WHERE categoria = :EjerciciosCategory")
    public abstract java.lang.Object getEjerciciosByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String EjerciciosCategory, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.EjerciciosEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ejercicios WHERE tipo_movimiento = :EjerciciosTipoMovimiento")
    public abstract java.lang.Object getEjerciciosByTipoMovimiento(@org.jetbrains.annotations.NotNull()
    java.lang.String EjerciciosTipoMovimiento, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.EjerciciosEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertEjercicios(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.EjerciciosEntity ejercicio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object updateEjercicios(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.EjerciciosEntity ejercicio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteOneEjercicios(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.EjerciciosEntity ejercicio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM ejercicios")
    public abstract java.lang.Object cleanDbEjercicios(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM ejercicios WHERE id_ejercicios = :idEjercicios")
    public abstract java.lang.Object deleteEjerciciosById(int idEjercicios, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM rutinas")
    @androidx.room.Transaction()
    public abstract java.util.List<com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones> getRutinas_Ejercicios_Relaciones();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM rutinas  WHERE id_rutinas=:id_rutinas")
    @androidx.room.Transaction()
    public abstract java.util.List<com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones> getRutinas_Ejercicios_RelacionesFiltradas(int id_rutinas);
}