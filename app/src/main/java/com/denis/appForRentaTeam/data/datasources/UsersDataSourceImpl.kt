package com.denis.appForRentaTeam.data.datasources

import com.denis.appForRentaTeam.data.datasources.database.toUsers
import com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSource
import com.denis.appForRentaTeam.data.datasources.network.UsersApi
import com.denis.appForRentaTeam.data.model.UsersList
import com.denis.appForRentaTeam.domain.entities.Users
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

const val END_POINT = "users"

class UsersDataSourceImpl @Inject constructor(
    private val usersApi: UsersApi,
    private val localDataSource: LocalDataSource
) : UsersDataSource {

    override suspend fun loadUsers() {
        withContext(Dispatchers.IO) {
            val users = usersApi.loadUsers(END_POINT).body()
            saveUsers(users)
        }
    }

    override suspend fun saveUsers(users: UsersList?) {
        localDataSource.saveUsers(users)
    }

    override suspend fun getUsers(): Flow<List<Users>> {
        return localDataSource.getUsers().map { usersList ->
            usersList.map { userEntity ->
                userEntity.toUsers()
            }
        }
    }

}