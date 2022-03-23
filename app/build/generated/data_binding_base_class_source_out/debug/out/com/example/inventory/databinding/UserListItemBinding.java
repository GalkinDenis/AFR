// Generated by view binder compiler. Do not edit!
package com.example.inventory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.inventory.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UserListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView divider;

  @NonNull
  public final TextView firstName;

  @NonNull
  public final TextView firstNameHead;

  @NonNull
  public final TextView lastName;

  @NonNull
  public final TextView lastNameHead;

  @NonNull
  public final TextView mark;

  private UserListItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView divider,
      @NonNull TextView firstName, @NonNull TextView firstNameHead, @NonNull TextView lastName,
      @NonNull TextView lastNameHead, @NonNull TextView mark) {
    this.rootView = rootView;
    this.divider = divider;
    this.firstName = firstName;
    this.firstNameHead = firstNameHead;
    this.lastName = lastName;
    this.lastNameHead = lastNameHead;
    this.mark = mark;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UserListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UserListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.user_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UserListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      TextView divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.first_name;
      TextView firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.first_name_head;
      TextView firstNameHead = ViewBindings.findChildViewById(rootView, id);
      if (firstNameHead == null) {
        break missingId;
      }

      id = R.id.last_name;
      TextView lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.last_name_head;
      TextView lastNameHead = ViewBindings.findChildViewById(rootView, id);
      if (lastNameHead == null) {
        break missingId;
      }

      id = R.id.mark;
      TextView mark = ViewBindings.findChildViewById(rootView, id);
      if (mark == null) {
        break missingId;
      }

      return new UserListItemBinding((ConstraintLayout) rootView, divider, firstName, firstNameHead,
          lastName, lastNameHead, mark);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}