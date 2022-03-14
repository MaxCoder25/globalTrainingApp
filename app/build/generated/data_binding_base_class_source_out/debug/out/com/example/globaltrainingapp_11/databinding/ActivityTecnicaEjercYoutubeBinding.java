// Generated by view binder compiler. Do not edit!
package com.example.globaltrainingapp_11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.globaltrainingapp_11.R;
import com.google.android.youtube.player.YouTubePlayerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTecnicaEjercYoutubeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView txtDescripcionEjercTecnica;

  @NonNull
  public final TextView txtNivelEjercTecnica;

  @NonNull
  public final TextView txtNombreEjercTecnica;

  @NonNull
  public final TextView txtTipMovTecnica;

  @NonNull
  public final YouTubePlayerView ytPlayer;

  private ActivityTecnicaEjercYoutubeBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView txtDescripcionEjercTecnica, @NonNull TextView txtNivelEjercTecnica,
      @NonNull TextView txtNombreEjercTecnica, @NonNull TextView txtTipMovTecnica,
      @NonNull YouTubePlayerView ytPlayer) {
    this.rootView = rootView;
    this.txtDescripcionEjercTecnica = txtDescripcionEjercTecnica;
    this.txtNivelEjercTecnica = txtNivelEjercTecnica;
    this.txtNombreEjercTecnica = txtNombreEjercTecnica;
    this.txtTipMovTecnica = txtTipMovTecnica;
    this.ytPlayer = ytPlayer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTecnicaEjercYoutubeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTecnicaEjercYoutubeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tecnica_ejerc_youtube, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTecnicaEjercYoutubeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txt_descripcionEjercTecnica;
      TextView txtDescripcionEjercTecnica = ViewBindings.findChildViewById(rootView, id);
      if (txtDescripcionEjercTecnica == null) {
        break missingId;
      }

      id = R.id.txt_nivelEjercTecnica;
      TextView txtNivelEjercTecnica = ViewBindings.findChildViewById(rootView, id);
      if (txtNivelEjercTecnica == null) {
        break missingId;
      }

      id = R.id.txt_nombreEjercTecnica;
      TextView txtNombreEjercTecnica = ViewBindings.findChildViewById(rootView, id);
      if (txtNombreEjercTecnica == null) {
        break missingId;
      }

      id = R.id.txt_tipMovTecnica;
      TextView txtTipMovTecnica = ViewBindings.findChildViewById(rootView, id);
      if (txtTipMovTecnica == null) {
        break missingId;
      }

      id = R.id.ytPlayer;
      YouTubePlayerView ytPlayer = ViewBindings.findChildViewById(rootView, id);
      if (ytPlayer == null) {
        break missingId;
      }

      return new ActivityTecnicaEjercYoutubeBinding((ConstraintLayout) rootView,
          txtDescripcionEjercTecnica, txtNivelEjercTecnica, txtNombreEjercTecnica, txtTipMovTecnica,
          ytPlayer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
