package com.example.globaltrainingapp_11.ui.entrenamiento;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\r\u0010\u001b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0016H\u0002J\u0012\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010,\u001a\u00020\u0012J\u000e\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0016J\u000e\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0016J\u000e\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u00064"}, d2 = {"Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_entrenamiento_ejecucion_ejercicio_3;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/globaltrainingapp_11/databinding/FragmentEntrenamientoEjecucionEjercicio3Binding;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "sonidoBoolean", "", "getSonidoBoolean", "()Z", "setSonidoBoolean", "(Z)V", "ItemClickOnRecycledView", "", "EjerciciosEntity", "Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;", "getIntSharedPreferenceDescEjer", "", "getIntSharedPreferenceDescEjerOriginal", "getIntSharedPreferenceDescansoSerie", "getIntSharedPreferenceEjercRutina", "getIntSharedPreferenceOriginal", "getSharedPreferenceSonidoBoolean", "()Ljava/lang/Boolean;", "getSharedPreferenceTXTDescanso", "", "loadRutinas_Ejercicios", "id_Rutina", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "saveSharedPreference", "saveSharedPreferenceDescansoEjerc", "tiempo", "saveSharedPreferenceEjercRutina", "size", "saveSharedPreferenceTXTDescanso", "ejercOSerie", "Companion", "app_debug"})
public final class fragment_entrenamiento_ejecucion_ejercicio_3 extends androidx.fragment.app.Fragment {
    private com.example.globaltrainingapp_11.databinding.FragmentEntrenamientoEjecucionEjercicio3Binding binding;
    @org.jetbrains.annotations.NotNull()
    private android.media.MediaPlayer mediaPlayer;
    private boolean sonidoBoolean = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.globaltrainingapp_11.ui.entrenamiento.fragment_entrenamiento_ejecucion_ejercicio_3.Companion Companion = null;
    
    public fragment_entrenamiento_ejecucion_ejercicio_3() {
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
    
    public final void saveSharedPreference() {
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
    
    public final int getIntSharedPreferenceDescEjer() {
        return 0;
    }
    
    public final int getIntSharedPreferenceDescEjerOriginal() {
        return 0;
    }
    
    public final int getIntSharedPreferenceOriginal() {
        return 0;
    }
    
    public final int getIntSharedPreferenceEjercRutina() {
        return 0;
    }
    
    public final int getIntSharedPreferenceDescansoSerie() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSharedPreferenceTXTDescanso() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSharedPreferenceSonidoBoolean() {
        return null;
    }
    
    public final void saveSharedPreferenceEjercRutina(int size) {
    }
    
    public final void saveSharedPreferenceDescansoEjerc(int tiempo) {
    }
    
    public final void saveSharedPreferenceTXTDescanso(@org.jetbrains.annotations.NotNull()
    java.lang.String ejercOSerie) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a8\u0006\t"}, d2 = {"Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_entrenamiento_ejecucion_ejercicio_3$Companion;", "", "()V", "newInstance3", "Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_entrenamiento_ejecucion_ejercicio_2;", "lstEjercEntity", "Ljava/util/ArrayList;", "Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.globaltrainingapp_11.ui.entrenamiento.fragment_entrenamiento_ejecucion_ejercicio_2 newInstance3(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.globaltrainingapp_11.entidades.EjerciciosEntity> lstEjercEntity) {
            return null;
        }
    }
}