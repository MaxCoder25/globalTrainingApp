package com.example.globaltrainingapp_11.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0011\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0015\u001a\u00020\u000eH\'J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/globaltrainingapp_11/data/database/dao/EjerciciosDAO;", "", "getAllCategoriesbyMovement", "", "Lcom/example/globaltrainingapp_11/entidades/tipo_movimientoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEjercicios", "Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;", "getEjerciciosByCategory", "EjerciciosCategory", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEjerciciosById", "idEjercicio", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEjerciciosByTipoMovimiento", "EjerciciosTipoMovimiento", "getRutinas_Ejercicios_Relaciones", "Lcom/example/globaltrainingapp_11/entidades/Rutinas_Ejercicios_Relaciones;", "getRutinas_Ejercicios_RelacionesFiltradas", "id_rutinas", "insertEjercicios", "", "ejercicio", "(Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEjercicios", "app_debug"})
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
    @androidx.room.Query(value = "SELECT * FROM tipo_movimiento")
    public abstract java.lang.Object getAllCategoriesbyMovement(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.tipo_movimientoEntity>> continuation);
    
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
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM rutinas")
    @androidx.room.Transaction()
    public abstract java.util.List<com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones> getRutinas_Ejercicios_Relaciones();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM rutinas  WHERE id_rutinas =:id_rutinas")
    @androidx.room.Transaction()
    public abstract java.util.List<com.example.globaltrainingapp_11.entidades.Rutinas_Ejercicios_Relaciones> getRutinas_Ejercicios_RelacionesFiltradas(int id_rutinas);
}