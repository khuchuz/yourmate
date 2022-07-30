// Generated by view binder compiler. Do not edit!
package org.capstone.yourmate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.capstone.yourmate.R;

public final class ActivityChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Button btnSend;

  @NonNull
  public final ConstraintLayout chatBox;

  @NonNull
  public final TextInputEditText etChat;

  @NonNull
  public final FrameLayout flBackButton;

  @NonNull
  public final ImageView ivNegativeStatus;

  @NonNull
  public final CircleImageView ivProfilePicture;

  @NonNull
  public final RecyclerView rvChat;

  @NonNull
  public final TextView tvName;

  private ActivityChatBinding(@NonNull ConstraintLayout rootView, @NonNull AppBarLayout appBar,
      @NonNull Button btnSend, @NonNull ConstraintLayout chatBox, @NonNull TextInputEditText etChat,
      @NonNull FrameLayout flBackButton, @NonNull ImageView ivNegativeStatus,
      @NonNull CircleImageView ivProfilePicture, @NonNull RecyclerView rvChat,
      @NonNull TextView tvName) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.btnSend = btnSend;
    this.chatBox = chatBox;
    this.etChat = etChat;
    this.flBackButton = flBackButton;
    this.ivNegativeStatus = ivNegativeStatus;
    this.ivProfilePicture = ivProfilePicture;
    this.rvChat = rvChat;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBar;
      AppBarLayout appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.btnSend;
      Button btnSend = ViewBindings.findChildViewById(rootView, id);
      if (btnSend == null) {
        break missingId;
      }

      id = R.id.chatBox;
      ConstraintLayout chatBox = ViewBindings.findChildViewById(rootView, id);
      if (chatBox == null) {
        break missingId;
      }

      id = R.id.etChat;
      TextInputEditText etChat = ViewBindings.findChildViewById(rootView, id);
      if (etChat == null) {
        break missingId;
      }

      id = R.id.flBackButton;
      FrameLayout flBackButton = ViewBindings.findChildViewById(rootView, id);
      if (flBackButton == null) {
        break missingId;
      }

      id = R.id.ivNegativeStatus;
      ImageView ivNegativeStatus = ViewBindings.findChildViewById(rootView, id);
      if (ivNegativeStatus == null) {
        break missingId;
      }

      id = R.id.ivProfilePicture;
      CircleImageView ivProfilePicture = ViewBindings.findChildViewById(rootView, id);
      if (ivProfilePicture == null) {
        break missingId;
      }

      id = R.id.rvChat;
      RecyclerView rvChat = ViewBindings.findChildViewById(rootView, id);
      if (rvChat == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new ActivityChatBinding((ConstraintLayout) rootView, appBar, btnSend, chatBox, etChat,
          flBackButton, ivNegativeStatus, ivProfilePicture, rvChat, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
