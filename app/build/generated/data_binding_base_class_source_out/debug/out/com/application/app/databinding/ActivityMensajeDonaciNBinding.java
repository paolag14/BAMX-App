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
import com.application.app.modules.mensajedonacin.data.viewmodel.MensajeDonaciNVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMensajeDonaciNBinding extends ViewDataBinding {
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
  public final LinearLayout linear3Tab;

  @NonNull
  public final LinearLayout linearColumnmask;

  @NonNull
  public final LinearLayout linearColumnvolume;

  @NonNull
  public final LinearLayout linearMensajedonaci;

  @NonNull
  public final TextView txtCaption;

  @NonNull
  public final TextView txtCaptionOne;

  @NonNull
  public final TextView txtElBancodeAli;

  @NonNull
  public final TextView txtGraciasportu;

  @Bindable
  protected MensajeDonaciNVM mMensajeDonaciNVM;

  protected ActivityMensajeDonaciNBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FrameLayout frameBottombar, FrameLayout frameStackarrowleft,
      FrameLayout frameStackbamxlogotwo, FrameLayout frameStackbamxlogotwoOne,
      ImageView imageArrowleft, ImageView imageBamxlogoTwo, ImageView imageBamxlogoTwoOne,
      ImageView imageHome, ImageView imageVolume, LinearLayout linear1Tab,
      LinearLayout linear2FourupAO, LinearLayout linear3Tab, LinearLayout linearColumnmask,
      LinearLayout linearColumnvolume, LinearLayout linearMensajedonaci, TextView txtCaption,
      TextView txtCaptionOne, TextView txtElBancodeAli, TextView txtGraciasportu) {
    super(_bindingComponent, _root, _localFieldCount);
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
    this.linear3Tab = linear3Tab;
    this.linearColumnmask = linearColumnmask;
    this.linearColumnvolume = linearColumnvolume;
    this.linearMensajedonaci = linearMensajedonaci;
    this.txtCaption = txtCaption;
    this.txtCaptionOne = txtCaptionOne;
    this.txtElBancodeAli = txtElBancodeAli;
    this.txtGraciasportu = txtGraciasportu;
  }

  public abstract void setMensajeDonaciNVM(@Nullable MensajeDonaciNVM mensajeDonaciNVM);

  @Nullable
  public MensajeDonaciNVM getMensajeDonaciNVM() {
    return mMensajeDonaciNVM;
  }

  @NonNull
  public static ActivityMensajeDonaciNBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_mensaje_donaci_n, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMensajeDonaciNBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMensajeDonaciNBinding>inflateInternal(inflater, R.layout.activity_mensaje_donaci_n, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMensajeDonaciNBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_mensaje_donaci_n, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMensajeDonaciNBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMensajeDonaciNBinding>inflateInternal(inflater, R.layout.activity_mensaje_donaci_n, null, false, component);
  }

  public static ActivityMensajeDonaciNBinding bind(@NonNull View view) {
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
  public static ActivityMensajeDonaciNBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMensajeDonaciNBinding)bind(component, view, R.layout.activity_mensaje_donaci_n);
  }
}