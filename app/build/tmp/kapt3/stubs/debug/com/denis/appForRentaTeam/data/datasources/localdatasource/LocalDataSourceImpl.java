package com.denis.appForRentaTeam.data.datasources.localdatasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/denis/appForRentaTeam/data/datasources/localdatasource/LocalDataSourceImpl;", "Lcom/denis/appForRentaTeam/data/datasources/localdatasource/LocalDataSource;", "dao", "Lcom/denis/appForRentaTeam/data/datasources/database/UsersDao;", "(Lcom/denis/appForRentaTeam/data/datasources/database/UsersDao;)V", "getUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/denis/appForRentaTeam/data/datasources/database/UsersEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUsers", "", "users", "Lcom/denis/appForRentaTeam/data/model/UsersList;", "(Lcom/denis/appForRentaTeam/data/model/UsersList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocalDataSourceImpl implements com.denis.appForRentaTeam.data.datasources.localdatasource.LocalDataSource {
    private com.denis.appForRentaTeam.data.datasources.database.UsersDao dao;
    
    @javax.inject.Inject()
    public LocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.data.datasources.database.UsersDao dao) {
        super();
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
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.denis.appForRentaTeam.data.datasources.database.UsersEntity>>> continuation) {
        return null;
    }
}