package com.denis.appForRentaTeam.ui

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class UserCardArgs(
  public val avatar: String,
  public val first: String,
  public val last: String,
  public val email: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("avatar", this.avatar)
    result.putString("first", this.first)
    result.putString("last", this.last)
    result.putString("email", this.email)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("avatar", this.avatar)
    result.set("first", this.first)
    result.set("last", this.last)
    result.set("email", this.email)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): UserCardArgs {
      bundle.setClassLoader(UserCardArgs::class.java.classLoader)
      val __avatar : String?
      if (bundle.containsKey("avatar")) {
        __avatar = bundle.getString("avatar")
        if (__avatar == null) {
          throw IllegalArgumentException("Argument \"avatar\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"avatar\" is missing and does not have an android:defaultValue")
      }
      val __first : String?
      if (bundle.containsKey("first")) {
        __first = bundle.getString("first")
        if (__first == null) {
          throw IllegalArgumentException("Argument \"first\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"first\" is missing and does not have an android:defaultValue")
      }
      val __last : String?
      if (bundle.containsKey("last")) {
        __last = bundle.getString("last")
        if (__last == null) {
          throw IllegalArgumentException("Argument \"last\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"last\" is missing and does not have an android:defaultValue")
      }
      val __email : String?
      if (bundle.containsKey("email")) {
        __email = bundle.getString("email")
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue")
      }
      return UserCardArgs(__avatar, __first, __last, __email)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): UserCardArgs {
      val __avatar : String?
      if (savedStateHandle.contains("avatar")) {
        __avatar = savedStateHandle["avatar"]
        if (__avatar == null) {
          throw IllegalArgumentException("Argument \"avatar\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"avatar\" is missing and does not have an android:defaultValue")
      }
      val __first : String?
      if (savedStateHandle.contains("first")) {
        __first = savedStateHandle["first"]
        if (__first == null) {
          throw IllegalArgumentException("Argument \"first\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"first\" is missing and does not have an android:defaultValue")
      }
      val __last : String?
      if (savedStateHandle.contains("last")) {
        __last = savedStateHandle["last"]
        if (__last == null) {
          throw IllegalArgumentException("Argument \"last\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"last\" is missing and does not have an android:defaultValue")
      }
      val __email : String?
      if (savedStateHandle.contains("email")) {
        __email = savedStateHandle["email"]
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue")
      }
      return UserCardArgs(__avatar, __first, __last, __email)
    }
  }
}
