package com.example.globaltrainingapp_11.ui.entrenamiento;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 62\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\r\u0010\u001c\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0014H\u0002J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0016H\u0002J\u0012\u0010\"\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u000e\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0016J\u000e\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0016J\u000e\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0016J\u000e\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u000205R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u00067"}, d2 = {"Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_entrenamiento_ejecucion_ejercicio_2;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/globaltrainingapp_11/databinding/FragmentEntrenamientoEjecucionEjercicio2Binding;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "sonidoBoolean", "", "getSonidoBoolean", "()Z", "setSonidoBoolean", "(Z)V", "ItemClickOnRecycledView", "", "EjerciciosEntity", "Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;", "getIntSharedPreferenceCuentaNumRutina", "", "getIntSharedPreferenceDescansoSerie", "getIntSharedPreferenceOriginal", "getIntSharedPreferencePuntosRutinaActual", "getIntSharedPreferenceRepsRutina", "getIntSharedPreference_idUsuarioLogin", "getSharedPreferenceSonidoBoolean", "()Ljava/lang/Boolean;", "loadEjerc", "ejerciciosEntity", "loadRutinas_Ejercicios", "id_Rutina", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "saveSharedPreference", "size", "saveSharedPreferenceDescanso", "tiempo", "saveSharedPreferenceTXTCuentaNumRutina", "cuentaNumRutina", "saveSharedPreferenceTXTDescanso", "ejercOSerie", "", "Companion", "app_debug"})
public final class fragment_entrenamiento_ejecucion_ejercicio_2 extends androidx.fragment.app.Fragment {
    private com.example.globaltrainingapp_11.databinding.FragmentEntrenamientoEjecucionEjercicio2Binding binding;
    @org.jetbrains.annotations.NotNull()
    private android.media.MediaPlayer mediaPlayer;
    private boolean sonidoBoolean = true;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.globaltrainingapp_11.ui.entrenamiento.fragment_entrenamiento_ejecucion_ejercicio_2.Companion Companion = null;
    
    public fragment_entrenamiento_ejecucion_ejercicio_2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    public final void setMediaPlayer(@org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer p0) {
    }
    
    public final boolean getSonidoBoolean() {
        return false;
    }
    
    public final void setSonidoBoolean(boolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadRutinas_Ejercicios(int id_Rutina) {
    }
    
    public final void ItemClickOnRecycledView(@org.jetbrains.annotations.NotNull()
    com.example.globaltrainingapp_11.entidades.EjerciciosEntity EjerciciosEntity) {
    }
    
    private final void loadEjerc(com.example.globaltrainingapp_11.entidades.EjerciciosEntity ejerciciosEntity) {
    }
    
    public final int getIntSharedPreferenceOriginal() {
        return 0;
    }
    
    public final int getIntSharedPreferenceRepsRutina() {
        return 0;
    }
    
    public final int getIntSharedPreferenceCuentaNumRutina() {
        return 0;
    }
    
    public final int getIntSharedPreferenceDescansoSerie() {
        return 0;
    }
    
    public final void saveSharedPreference(int size) {
    }
    
    public final void saveSharedPreferenceDescanso(int tiempo) {
    }
    
    public final void saveSharedPreferenceTXTDescanso(@org.jetbrains.annotations.NotNull()
    java.lang.String ejercOSerie) {
    }
    
    public final void saveSharedPreferenceTXTCuentaNumRutina(int cuentaNumRutina) {
    }
    
    public final int getIntSharedPreference_idUsuarioLogin() {
        return 0;
    }
    
    public final int getIntSharedPreferencePuntosRutinaActual() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSharedPreferenceSonidoBoolean() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a8\u0006\t"}, d2 = {"Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_entrenamiento_ejecucion_ejercicio_2$Companion;", "", "()V", "newInstance2", "Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_entrenamiento_ejecucion_ejercicio_3;", "lstEjercEntity", "Ljava/util/ArrayList;", "Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.globaltrainingapp_11.ui.entrenamiento.fragment_entrenamiento_ejecucion_ejercicio_3 newInstance2(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.globaltrainingapp_11.entidades.EjerciciosEntity> lstEjercEntity) {
            return null;
        }
    }
}