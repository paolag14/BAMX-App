// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
import com.application.app.modules.mensajedonacin.data.viewmodel.MensajeDonaciNVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityResumenHigieneYlimpiezaBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btn;

  @NonNull
  public final AppCompatButton btn2;

  @NonNull
  public final EditText cantHigiene;

  @NonNull
  public final FrameLayout frameAInactiveEna1;

  @NonNull
  public final FrameLayout frameAInactiveEna12;

  @NonNull
  public final FrameLayout frameAInactiveEna2;

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
  public final ImageView imageLabelFour;

  @NonNull
  public final ImageView imageLabelFour2;

  @NonNull
  public final ImageView imageLabelFour22;

  @NonNull
  public final ImageView imageVolume;

  @NonNull
  public final View lineUpperSurfaceTwo;

  @NonNull
  public final View lineUpperSurfaceTwo2;

  @NonNull
  public final View lineUpperSurfaceTwo22;

  @NonNull
  public final LinearLayout linear1Tab;

  @NonNull
  public final LinearLayout linear2FourupAO;

  @NonNull
  public final LinearLayout linear3Tab;

  @NonNull
  public final LinearLayout linearColumnmask;

  @NonNull
  public final LinearLayout linearColumnvolume;

  @NonNull
  public final LinearLayout linearLabel2;

  @NonNull
  public final LinearLayout linearLabel22;

  @NonNull
  public final LinearLayout linearLabel222;

  @NonNull
  public final LinearLayout linearMensajedonaci;

  @NonNull
  public final EditText nombreHigiene;

  @NonNull
  public final EditText tipoHigiene;

  @NonNull
  public final TextView txtCaption;

  @NonNull
  public final TextView txtCaptionOne;

  @NonNull
  public final TextView txtGraciasportu;

  @Bindable
  protected MensajeDonaciNVM mMensajeDonaciNVM;

  protected ActivityResumenHigieneYlimpiezaBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btn, AppCompatButton btn2, EditText cantHigiene,
      FrameLayout frameAInactiveEna1, FrameLayout frameAInactiveEna12,
      FrameLayout frameAInactiveEna2, FrameLayout frameBottombar, FrameLayout frameStackarrowleft,
      FrameLayout frameStackbamxlogotwo, FrameLayout frameStackbamxlogotwoOne,
      ImageView imageArrowleft, ImageView imageBamxlogoTwo, ImageView imageBamxlogoTwoOne,
      ImageView imageHome, ImageView imageLabelFour, ImageView imageLabelFour2,
      ImageView imageLabelFour22, ImageView imageVolume, View lineUpperSurfaceTwo,
      View lineUpperSurfaceTwo2, View lineUpperSurfaceTwo22, LinearLayout linear1Tab,
      LinearLayout linear2FourupAO, LinearLayout linear3Tab, LinearLayout linearColumnmask,
      LinearLayout linearColumnvolume, LinearLayout linearLabel2, LinearLayout linearLabel22,
      LinearLayout linearLabel222, LinearLayout linearMensajedonaci, EditText nombreHigiene,
      EditText tipoHigiene, TextView txtCaption, TextView txtCaptionOne, TextView txtGraciasportu) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btn = btn;
    this.btn2 = btn2;
    this.cantHigiene = cantHigiene;
    this.frameAInactiveEna1 = frameAInactiveEna1;
    this.frameAInactiveEna12 = frameAInactiveEna12;
    this.frameAInactiveEna2 = frameAInactiveEna2;
    this.frameBottombar = frameBottombar;
    this.frameStackarrowleft = frameStackarrowleft;
    this.frameStackbamxlogotwo = frameStackbamxlogotwo;
    this.frameStackbamxlogotwoOne = frameStackbamxlogotwoOne;
    this.imageArrowleft = imageArrowleft;
    this.imageBamxlogoTwo = imageBamxlogoTwo;
    this.imageBamxlogoTwoOne = imageBamxlogoTwoOne;
    this.imageHome = imageHome;
    this.imageLabelFour = imageLabelFour;
    this.imageLabelFour2 = imageLabelFour2;
    this.imageLabelFour22 = imageLabelFour22;
    this.imageVolume = imageVolume;
    this.lineUpperSurfaceTwo = lineUpperSurfaceTwo;
    this.lineUpperSurfaceTwo2 = lineUpperSurfaceTwo2;
    this.lineUpperSurfaceTwo22 = lineUpperSurfaceTwo22;
    this.linear1Tab = linear1Tab;
    this.linear2FourupAO = linear2FourupAO;
    this.linear3Tab = linear3Tab;
    this.linearColumnmask = linearColumnmask;
    this.linearColumnvolume = linearColumnvolume;
    this.linearLabel2 = linearLabel2;
    this.linearLabel22 = linearLabel22;
    this.linearLabel222 = linearLabel222;
    this.linearMensajedonaci = linearMensajedonaci;
    this.nombreHigiene = nombreHigiene;
    this.tipoHigiene = tipoHigiene;
    this.txtCaption = txtCaption;
    this.txtCaptionOne = txtCaptionOne;
    this.txtGraciasportu = txtGraciasportu;
  }

  public abstract void setMensajeDonaciNVM(@Nullable MensajeDonaciNVM mensajeDonaciNVM);

  @Nullable
  public MensajeDonaciNVM getMensajeDonaciNVM() {
    return mMensajeDonaciNVM;
  }

  @NonNull
  public static ActivityResumenHigieneYlimpiezaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_resumen_higiene_ylimpieza, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityResumenHigieneYlimpiezaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityResumenHigieneYlimpiezaBinding>inflateInternal(inflater, R.layout.activity_resumen_higiene_ylimpieza, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityResumenHigieneYlimpiezaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_resumen_higiene_ylimpieza, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityResumenHigieneYlimpiezaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityResumenHigieneYlimpiezaBinding>inflateInternal(inflater, R.layout.activity_resumen_higiene_ylimpieza, null, false, component);
  }

  public static ActivityResumenHigieneYlimpiezaBinding bind(@NonNull View view) {
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
  public static ActivityResumenHigieneYlimpiezaBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityResumenHigieneYlimpiezaBinding)bind(component, view, R.layout.activity_resumen_higiene_ylimpieza);
  }
}