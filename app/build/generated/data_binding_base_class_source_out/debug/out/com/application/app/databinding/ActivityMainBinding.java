// Generated by view binder compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final EditText firstLNT;

  @NonNull
  public final EditText mailT;

  @NonNull
  public final EditText nameT;

  @NonNull
  public final EditText numberT;

  @NonNull
  public final EditText secondLNT;

  @NonNull
  public final EditText stateT;

  @NonNull
  public final EditText suburbT;

  @NonNull
  public final TextView textView;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull Button button2, @NonNull Button button3, @NonNull EditText firstLNT,
      @NonNull EditText mailT, @NonNull EditText nameT, @NonNull EditText numberT,
      @NonNull EditText secondLNT, @NonNull EditText stateT, @NonNull EditText suburbT,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.button = button;
    this.button2 = button2;
    this.button3 = button3;
    this.firstLNT = firstLNT;
    this.mailT = mailT;
    this.nameT = nameT;
    this.numberT = numberT;
    this.secondLNT = secondLNT;
    this.stateT = stateT;
    this.suburbT = suburbT;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.firstLNT;
      EditText firstLNT = ViewBindings.findChildViewById(rootView, id);
      if (firstLNT == null) {
        break missingId;
      }

      id = R.id.mailT;
      EditText mailT = ViewBindings.findChildViewById(rootView, id);
      if (mailT == null) {
        break missingId;
      }

      id = R.id.nameT;
      EditText nameT = ViewBindings.findChildViewById(rootView, id);
      if (nameT == null) {
        break missingId;
      }

      id = R.id.numberT;
      EditText numberT = ViewBindings.findChildViewById(rootView, id);
      if (numberT == null) {
        break missingId;
      }

      id = R.id.secondLNT;
      EditText secondLNT = ViewBindings.findChildViewById(rootView, id);
      if (secondLNT == null) {
        break missingId;
      }

      id = R.id.stateT;
      EditText stateT = ViewBindings.findChildViewById(rootView, id);
      if (stateT == null) {
        break missingId;
      }

      id = R.id.suburbT;
      EditText suburbT = ViewBindings.findChildViewById(rootView, id);
      if (suburbT == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, button, button2, button3,
          firstLNT, mailT, nameT, numberT, secondLNT, stateT, suburbT, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
