package com.denis.appForRentaTeam.ui.userListFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.denis.appForRentaTeam.domain.entities.Users
import com.example.inventory.databinding.UserListItemBinding

class UserListAdapter() :
    ListAdapter<Users, UsersViewHolder>(UsersDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        return UsersViewHolder(
            UserListItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}
