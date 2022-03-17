package com.example.globaltrainingapp_11.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/globaltrainingapp_11/data/database/dao/UsuariosDAO;", "", "getAllUsuarios", "", "Lcom/example/globaltrainingapp_11/entidades/Usuarios;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNivelById", "Lcom/example/globaltrainingapp_11/entidades/NivelesEntity;", "id_nivel", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOneUsuario", "idUsuario", "getPremioById", "Lcom/example/globaltrainingapp_11/entidades/PremiosEntity;", "id_premio", "updateNivel_IN_UsuarioById", "", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePremio_IN_UsuarioById", "app_debug"})
public abstract interface UsuariosDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM usuarios")
    public abstract java.lang.Object getAllUsuarios(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.Usuarios>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM usuarios WHERE idUsuario = :idUsuario")
    public abstract java.lang.Object getOneUsuario(int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.Usuarios> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM niveles where id_nivel =:id_nivel ")
    @androidx.room.Transaction()
    public abstract java.lang.Object getNivelById(int id_nivel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.NivelesEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE usuarios SET nivel=:id_nivel WHERE idUsuario = :idUsuario")
    public abstract java.lang.Object updateNivel_IN_UsuarioById(int id_nivel, int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM premios where id_premio =:id_premio ")
    @androidx.room.Transaction()
    public abstract java.lang.Object getPremioById(int id_premio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.PremiosEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE usuarios SET premios=:id_premio WHERE idUsuario = :idUsuario")
    public abstract java.lang.Object updatePremio_IN_UsuarioById(int id_premio, int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}