package com.denis.appForRentaTeam.data.datasources.localdatasource

import com.denis.appForRentaTeam.data.datasources.database.UsersEntity
import com.denis.appForRentaTeam.data.model.UsersList
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    suspend fun saveUsers(users: UsersList?)
    suspend fun getUsers() : Flow<List<UsersEntity>>
}