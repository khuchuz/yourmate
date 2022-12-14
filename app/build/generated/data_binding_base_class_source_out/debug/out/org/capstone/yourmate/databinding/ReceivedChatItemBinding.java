// Generated by view binder compiler. Do not edit!
package org.capstone.yourmate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.capstone.yourmate.R;

public final class ReceivedChatItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardMessageMe;

  @NonNull
  public final LinearLayout layoutMessageContainerMe;

  @NonNull
  public final TextView tvDateMe;

  @NonNull
  public final TextView tvMessageMe;

  @NonNull
  public final TextView tvTimeMe;

  private ReceivedChatItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardMessageMe, @NonNull LinearLayout layoutMessageContainerMe,
      @NonNull TextView tvDateMe, @NonNull TextView tvMessageMe, @NonNull TextView tvTimeMe) {
    this.rootView = rootView;
    this.cardMessageMe = cardMessageMe;
    this.layoutMessageContainerMe = layoutMessageContainerMe;
    this.tvDateMe = tvDateMe;
    this.tvMessageMe = tvMessageMe;
    this.tvTimeMe = tvTimeMe;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReceivedChatItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReceivedChatItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.received_chat_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReceivedChatItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardMessageMe;
      CardView cardMessageMe = ViewBindings.findChildViewById(rootView, id);
      if (cardMessageMe == null) {
        break missingId;
      }

      id = R.id.layoutMessageContainerMe;
      LinearLayout layoutMessageContainerMe = ViewBindings.findChildViewById(rootView, id);
      if (layoutMessageContainerMe == null) {
        break missingId;
      }

      id = R.id.tvDateMe;
      TextView tvDateMe = ViewBindings.findChildViewById(rootView, id);
      if (tvDateMe == null) {
        break missingId;
      }

      id = R.id.tvMessageMe;
      TextView tvMessageMe = ViewBindings.findChildViewById(rootView, id);
      if (tvMessageMe == null) {
        break missingId;
      }

      id = R.id.tvTimeMe;
      TextView tvTimeMe = ViewBindings.findChildViewById(rootView, id);
      if (tvTimeMe == null) {
        break missingId;
      }

      return new ReceivedChatItemBinding((ConstraintLayout) rootView, cardMessageMe,
          layoutMessageContainerMe, tvDateMe, tvMessageMe, tvTimeMe);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
