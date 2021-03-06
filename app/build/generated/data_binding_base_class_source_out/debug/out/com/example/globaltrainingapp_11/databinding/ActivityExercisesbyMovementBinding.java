// Generated by view binder compiler. Do not edit!
package com.example.globaltrainingapp_11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.globaltrainingapp_11.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExercisesbyMovementBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView idRVExercisesByMovement;

  @NonNull
  public final Toolbar idToolbarListExercisesByMovement;

  private ActivityExercisesbyMovementBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView idRVExercisesByMovement,
      @NonNull Toolbar idToolbarListExercisesByMovement) {
    this.rootView = rootView;
    this.idRVExercisesByMovement = idRVExercisesByMovement;
    this.idToolbarListExercisesByMovement = idToolbarListExercisesByMovement;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExercisesbyMovementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExercisesbyMovementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_exercisesby_movement, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExercisesbyMovementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.idRVExercisesByMovement;
      RecyclerView idRVExercisesByMovement = ViewBindings.findChildViewById(rootView, id);
      if (idRVExercisesByMovement == null) {
        break missingId;
      }

      id = R.id.idToolbarListExercisesByMovement;
      Toolbar idToolbarListExercisesByMovement = ViewBindings.findChildViewById(rootView, id);
      if (idToolbarListExercisesByMovement == null) {
        break missingId;
      }

      return new ActivityExercisesbyMovementBinding((RelativeLayout) rootView,
          idRVExercisesByMovement, idToolbarListExercisesByMovement);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
