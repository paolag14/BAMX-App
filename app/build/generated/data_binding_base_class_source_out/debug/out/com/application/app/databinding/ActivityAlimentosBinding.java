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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.alimentos.data.viewmodel.AlimentosVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAlimentosBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnAbarrotes;

  @NonNull
  public final AppCompatButton btnCanastaBasica;

  @NonNull
  public final AppCompatButton btnEmbutidosYLacteos;

  @NonNull
  public final AppCompatButton btnFrutasYVerduras;

  @NonNull
  public final AppCompatButton btnOtro;

  @NonNull
  public final FrameLayout frameBottombar;

  @NonNull
  public final FrameLayout frameStackarrowleft;

  @NonNull
  public final FrameLayout frameStackbamxlogotwo;

  @NonNull
  public final FrameLayout frameStackbamxlogotwoOne;

  @NonNull
  public final ImageView imageArrowleft;

  @NonNull
  public final ImageView imageBamxlogoTwo;

  @NonNull
  public final ImageView imageBamxlogoTwoOne;

  @NonNull
  public final ImageView imageHome;

  @NonNull
  public final ImageView imageVolume;

  @NonNull
  public final LinearLayout linear1Tab;

  @NonNull
  public final LinearLayout linear2FourupAO;

  @NonNull
  public final LinearLayout linear3ContainedB;

  @NonNull
  public final LinearLayout linear3ContainedB1;

  @NonNull
  public final LinearLayout linear3ContainedB2;

  @NonNull
  public final LinearLayout linear3ContainedB3;

  @NonNull
  public final LinearLayout linear3Tab;

  @NonNull
  public final LinearLayout linearAlimentos;

  @NonNull
  public final LinearLayout linearColumnlabel;

  @NonNull
  public final LinearLayout linearColumnmask;

  @NonNull
  public final LinearLayout linearColumnvolume;

  @NonNull
  public final LinearLayout linearRowlabel;

  @NonNull
  public final LinearLayout linearRowlabelTwo;

  @NonNull
  public final TextView txtCaption;

  @NonNull
  public final TextView txtCaptionOne;

  @NonNull
  public final TextView txtH5;

  @Bindable
  protected AlimentosVM mAlimentosVM;

  protected ActivityAlimentosBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnAbarrotes, AppCompatButton btnCanastaBasica,
      AppCompatButton btnEmbutidosYLacteos, AppCompatButton btnFrutasYVerduras,
      AppCompatButton btnOtro, FrameLayout frameBottombar, FrameLayout frameStackarrowleft,
      FrameLayout frameStackbamxlogotwo, FrameLayout frameStackbamxlogotwoOne,
      ImageView imageArrowleft, ImageView imageBamxlogoTwo, ImageView imageBamxlogoTwoOne,
      ImageView imageHome, ImageView imageVolume, LinearLayout linear1Tab,
      LinearLayout linear2FourupAO, LinearLayout linear3ContainedB, LinearLayout linear3ContainedB1,
      LinearLayout linear3ContainedB2, LinearLayout linear3ContainedB3, LinearLayout linear3Tab,
      LinearLayout linearAlimentos, LinearLayout linearColumnlabel, LinearLayout linearColumnmask,
      LinearLayout linearColumnvolume, LinearLayout linearRowlabel, LinearLayout linearRowlabelTwo,
      TextView txtCaption, TextView txtCaptionOne, TextView txtH5) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAbarrotes = btnAbarrotes;
    this.btnCanastaBasica = btnCanastaBasica;
    this.btnEmbutidosYLacteos = btnEmbutidosYLacteos;
    this.btnFrutasYVerduras = btnFrutasYVerduras;
    this.btnOtro = btnOtro;
    this.frameBottombar = frameBottombar;
    this.frameStackarrowleft = frameStackarrowleft;
    this.frameStackbamxlogotwo = frameStackbamxlogotwo;
    this.frameStackbamxlogotwoOne = frameStackbamxlogotwoOne;
    this.imageArrowleft = imageArrowleft;
    this.imageBamxlogoTwo = imageBamxlogoTwo;
    this.imageBamxlogoTwoOne = imageBamxlogoTwoOne;
    this.imageHome = imageHome;
    this.imageVolume = imageVolume;
    this.linear1Tab = linear1Tab;
    this.linear2FourupAO = linear2FourupAO;
    this.linear3ContainedB = linear3ContainedB;
    this.linear3ContainedB1 = linear3ContainedB1;
    this.linear3ContainedB2 = linear3ContainedB2;
    this.linear3ContainedB3 = linear3ContainedB3;
    this.linear3Tab = linear3Tab;
    this.linearAlimentos = linearAlimentos;
    this.linearColumnlabel = linearColumnlabel;
    this.linearColumnmask = linearColumnmask;
    this.linearColumnvolume = linearColumnvolume;
    this.linearRowlabel = linearRowlabel;
    this.linearRowlabelTwo = linearRowlabelTwo;
    this.txtCaption = txtCaption;
    this.txtCaptionOne = txtCaptionOne;
    this.txtH5 = txtH5;
  }

  public abstract void setAlimentosVM(@Nullable AlimentosVM alimentosVM);

  @Nullable
  public AlimentosVM getAlimentosVM() {
    return mAlimentosVM;
  }

  @NonNull
  public static ActivityAlimentosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_alimentos, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAlimentosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAlimentosBinding>inflateInternal(inflater, R.layout.activity_alimentos, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAlimentosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_alimentos, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAlimentosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAlimentosBinding>inflateInternal(inflater, R.layout.activity_alimentos, null, false, component);
  }

  public static ActivityAlimentosBinding bind(@NonNull View view) {
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
  public static ActivityAlimentosBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAlimentosBinding)bind(component, view, R.layout.activity_alimentos);
  }
}
