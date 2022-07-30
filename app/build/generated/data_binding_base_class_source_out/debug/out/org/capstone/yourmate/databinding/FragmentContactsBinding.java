// Generated by view binder compiler. Do not edit!
package org.capstone.yourmate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.capstone.yourmate.R;

public final class FragmentContactsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ConstraintLayout clEmpty;

  @NonNull
  public final ConstraintLayout clSearchBox;

  @NonNull
  public final CircularProgressIndicator cpiLoading;

  @NonNull
  public final ImageView imageViewEmpty;

  @NonNull
  public final RecyclerView rvContacts;

  @NonNull
  public final SwipeRefreshLayout srlContacts;

  @NonNull
  public final TextView textViewDesc;

  @NonNull
  public final TextView textViewTitle;

  @NonNull
  public final TextView tvPageTitle;

  private FragmentContactsBinding(@NonNull LinearLayout rootView, @NonNull ConstraintLayout clEmpty,
      @NonNull ConstraintLayout clSearchBox, @NonNull CircularProgressIndicator cpiLoading,
      @NonNull ImageView imageViewEmpty, @NonNull RecyclerView rvContacts,
      @NonNull SwipeRefreshLayout srlContacts, @NonNull TextView textViewDesc,
      @NonNull TextView textViewTitle, @NonNull TextView tvPageTitle) {
    this.rootView = rootView;
    this.clEmpty = clEmpty;
    this.clSearchBox = clSearchBox;
    this.cpiLoading = cpiLoading;
    this.imageViewEmpty = imageViewEmpty;
    this.rvContacts = rvContacts;
    this.srlContacts = srlContacts;
    this.textViewDesc = textViewDesc;
    this.textViewTitle = textViewTitle;
    this.tvPageTitle = tvPageTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_contacts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContactsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clEmpty;
      ConstraintLayout clEmpty = ViewBindings.findChildViewById(rootView, id);
      if (clEmpty == null) {
        break missingId;
      }

      id = R.id.clSearchBox;
      ConstraintLayout clSearchBox = ViewBindings.findChildViewById(rootView, id);
      if (clSearchBox == null) {
        break missingId;
      }

      id = R.id.cpiLoading;
      CircularProgressIndicator cpiLoading = ViewBindings.findChildViewById(rootView, id);
      if (cpiLoading == null) {
        break missingId;
      }

      id = R.id.image_view_empty;
      ImageView imageViewEmpty = ViewBindings.findChildViewById(rootView, id);
      if (imageViewEmpty == null) {
        break missingId;
      }

      id = R.id.rvContacts;
      RecyclerView rvContacts = ViewBindings.findChildViewById(rootView, id);
      if (rvContacts == null) {
        break missingId;
      }

      id = R.id.srlContacts;
      SwipeRefreshLayout srlContacts = ViewBindings.findChildViewById(rootView, id);
      if (srlContacts == null) {
        break missingId;
      }

      id = R.id.text_view_desc;
      TextView textViewDesc = ViewBindings.findChildViewById(rootView, id);
      if (textViewDesc == null) {
        break missingId;
      }

      id = R.id.text_view_title;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      id = R.id.tvPageTitle;
      TextView tvPageTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvPageTitle == null) {
        break missingId;
      }

      return new FragmentContactsBinding((LinearLayout) rootView, clEmpty, clSearchBox, cpiLoading,
          imageViewEmpty, rvContacts, srlContacts, textViewDesc, textViewTitle, tvPageTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
