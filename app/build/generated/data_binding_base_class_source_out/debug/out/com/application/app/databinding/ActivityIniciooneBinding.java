// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.inicioone.data.viewmodel.IniciooneVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityIniciooneBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout linearInicioOne;

  @Bindable
  protected IniciooneVM mIniciooneVM;

  protected ActivityIniciooneBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout linearInicioOne) {
    super(_bindingComponent, _root, _localFieldCount);
    this.linearInicioOne = linearInicioOne;
  }

  public abstract void setIniciooneVM(@Nullable IniciooneVM iniciooneVM);

  @Nullable
  public IniciooneVM getIniciooneVM() {
    return mIniciooneVM;
  }

  @NonNull
  public static ActivityIniciooneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_inicioone, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityIniciooneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityIniciooneBinding>inflateInternal(inflater, R.layout.activity_inicioone, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityIniciooneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_inicioone, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityIniciooneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityIniciooneBinding>inflateInternal(inflater, R.layout.activity_inicioone, null, false, component);
  }

  public static ActivityIniciooneBinding bind(@NonNull View view) {
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
  public static ActivityIniciooneBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityIniciooneBinding)bind(component, view, R.layout.activity_inicioone);
  }
}