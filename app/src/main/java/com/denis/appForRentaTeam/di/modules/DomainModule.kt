package com.denis.appForRentaTeam.di.modules

import com.denis.appForRentaTeam.data.usersrepositoryimpl.UsersRepositoryImpl
import com.denis.appForRentaTeam.domain.repository.UsersRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface DomainModule {

    @Singleton
    @Binds
    fun provideUsersRepository(repository: UsersRepositoryImpl): UsersRepository

}