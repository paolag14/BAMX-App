package com.application.app.modules.recetas.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MJ\b\u0010N\u001a\u00020KH\u0002J\u0010\u0010O\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MJ\u000e\u0010$\u001a\u00020K2\u0006\u0010L\u001a\u00020MJ\u0012\u0010P\u001a\u00020K2\b\u0010Q\u001a\u0004\u0018\u00010MH\u0016J\u0012\u0010R\u001a\u00020K2\b\u0010S\u001a\u0004\u0018\u00010TH\u0014J\u0010\u0010U\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u00100\u001a\u000201X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020=X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u00020?X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020EX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I\u00a8\u0006W"}, d2 = {"Lcom/application/app/modules/recetas/ui/RecetasActivityIntento;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "ARCHIVO_PREFS", "", "getARCHIVO_PREFS", "()Ljava/lang/String;", "setARCHIVO_PREFS", "(Ljava/lang/String;)V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getDb", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setDb", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "filteredList", "Ljava/util/ArrayList;", "Lcom/application/app/modules/recetas/ui/Receta;", "Lkotlin/collections/ArrayList;", "getFilteredList", "()Ljava/util/ArrayList;", "setFilteredList", "(Ljava/util/ArrayList;)V", "flecha", "Landroid/widget/ImageView;", "getFlecha", "()Landroid/widget/ImageView;", "setFlecha", "(Landroid/widget/ImageView;)V", "home", "Landroid/widget/LinearLayout;", "getHome", "()Landroid/widget/LinearLayout;", "setHome", "(Landroid/widget/LinearLayout;)V", "info", "getInfo", "setInfo", "myAdapter", "Lcom/application/app/modules/recetas/ui/RecetitaAdapter;", "getMyAdapter", "()Lcom/application/app/modules/recetas/ui/RecetitaAdapter;", "setMyAdapter", "(Lcom/application/app/modules/recetas/ui/RecetitaAdapter;)V", "recetaArrayList", "getRecetaArrayList", "setRecetaArrayList", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "searchView", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "(Landroidx/appcompat/widget/SearchView;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "titulo", "Landroid/widget/TextView;", "getTitulo", "()Landroid/widget/TextView;", "setTitulo", "(Landroid/widget/TextView;)V", "verRecetaFragment", "Lcom/application/app/modules/recetas/ui/FragmentVerReceta;", "getVerRecetaFragment", "()Lcom/application/app/modules/recetas/ui/FragmentVerReceta;", "setVerRecetaFragment", "(Lcom/application/app/modules/recetas/ui/FragmentVerReceta;)V", "buscar", "", "view", "Landroid/view/View;", "eventChangeListener", "goHome", "onClick", "p0", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "regresar", "Companion", "app_debug"})
public final class RecetasActivityIntento extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    public java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> recetaArrayList;
    public com.application.app.modules.recetas.ui.RecetitaAdapter myAdapter;
    public com.google.firebase.firestore.FirebaseFirestore db;
    public java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> filteredList;
    public android.widget.TextView titulo;
    public android.widget.LinearLayout home;
    public android.widget.LinearLayout info;
    public android.widget.ImageView flecha;
    public com.application.app.modules.recetas.ui.FragmentVerReceta verRecetaFragment;
    public androidx.appcompat.widget.SearchView searchView;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ARCHIVO_PREFS = "preferencias.prefs";
    private android.content.SharedPreferences sharedPrefs;
    @org.jetbrains.annotations.NotNull()
    public static final com.application.app.modules.recetas.ui.RecetasActivityIntento.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "RECETAS_ACTIVITY";
    
    public RecetasActivityIntento() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> getRecetaArrayList() {
        return null;
    }
    
    public final void setRecetaArrayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.application.app.modules.recetas.ui.RecetitaAdapter getMyAdapter() {
        return null;
    }
    
    public final void setMyAdapter(@org.jetbrains.annotations.NotNull()
    com.application.app.modules.recetas.ui.RecetitaAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> getFilteredList() {
        return null;
    }
    
    public final void setFilteredList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.application.app.modules.recetas.ui.Receta> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitulo() {
        return null;
    }
    
    public final void setTitulo(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getHome() {
        return null;
    }
    
    public final void setHome(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getFlecha() {
        return null;
    }
    
    public final void setFlecha(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.application.app.modules.recetas.ui.FragmentVerReceta getVerRecetaFragment() {
        return null;
    }
    
    public final void setVerRecetaFragment(@org.jetbrains.annotations.NotNull()
    com.application.app.modules.recetas.ui.FragmentVerReceta p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.SearchView getSearchView() {
        return null;
    }
    
    public final void setSearchView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.SearchView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getARCHIVO_PREFS() {
        return null;
    }
    
    public final void setARCHIVO_PREFS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void eventChangeListener() {
    }
    
    public final void goHome(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void regresar(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void buscar(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void info(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/application/app/modules/recetas/ui/RecetasActivityIntento$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}