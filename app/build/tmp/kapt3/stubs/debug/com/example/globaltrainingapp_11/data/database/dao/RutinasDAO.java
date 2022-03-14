package com.example.globaltrainingapp_11.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/globaltrainingapp_11/data/database/dao/RutinasDAO;", "", "deleteOneRutinas", "", "Rutina", "Lcom/example/globaltrainingapp_11/entidades/RutinasEntity;", "(Lcom/example/globaltrainingapp_11/entidades/RutinasEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRutinasById", "idRutinas", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRutinas", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoriaRutinas", "Lcom/example/globaltrainingapp_11/entidades/CategoriaRutinasEntity;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRutinasById", "idRutina", "getSemanaRutinas", "Lcom/example/globaltrainingapp_11/entidades/SemanaRutinas_Rutinas_Relaciones;", "insertRutinas", "updateRutinas", "updateSemanaRutinas", "id_rutinas", "dia", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RutinasDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM rutinas")
    public abstract java.lang.Object getAllRutinas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.RutinasEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM rutinas WHERE id_rutinas = :idRutina")
    public abstract java.lang.Object getRutinasById(int idRutina, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.RutinasEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertRutinas(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.RutinasEntity Rutina, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object updateRutinas(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.RutinasEntity Rutina, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteOneRutinas(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.RutinasEntity Rutina, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM rutinas WHERE id_rutinas = :idRutinas")
    public abstract java.lang.Object deleteRutinasById(int idRutinas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM semana_rutinas")
    @androidx.room.Transaction()
    public abstract java.lang.Object getSemanaRutinas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.SemanaRutinas_Rutinas_Relaciones>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM categoria_rutinas where nombre =:category ")
    @androidx.room.Transaction()
    public abstract java.lang.Object getCategoriaRutinas(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE semana_rutinas SET id_rutinas=:id_rutinas WHERE dia = :dia")
    public abstract java.lang.Object updateSemanaRutinas(int id_rutinas, @org.jetbrains.annotations.NotNull()
    java.lang.String dia, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}