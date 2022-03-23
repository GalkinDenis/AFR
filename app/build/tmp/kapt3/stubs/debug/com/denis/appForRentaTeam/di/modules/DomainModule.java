package com.denis.appForRentaTeam.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/denis/appForRentaTeam/di/modules/DomainModule;", "", "provideUsersRepository", "Lcom/denis/appForRentaTeam/domain/repository/UsersRepository;", "repository", "Lcom/denis/appForRentaTeam/data/usersrepositoryimpl/UsersRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract interface DomainModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.denis.appForRentaTeam.domain.repository.UsersRepository provideUsersRepository(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.data.usersrepositoryimpl.UsersRepositoryImpl repository);
}