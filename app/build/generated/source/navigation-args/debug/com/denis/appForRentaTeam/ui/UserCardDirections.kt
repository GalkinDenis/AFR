package com.denis.appForRentaTeam.ui

import androidx.navigation.NavDirections
import com.example.inventory.NavGraphDirections
import kotlin.String

public class UserCardDirections private constructor() {
  public companion object {
    public fun actionUserListFragmentToUserCardFragment(
      avatar: String,
      first: String,
      last: String,
      email: String
    ): NavDirections = NavGraphDirections.actionUserListFragmentToUserCardFragment(avatar, first,
        last, email)
  }
}
