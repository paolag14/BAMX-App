// Generated by view binder compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.application.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowNewRecetaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cardView;

  @NonNull
  public final TextView recetaIngredientes;

  @NonNull
  public final TextView recetaTitulo;

  private RowNewRecetaBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout cardView, @NonNull TextView recetaIngredientes,
      @NonNull TextView recetaTitulo) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.recetaIngredientes = recetaIngredientes;
    this.recetaTitulo = recetaTitulo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowNewRecetaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowNewRecetaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_new_receta, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowNewRecetaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout cardView = (ConstraintLayout) rootView;

      id = R.id.receta_ingredientes;
      TextView recetaIngredientes = ViewBindings.findChildViewById(rootView, id);
      if (recetaIngredientes == null) {
        break missingId;
      }

      id = R.id.receta_titulo;
      TextView recetaTitulo = ViewBindings.findChildViewById(rootView, id);
      if (recetaTitulo == null) {
        break missingId;
      }

      return new RowNewRecetaBinding((ConstraintLayout) rootView, cardView, recetaIngredientes,
          recetaTitulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
