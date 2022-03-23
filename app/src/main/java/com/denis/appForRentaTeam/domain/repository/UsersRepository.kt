package com.denis.appForRentaTeam.domain.repository

import com.denis.appForRentaTeam.domain.entities.Users
import kotlinx.coroutines.flow.Flow

interface UsersRepository {
    suspend fun loadUsers()
    suspend fun getUsers() : Flow<List<Users>>
}