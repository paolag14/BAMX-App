// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.formulariootroalimento.data.model.Listlabel1RowModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowListlabel1Binding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameAInactiveEna;

  @NonNull
  public final ImageView imageLabel;

  @NonNull
  public final View lineUpperSurface;

  @NonNull
  public final LinearLayout linearNombres;

  @NonNull
  public final TextView txtLabelOne;

  @Bindable
  protected Listlabel1RowModel mListlabel1RowModel;

  protected RowListlabel1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout frameAInactiveEna, ImageView imageLabel, View lineUpperSurface,
      LinearLayout linearNombres, TextView txtLabelOne) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameAInactiveEna = frameAInactiveEna;
    this.imageLabel = imageLabel;
    this.lineUpperSurface = lineUpperSurface;
    this.linearNombres = linearNombres;
    this.txtLabelOne = txtLabelOne;
  }

  public abstract void setListlabel1RowModel(@Nullable Listlabel1RowModel listlabel1RowModel);

  @Nullable
  public Listlabel1RowModel getListlabel1RowModel() {
    return mListlabel1RowModel;
  }

  @NonNull
  public static RowListlabel1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_listlabel1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowListlabel1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowListlabel1Binding>inflateInternal(inflater, R.layout.row_listlabel1, root, attachToRoot, component);
  }

  @NonNull
  public static RowListlabel1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_listlabel1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowListlabel1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowListlabel1Binding>inflateInternal(inflater, R.layout.row_listlabel1, null, false, component);
  }

  public static RowListlabel1Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RowListlabel1Binding bind(@NonNull View view, @Nullable Object component) {
    return (RowListlabel1Binding)bind(component, view, R.layout.row_listlabel1);
  }
}
