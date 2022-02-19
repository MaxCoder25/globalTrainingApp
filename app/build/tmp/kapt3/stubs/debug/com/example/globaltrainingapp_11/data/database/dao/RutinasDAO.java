package com.example.globaltrainingapp_11.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/globaltrainingapp_11/data/database/dao/RutinasDAO;", "", "cleanDbRutinas", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOneRutinas", "news", "Lcom/example/globaltrainingapp_11/entidades/RutinasEntity;", "(Lcom/example/globaltrainingapp_11/entidades/RutinasEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRutinasById", "idRutinas", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRutinas", "", "getRutinasById", "idNews", "insertRutinas", "updateRutinas", "app_debug"})
public abstract interface RutinasDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM rutinas")
    public abstract java.lang.Object getAllRutinas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.RutinasEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM rutinas WHERE id_rutinas = :idNews")
    public abstract java.lang.Object getRutinasById(int idNews, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.RutinasEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertRutinas(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.RutinasEntity news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object updateRutinas(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.RutinasEntity news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteOneRutinas(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.RutinasEntity news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM rutinas")
    public abstract java.lang.Object cleanDbRutinas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM rutinas WHERE id_rutinas = :idRutinas")
    public abstract java.lang.Object deleteRutinasById(int idRutinas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}