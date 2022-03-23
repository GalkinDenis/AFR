package com.denis.appForRentaTeam.data.datasources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/denis/appForRentaTeam/data/datasources/UsersDataSourceImpl;", "Lcom/denis/appForRentaTeam/data/datasources/UsersDataSource;", "usersApi", "Lcom/denis/appForRentaTeam/data/datasources/network/UsersApi;", "localDataSource", "Lcom/denis/appForRentaTeam/data/datasources/localdatasource/LocalDataSource;", "(Lcom/denis/appForRentaTeam/data/datasources/network/UsersApi;Lcom/denis/appForRentaTeam/data/datasources/localdatasource/LocalDataSource;)V", "getUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/denis/appForRentaTeam/domain/entities/Users;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUsers", "", "saveUsers", "users", "Lcom/denis/appForRentaTeam/data/model/UsersList;", "(Lcom/denis/appForRentaTeam/data/model/UsersList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UsersDataSourceImpl implements com.denis.appForRentaTeam.data.datasources.UsersDataSource {
    private final com.denis.appForRentaTeam.data.datasources.network.UsersApi usersApi = null;
    private final com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSource localDataSource = null;
    
    @javax.inject.Inject()
    public UsersDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.data.datasources.network.UsersApi usersApi, @org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveUsers(@org.jetbrains.annotations.Nullable()
    com.denis.appForRentaTeam.data.model.UsersList users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.denis.appForRentaTeam.domain.entities.Users>>> continuation) {
        return null;
    }
}