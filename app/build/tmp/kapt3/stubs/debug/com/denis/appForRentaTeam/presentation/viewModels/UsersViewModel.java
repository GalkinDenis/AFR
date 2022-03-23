package com.denis.appForRentaTeam.presentation.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/denis/appForRentaTeam/presentation/viewModels/UsersViewModel;", "Landroidx/lifecycle/ViewModel;", "getUsersUseCase", "Lcom/denis/appForRentaTeam/domain/usecases/GetUsersUseCase;", "loadUsersUseCase", "Lcom/denis/appForRentaTeam/domain/usecases/LoadUsersUseCase;", "(Lcom/denis/appForRentaTeam/domain/usecases/GetUsersUseCase;Lcom/denis/appForRentaTeam/domain/usecases/LoadUsersUseCase;)V", "_errorHandler", "Lcom/denis/appForRentaTeam/presentation/SingleLiveEvent;", "", "_getListOfUsers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/denis/appForRentaTeam/domain/entities/Users;", "getListOfUsersExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getListOfUsers", "Lkotlinx/coroutines/flow/StateFlow;", "lodUsers", "", "showError", "app_debug"})
public final class UsersViewModel extends androidx.lifecycle.ViewModel {
    private final com.denis.appForRentaTeam.domain.usecases.GetUsersUseCase getUsersUseCase = null;
    private final com.denis.appForRentaTeam.domain.usecases.LoadUsersUseCase loadUsersUseCase = null;
    private final com.denis.appForRentaTeam.presentation.SingleLiveEvent<java.lang.String> _errorHandler = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler getListOfUsersExceptionHandler = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.denis.appForRentaTeam.domain.entities.Users>> _getListOfUsers = null;
    
    @javax.inject.Inject()
    public UsersViewModel(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.domain.usecases.GetUsersUseCase getUsersUseCase, @org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.domain.usecases.LoadUsersUseCase loadUsersUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denis.appForRentaTeam.presentation.SingleLiveEvent<java.lang.String> showError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.denis.appForRentaTeam.domain.entities.Users>> getListOfUsers() {
        return null;
    }
    
    public final void lodUsers() {
    }
}