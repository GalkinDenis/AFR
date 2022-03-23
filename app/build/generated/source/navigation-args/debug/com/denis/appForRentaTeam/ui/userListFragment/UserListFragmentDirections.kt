package com.denis.appForRentaTeam.ui.userListFragment

import androidx.navigation.NavDirections
import com.example.inventory.NavGraphDirections
import kotlin.String

public class UserListFragmentDirections private constructor() {
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
