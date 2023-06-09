// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.cargando.data.viewmodel.CargandoVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCargandoBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout frameCargando;

  @NonNull
  public final ImageView imageRefresh;

  @Bindable
  protected CargandoVM mCargandoVM;

  protected ActivityCargandoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout frameCargando, ImageView imageRefresh) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameCargando = frameCargando;
    this.imageRefresh = imageRefresh;
  }

  public abstract void setCargandoVM(@Nullable CargandoVM cargandoVM);

  @Nullable
  public CargandoVM getCargandoVM() {
    return mCargandoVM;
  }

  @NonNull
  public static ActivityCargandoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_cargando, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCargandoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCargandoBinding>inflateInternal(inflater, R.layout.activity_cargando, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCargandoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_cargando, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCargandoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCargandoBinding>inflateInternal(inflater, R.layout.activity_cargando, null, false, component);
  }

  public static ActivityCargandoBinding bind(@NonNull View view) {
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
  public static ActivityCargandoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCargandoBinding)bind(component, view, R.layout.activity_cargando);
  }
}
