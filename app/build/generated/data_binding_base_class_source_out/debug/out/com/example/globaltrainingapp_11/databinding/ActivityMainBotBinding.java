// Generated by view binder compiler. Do not edit!
package com.example.globaltrainingapp_11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
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

public final class ActivityMainBotBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnSend;

  @NonNull
  public final RecyclerView chatView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final EditText editMessage;

  private ActivityMainBotBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton btnSend,
      @NonNull RecyclerView chatView, @NonNull ConstraintLayout constraintLayout,
      @NonNull EditText editMessage) {
    this.rootView = rootView;
    this.btnSend = btnSend;
    this.chatView = chatView;
    this.constraintLayout = constraintLayout;
    this.editMessage = editMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_bot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSend;
      ImageButton btnSend = ViewBindings.findChildViewById(rootView, id);
      if (btnSend == null) {
        break missingId;
      }

      id = R.id.chatView;
      RecyclerView chatView = ViewBindings.findChildViewById(rootView, id);
      if (chatView == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.editMessage;
      EditText editMessage = ViewBindings.findChildViewById(rootView, id);
      if (editMessage == null) {
        break missingId;
      }

      return new ActivityMainBotBinding((ConstraintLayout) rootView, btnSend, chatView,
          constraintLayout, editMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}