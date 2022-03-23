package com.denis.appForRentaTeam.data.datasources

import com.denis.appForRentaTeam.data.model.UsersList
import com.denis.appForRentaTeam.domain.entities.Users
import kotlinx.coroutines.flow.Flow

interface UsersDataSource {
    suspend fun loadUsers()
    suspend fun saveUsers(users: UsersList?)
    suspend fun getUsers() : Flow<List<Users>>
}