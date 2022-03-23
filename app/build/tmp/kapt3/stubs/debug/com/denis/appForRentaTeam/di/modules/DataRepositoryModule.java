package com.denis.appForRentaTeam.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/denis/appForRentaTeam/di/modules/DataRepositoryModule;", "", "provideLocalDataSource", "Lcom/denis/appForRentaTeam/data/datasources/localdatasource/LocalDataSource;", "dataSource", "Lcom/denis/appForRentaTeam/data/datasources/localdatasource/LocalDataSourceImpl;", "provideUsersDataSource", "Lcom/denis/appForRentaTeam/data/datasources/UsersDataSource;", "Lcom/denis/appForRentaTeam/data/datasources/UsersDataSourceImpl;", "app_debug"})
@dagger.Module()
public abstract interface DataRepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.denis.appForRentaTeam.data.datasources.UsersDataSource provideUsersDataSource(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.data.datasources.UsersDataSourceImpl dataSource);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSource provideLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSourceImpl dataSource);
}