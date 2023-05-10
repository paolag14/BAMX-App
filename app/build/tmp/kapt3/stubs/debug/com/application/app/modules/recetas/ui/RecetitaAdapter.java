package com.application.app.modules.recetas.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u001e\u0010\u0016\u001a\u00020\u000f2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/application/app/modules/recetas/ui/RecetitaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/application/app/modules/recetas/ui/RecetitaAdapter$MyViewHolder;", "recetasList", "Ljava/util/ArrayList;", "Lcom/application/app/modules/recetas/ui/Receta;", "Lkotlin/collections/ArrayList;", "listener", "Landroid/view/View$OnClickListener;", "(Ljava/util/ArrayList;Landroid/view/View$OnClickListener;)V", "getListener", "()Landroid/view/View$OnClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFilteredList", "filteredList", "MyViewHolder", "app_debug"})
public final class RecetitaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.application.app.modules.recetas.ui.RecetitaAdapter.MyViewHolder> {
    private java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> recetasList;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener listener = null;
    
    public RecetitaAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> recetasList, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.application.app.modules.recetas.ui.RecetitaAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.application.app.modules.recetas.ui.RecetitaAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setFilteredList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> filteredList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/application/app/modules/recetas/ui/RecetitaAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ingredientes", "Landroid/widget/TextView;", "getIngredientes", "()Landroid/widget/TextView;", "titulo", "getTitulo", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titulo = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView ingredientes = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitulo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getIngredientes() {
            return null;
        }
    }
}