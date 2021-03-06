package com.denis.appForRentaTeam.data.datasources.localdatasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/denis/appForRentaTeam/data/datasources/localdatasource/LocalDataSource;", "", "getUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/denis/appForRentaTeam/data/datasources/database/UsersEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUsers", "", "users", "Lcom/denis/appForRentaTeam/data/model/UsersList;", "(Lcom/denis/appForRentaTeam/data/model/UsersList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LocalDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveUsers(@org.jetbrains.annotations.Nullable()
    com.denis.appForRentaTeam.data.model.UsersList users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.denis.appForRentaTeam.data.datasources.database.UsersEntity>>> continuation);
}