package com.example.inventory

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class NavGraphDirections private constructor() {
  private data class ActionUserListFragmentToUserCardFragment(
    public val avatar: String,
    public val first: String,
    public val last: String,
    public val email: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_UserListFragment_to_UserCardFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("avatar", this.avatar)
        result.putString("first", this.first)
        result.putString("last", this.last)
        result.putString("email", this.email)
        return result
      }
  }

  public companion object {
    public fun actionUserListFragmentToUserCardFragment(
      avatar: String,
      first: String,
      last: String,
      email: String
    ): NavDirections = ActionUserListFragmentToUserCardFragment(avatar, first, last, email)
  }
}
