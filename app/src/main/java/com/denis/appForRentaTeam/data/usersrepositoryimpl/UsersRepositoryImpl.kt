package com.denis.appForRentaTeam.data.usersrepositoryimpl

import com.denis.appForRentaTeam.data.datasources.UsersDataSource
import com.denis.appForRentaTeam.domain.repository.UsersRepository
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val usersDataSource: UsersDataSource,
) : UsersRepository {

    override suspend fun loadUsers() {
        usersDataSource.loadUsers()
    }

    override suspend fun getUsers() = usersDataSource.getUsers()
}