// Generated by view binder compiler. Do not edit!
package org.capstone.yourmate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.capstone.yourmate.R;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final FrameLayout homeFragmentContainer;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavView, @NonNull ConstraintLayout container,
      @NonNull FrameLayout homeFragmentContainer) {
    this.rootView = rootView;
    this.bottomNavView = bottomNavView;
    this.container = container;
    this.homeFragmentContainer = homeFragmentContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_nav_view;
      BottomNavigationView bottomNavView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavView == null) {
        break missingId;
      }

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.home_fragment_container;
      FrameLayout homeFragmentContainer = ViewBindings.findChildViewById(rootView, id);
      if (homeFragmentContainer == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, bottomNavView, container,
          homeFragmentContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
