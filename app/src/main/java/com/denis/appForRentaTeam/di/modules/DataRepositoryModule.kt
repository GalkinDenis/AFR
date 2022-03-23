package com.denis.appForRentaTeam.di.modules

import com.denis.appForRentaTeam.data.datasources.UsersDataSource
import com.denis.appForRentaTeam.data.datasources.UsersDataSourceImpl
import com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSource
import com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSourceImpl
import dagger.Module
import dagger.Binds

@Module
interface DataRepositoryModule {
    @Binds
    fun provideUsersDataSource(dataSource: UsersDataSourceImpl): UsersDataSource

    @Binds
    fun provideLocalDataSource(dataSource: LocalDataSourceImpl): LocalDataSource
}