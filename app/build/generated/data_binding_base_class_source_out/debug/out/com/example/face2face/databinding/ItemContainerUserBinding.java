// Generated by view binder compiler. Do not edit!
package com.example.face2face.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.face2face.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContainerUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageAudioMeet;

  @NonNull
  public final ImageView imageselected;

  @NonNull
  public final ImageView imagevideomeeting;

  @NonNull
  public final TextView textEmail;

  @NonNull
  public final TextView textFirstChar;

  @NonNull
  public final TextView textusername;

  @NonNull
  public final ConstraintLayout userContainer;

  @NonNull
  public final View viewSupporter;

  @NonNull
  public final View viewdivider;

  private ItemContainerUserBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageAudioMeet, @NonNull ImageView imageselected,
      @NonNull ImageView imagevideomeeting, @NonNull TextView textEmail,
      @NonNull TextView textFirstChar, @NonNull TextView textusername,
      @NonNull ConstraintLayout userContainer, @NonNull View viewSupporter,
      @NonNull View viewdivider) {
    this.rootView = rootView;
    this.imageAudioMeet = imageAudioMeet;
    this.imageselected = imageselected;
    this.imagevideomeeting = imagevideomeeting;
    this.textEmail = textEmail;
    this.textFirstChar = textFirstChar;
    this.textusername = textusername;
    this.userContainer = userContainer;
    this.viewSupporter = viewSupporter;
    this.viewdivider = viewdivider;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContainerUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContainerUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_container_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContainerUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageAudioMeet;
      ImageView imageAudioMeet = rootView.findViewById(id);
      if (imageAudioMeet == null) {
        break missingId;
      }

      id = R.id.imageselected;
      ImageView imageselected = rootView.findViewById(id);
      if (imageselected == null) {
        break missingId;
      }

      id = R.id.imagevideomeeting;
      ImageView imagevideomeeting = rootView.findViewById(id);
      if (imagevideomeeting == null) {
        break missingId;
      }

      id = R.id.textEmail;
      TextView textEmail = rootView.findViewById(id);
      if (textEmail == null) {
        break missingId;
      }

      id = R.id.textFirstChar;
      TextView textFirstChar = rootView.findViewById(id);
      if (textFirstChar == null) {
        break missingId;
      }

      id = R.id.textusername;
      TextView textusername = rootView.findViewById(id);
      if (textusername == null) {
        break missingId;
      }

      ConstraintLayout userContainer = (ConstraintLayout) rootView;

      id = R.id.viewSupporter;
      View viewSupporter = rootView.findViewById(id);
      if (viewSupporter == null) {
        break missingId;
      }

      id = R.id.viewdivider;
      View viewdivider = rootView.findViewById(id);
      if (viewdivider == null) {
        break missingId;
      }

      return new ItemContainerUserBinding((ConstraintLayout) rootView, imageAudioMeet,
          imageselected, imagevideomeeting, textEmail, textFirstChar, textusername, userContainer,
          viewSupporter, viewdivider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
