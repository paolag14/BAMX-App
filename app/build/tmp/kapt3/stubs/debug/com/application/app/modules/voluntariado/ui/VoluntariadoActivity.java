package com.application.app.modules.voluntariado.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/application/app/modules/voluntariado/ui/VoluntariadoActivity;", "Lcom/application/app/appcomponents/base/BaseActivity;", "Lcom/application/app/databinding/ActivityVoluntariadoBinding;", "()V", "viewModel", "Lcom/application/app/modules/voluntariado/data/viewmodel/VoluntariadoVM;", "getViewModel", "()Lcom/application/app/modules/voluntariado/data/viewmodel/VoluntariadoVM;", "viewModel$delegate", "Lkotlin/Lazy;", "onClickRecyclerVoluntariado", "", "view", "Landroid/view/View;", "position", "", "item", "Lcom/application/app/modules/voluntariado/data/model/VoluntariadoRowModel;", "onInitialized", "setUpClicks", "Companion", "app_debug"})
public final class VoluntariadoActivity extends com.application.app.appcomponents.base.BaseActivity<com.application.app.databinding.ActivityVoluntariadoBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.application.app.modules.voluntariado.ui.VoluntariadoActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VOLUNTARIADO_ACTIVITY";
    
    public VoluntariadoActivity() {
        super(0);
    }
    
    private final com.application.app.modules.voluntariado.data.viewmodel.VoluntariadoVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onInitialized() {
    }
    
    @java.lang.Override()
    public void setUpClicks() {
    }
    
    public final void onClickRecyclerVoluntariado(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, @org.jetbrains.annotations.NotNull()
    com.application.app.modules.voluntariado.data.model.VoluntariadoRowModel item) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/application/app/modules/voluntariado/ui/VoluntariadoActivity$Companion;", "", "()V", "TAG", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "app_debug"})
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