package com.denis.appForRentaTeam.ui.userListFragment

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.denis.appForRentaTeam.domain.entities.Users
import com.example.inventory.databinding.UserListItemBinding

class UsersViewHolder(
    private val binding: UserListItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(users: Users) {
        with(binding) {
            firstName.text = users.first_name
            lastName.text = users.last_name
        }

        with(itemView) {
            setOnClickListener {
                val action = UserListFragmentDirections.actionUserListFragmentToUserCardFragment(
                    avatar = users.avatar,
                    first = users.first_name,
                    last = users.last_name,
                    email = users.email
                )
                    findNavController().navigate(action)
            }
        }
    }

}