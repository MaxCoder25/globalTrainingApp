// Generated by view binder compiler. Do not edit!
package com.example.globaltrainingapp_11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.globaltrainingapp_11.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final Button btnRegistrarse;

  @NonNull
  public final TextInputEditText campoEmail;

  @NonNull
  public final TextInputEditText campoPassword;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout loginPrincipal;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtIngreseSesion;

  @NonNull
  public final TextView txtpassword;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull Button btnRegistrarse, @NonNull TextInputEditText campoEmail,
      @NonNull TextInputEditText campoPassword, @NonNull ImageView imageView,
      @NonNull ConstraintLayout loginPrincipal, @NonNull TextView txtEmail,
      @NonNull TextView txtIngreseSesion, @NonNull TextView txtpassword) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.btnRegistrarse = btnRegistrarse;
    this.campoEmail = campoEmail;
    this.campoPassword = campoPassword;
    this.imageView = imageView;
    this.loginPrincipal = loginPrincipal;
    this.txtEmail = txtEmail;
    this.txtIngreseSesion = txtIngreseSesion;
    this.txtpassword = txtpassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btn_Registrarse;
      Button btnRegistrarse = ViewBindings.findChildViewById(rootView, id);
      if (btnRegistrarse == null) {
        break missingId;
      }

      id = R.id.campoEmail;
      TextInputEditText campoEmail = ViewBindings.findChildViewById(rootView, id);
      if (campoEmail == null) {
        break missingId;
      }

      id = R.id.campoPassword;
      TextInputEditText campoPassword = ViewBindings.findChildViewById(rootView, id);
      if (campoPassword == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      ConstraintLayout loginPrincipal = (ConstraintLayout) rootView;

      id = R.id.txtEmail;
      TextView txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtIngreseSesion;
      TextView txtIngreseSesion = ViewBindings.findChildViewById(rootView, id);
      if (txtIngreseSesion == null) {
        break missingId;
      }

      id = R.id.txtpassword;
      TextView txtpassword = ViewBindings.findChildViewById(rootView, id);
      if (txtpassword == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, btnRegistrarse,
          campoEmail, campoPassword, imageView, loginPrincipal, txtEmail, txtIngreseSesion,
          txtpassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
