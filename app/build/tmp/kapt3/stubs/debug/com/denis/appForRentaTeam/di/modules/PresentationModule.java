package com.denis.appForRentaTeam.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/denis/appForRentaTeam/di/modules/PresentationModule;", "", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/denis/appForRentaTeam/presentation/viewModels/ViewModelFactory;", "provideUserCardViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/denis/appForRentaTeam/presentation/viewModels/UserCardViewModel;", "provideUserViewModel", "Lcom/denis/appForRentaTeam/presentation/viewModels/UsersViewModel;", "app_debug"})
@dagger.Module()
public abstract interface PresentationModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.denis.appForRentaTeam.di.keys.ViewModelKey(value = com.denis.appForRentaTeam.presentation.viewModels.UsersViewModel.class)
    @javax.inject.Singleton()
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideUserViewModel(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.presentation.viewModels.UsersViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.denis.appForRentaTeam.di.keys.ViewModelKey(value = com.denis.appForRentaTeam.presentation.viewModels.UserCardViewModel.class)
    @javax.inject.Singleton()
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideUserCardViewModel(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.presentation.viewModels.UserCardViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.presentation.viewModels.ViewModelFactory factory);
}