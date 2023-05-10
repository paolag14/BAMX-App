package com.application.app.modules.donaciones.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/application/app/modules/donaciones/ui/DonacionesActivity;", "Lcom/application/app/appcomponents/base/BaseActivity;", "Lcom/application/app/databinding/ActivityDonacionesBinding;", "()V", "keys", "Ljava/util/ArrayList;", "", "products", "Ljava/util/HashMap;", "viewModel", "Lcom/application/app/modules/donaciones/data/viewmodel/DonacionesVM;", "getViewModel", "()Lcom/application/app/modules/donaciones/data/viewmodel/DonacionesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "onInitialized", "", "readDB", "collection", "setUpClicks", "Companion", "app_debug"})
public final class DonacionesActivity extends com.application.app.appcomponents.base.BaseActivity<com.application.app.databinding.ActivityDonacionesBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap<java.lang.String, java.lang.String> products;
    private java.util.ArrayList<java.lang.String> keys;
    @org.jetbrains.annotations.NotNull()
    public static final com.application.app.modules.donaciones.ui.DonacionesActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "DONACIONES_ACTIVITY";
    
    public DonacionesActivity() {
        super(0);
    }
    
    private final com.application.app.modules.donaciones.data.viewmodel.DonacionesVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onInitialized() {
    }
    
    @java.lang.Override()
    public void setUpClicks() {
    }
    
    private final void readDB(java.lang.String collection) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/application/app/modules/donaciones/ui/DonacionesActivity$Companion;", "", "()V", "TAG", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.os.Bundle bundle) {
            return null;
        }
    }
}