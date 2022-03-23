package com.denis.appForRentaTeam.domain.usecases

import com.denis.appForRentaTeam.domain.repository.UsersRepository
import javax.inject.Inject

class LoadUsersUseCase @Inject constructor(
    private val usersRepositoryImpl: UsersRepository
) {
    suspend operator fun invoke() = usersRepositoryImpl.loadUsers()
}