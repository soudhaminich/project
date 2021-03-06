// Generated by view binder compiler. Do not edit!
package com.example.face2face.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.face2face.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton buttonSignIn;

  @NonNull
  public final CardView cardSignIn;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final LinearLayout layoutHeader;

  @NonNull
  public final ProgressBar signInProgressBar;

  @NonNull
  public final TextView textSignInLabel;

  @NonNull
  public final TextView textSignUp;

  @NonNull
  public final TextView textnoaccount;

  private ActivitySignInBinding(@NonNull ScrollView rootView, @NonNull MaterialButton buttonSignIn,
      @NonNull CardView cardSignIn, @NonNull EditText inputEmail, @NonNull EditText inputPassword,
      @NonNull LinearLayout layoutHeader, @NonNull ProgressBar signInProgressBar,
      @NonNull TextView textSignInLabel, @NonNull TextView textSignUp,
      @NonNull TextView textnoaccount) {
    this.rootView = rootView;
    this.buttonSignIn = buttonSignIn;
    this.cardSignIn = cardSignIn;
    this.inputEmail = inputEmail;
    this.inputPassword = inputPassword;
    this.layoutHeader = layoutHeader;
    this.signInProgressBar = signInProgressBar;
    this.textSignInLabel = textSignInLabel;
    this.textSignUp = textSignUp;
    this.textnoaccount = textnoaccount;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSignIn;
      MaterialButton buttonSignIn = rootView.findViewById(id);
      if (buttonSignIn == null) {
        break missingId;
      }

      id = R.id.cardSignIn;
      CardView cardSignIn = rootView.findViewById(id);
      if (cardSignIn == null) {
        break missingId;
      }

      id = R.id.inputEmail;
      EditText inputEmail = rootView.findViewById(id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.inputPassword;
      EditText inputPassword = rootView.findViewById(id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.layoutHeader;
      LinearLayout layoutHeader = rootView.findViewById(id);
      if (layoutHeader == null) {
        break missingId;
      }

      id = R.id.signInProgressBar;
      ProgressBar signInProgressBar = rootView.findViewById(id);
      if (signInProgressBar == null) {
        break missingId;
      }

      id = R.id.textSignInLabel;
      TextView textSignInLabel = rootView.findViewById(id);
      if (textSignInLabel == null) {
        break missingId;
      }

      id = R.id.textSignUp;
      TextView textSignUp = rootView.findViewById(id);
      if (textSignUp == null) {
        break missingId;
      }

      id = R.id.textnoaccount;
      TextView textnoaccount = rootView.findViewById(id);
      if (textnoaccount == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ScrollView) rootView, buttonSignIn, cardSignIn, inputEmail,
          inputPassword, layoutHeader, signInProgressBar, textSignInLabel, textSignUp,
          textnoaccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
