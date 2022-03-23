package com.denis.appForRentaTeam.ui.userListFragment

import androidx.recyclerview.widget.DiffUtil
import com.denis.appForRentaTeam.domain.entities.Users

object UsersDiffCallback : DiffUtil.ItemCallback<Users>() {
    override fun areItemsTheSame(oldItem: Users, newItem: Users): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Users, newItem: Users): Boolean {
        return oldItem.id == newItem.id
                && oldItem.email == newItem.email
                && oldItem.first_name == newItem.first_name
                && oldItem.last_name == newItem.last_name
                && oldItem.avatar == newItem.avatar
    }
}
