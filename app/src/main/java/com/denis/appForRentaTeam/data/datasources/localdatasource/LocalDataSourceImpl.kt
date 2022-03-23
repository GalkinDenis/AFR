package com.denis.appForRentaTeam.data.datasources.localdatasource

import com.denis.appForRentaTeam.data.datasources.database.UsersDao
import com.denis.appForRentaTeam.data.datasources.database.UsersEntity
import com.denis.appForRentaTeam.data.model.UsersList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private var dao: UsersDao,
) : LocalDataSource {

    override suspend fun saveUsers(users: UsersList?) {
        withContext(Dispatchers.IO) {
            users?.data?.forEach { user ->
                dao.insert(
                    UsersEntity(
                        id = user.id,
                        email = user.email,
                        first_name = user.first_name,
                        last_name = user.last_name,
                        avatar = user.avatar
                    )
                )
            }
        }
    }

    override suspend fun getUsers(): Flow<List<UsersEntity>> {
        return dao.getListOfUsers()
    }
}