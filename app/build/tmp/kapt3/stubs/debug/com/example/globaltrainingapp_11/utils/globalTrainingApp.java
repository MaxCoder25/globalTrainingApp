package com.example.globaltrainingapp_11.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/example/globaltrainingapp_11/utils/globalTrainingApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class globalTrainingApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.globaltrainingapp_11.utils.globalTrainingApp.Companion Companion = null;
    private static com.example.globaltrainingapp_11.data.database.RutinasDataBase db;
    private static android.content.SharedPreferences dbShare;
    
    public globalTrainingApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/globaltrainingapp_11/utils/globalTrainingApp$Companion;", "", "()V", "db", "Lcom/example/globaltrainingapp_11/data/database/RutinasDataBase;", "dbShare", "Landroid/content/SharedPreferences;", "getDatabase", "getShareDB", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.globaltrainingapp_11.data.database.RutinasDataBase getDatabase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getShareDB() {
            return null;
        }
    }
}