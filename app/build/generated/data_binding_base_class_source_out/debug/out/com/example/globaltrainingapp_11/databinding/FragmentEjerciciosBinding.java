// Generated by view binder compiler. Do not edit!
package com.example.globaltrainingapp_11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.globaltrainingapp_11.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEjerciciosBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView idRVcategoryMovementType;

  @NonNull
  public final TextView idTVdescriptionbyMovement;

  @NonNull
  public final TextView txtBiblioEjerc;

  private FragmentEjerciciosBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView idRVcategoryMovementType, @NonNull TextView idTVdescriptionbyMovement,
      @NonNull TextView txtBiblioEjerc) {
    this.rootView = rootView;
    this.idRVcategoryMovementType = idRVcategoryMovementType;
    this.idTVdescriptionbyMovement = idTVdescriptionbyMovement;
    this.txtBiblioEjerc = txtBiblioEjerc;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEjerciciosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEjerciciosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ejercicios, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEjerciciosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.idRVcategoryMovementType;
      RecyclerView idRVcategoryMovementType = ViewBindings.findChildViewById(rootView, id);
      if (idRVcategoryMovementType == null) {
        break missingId;
      }

      id = R.id.idTVdescriptionbyMovement;
      TextView idTVdescriptionbyMovement = ViewBindings.findChildViewById(rootView, id);
      if (idTVdescriptionbyMovement == null) {
        break missingId;
      }

      id = R.id.txtBiblioEjerc;
      TextView txtBiblioEjerc = ViewBindings.findChildViewById(rootView, id);
      if (txtBiblioEjerc == null) {
        break missingId;
      }

      return new FragmentEjerciciosBinding((ConstraintLayout) rootView, idRVcategoryMovementType,
          idTVdescriptionbyMovement, txtBiblioEjerc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
