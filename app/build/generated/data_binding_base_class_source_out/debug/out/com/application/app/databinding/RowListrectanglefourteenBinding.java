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
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowListrectanglefourteenBinding extends ViewDataBinding {
  @NonNull
  public final TextView amount;

  @NonNull
  public final FrameLayout frameStackrectanglefourteen;

  @NonNull
  public final ImageView imageArticulo;

  @NonNull
  public final AppCompatButton lessButton;

  @NonNull
  public final LinearLayout linearColumnredapplepngc;

  @NonNull
  public final AppCompatButton plusButton;

  @NonNull
  public final TextView txtArticulo;

  @NonNull
  public final View viewRectangleTwelve;

  protected RowListrectanglefourteenBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView amount, FrameLayout frameStackrectanglefourteen,
      ImageView imageArticulo, AppCompatButton lessButton, LinearLayout linearColumnredapplepngc,
      AppCompatButton plusButton, TextView txtArticulo, View viewRectangleTwelve) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amount = amount;
    this.frameStackrectanglefourteen = frameStackrectanglefourteen;
    this.imageArticulo = imageArticulo;
    this.lessButton = lessButton;
    this.linearColumnredapplepngc = linearColumnredapplepngc;
    this.plusButton = plusButton;
    this.txtArticulo = txtArticulo;
    this.viewRectangleTwelve = viewRectangleTwelve;
  }

  @NonNull
  public static RowListrectanglefourteenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_listrectanglefourteen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowListrectanglefourteenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowListrectanglefourteenBinding>inflateInternal(inflater, R.layout.row_listrectanglefourteen, root, attachToRoot, component);
  }

  @NonNull
  public static RowListrectanglefourteenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_listrectanglefourteen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowListrectanglefourteenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowListrectanglefourteenBinding>inflateInternal(inflater, R.layout.row_listrectanglefourteen, null, false, component);
  }

  public static RowListrectanglefourteenBinding bind(@NonNull View view) {
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
  public static RowListrectanglefourteenBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (RowListrectanglefourteenBinding)bind(component, view, R.layout.row_listrectanglefourteen);
  }
}