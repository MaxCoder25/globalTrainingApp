package com.example.globaltrainingapp_11.logica;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J9\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/globaltrainingapp_11/logica/UsuarioBL;", "", "()V", "LoginUser", "Lcom/example/globaltrainingapp_11/entidades/Usuarios;", "nick", "", "pass", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllUsuarios", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNivelById", "Lcom/example/globaltrainingapp_11/entidades/NivelesEntity;", "idNivel", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOneUsuario", "idUsuario", "getPremioById", "Lcom/example/globaltrainingapp_11/entidades/PremiosEntity;", "id_premio", "insertNuevoUsuario_Register", "", "nombreUsuario", "edadUsuario", "emailUsuario", "nicknameUsuario", "passwordUsuario", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNivel_IN_UsuarioById", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePremio_IN_UsuarioById", "updatePuntos_IN_UsuarioById", "puntos", "updateRutinasCompletadas_IN_UsuarioById", "rutinasCompletadas", "app_debug"})
public final class UsuarioBL {
    
    public UsuarioBL() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object LoginUser(@org.jetbrains.annotations.NotNull()
    java.lang.String nick, @org.jetbrains.annotations.NotNull()
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.Usuarios> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllUsuarios(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.globaltrainingapp_11.entidades.Usuarios>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOneUsuario(int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.Usuarios> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNivelById(int idNivel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.NivelesEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateNivel_IN_UsuarioById(int idNivel, int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPremioById(int id_premio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.globaltrainingapp_11.entidades.PremiosEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePremio_IN_UsuarioById(int id_premio, int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateRutinasCompletadas_IN_UsuarioById(int rutinasCompletadas, int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePuntos_IN_UsuarioById(int puntos, int idUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertNuevoUsuario_Register(@org.jetbrains.annotations.NotNull()
    java.lang.String nombreUsuario, int edadUsuario, @org.jetbrains.annotations.NotNull()
    java.lang.String emailUsuario, @org.jetbrains.annotations.NotNull()
    java.lang.String nicknameUsuario, @org.jetbrains.annotations.NotNull()
    java.lang.String passwordUsuario, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}