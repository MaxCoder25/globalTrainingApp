package com.example.globaltrainingapp_11.ui.entrenamiento;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_configuraciones;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/globaltrainingapp_11/databinding/FragmentConfiguracionesBinding;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "sonidoBoolean", "", "getSonidoBoolean", "()Z", "setSonidoBoolean", "(Z)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "saveSharedPreference", "Companion", "app_debug"})
public final class fragment_configuraciones extends androidx.fragment.app.Fragment {
    private com.example.globaltrainingapp_11.databinding.FragmentConfiguracionesBinding binding;
    @org.jetbrains.annotations.NotNull()
    private android.media.MediaPlayer mediaPlayer;
    private boolean sonidoBoolean = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.globaltrainingapp_11.ui.entrenamiento.fragment_configuraciones.Companion Companion = null;
    
    public fragment_configuraciones() {
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
    
    public final void saveSharedPreference(boolean sonidoBoolean) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a8\u0006\t"}, d2 = {"Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_configuraciones$Companion;", "", "()V", "newInstance", "Lcom/example/globaltrainingapp_11/ui/entrenamiento/fragment_entrenamiento_ejecucion_ejercicio_2;", "lstEjercEntity", "Ljava/util/ArrayList;", "Lcom/example/globaltrainingapp_11/entidades/EjerciciosEntity;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.globaltrainingapp_11.ui.entrenamiento.fragment_entrenamiento_ejecucion_ejercicio_2 newInstance(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.globaltrainingapp_11.entidades.EjerciciosEntity> lstEjercEntity) {
            return null;
        }
    }
}