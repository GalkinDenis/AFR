package com.denis.appForRentaTeam.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/denis/appForRentaTeam/di/components/AppComponent;", "", "injectUserCardFragment", "", "fragment", "Lcom/denis/appForRentaTeam/ui/UserCard;", "injectUsersListFragment", "Lcom/denis/appForRentaTeam/ui/userListFragment/UserListFragment;", "Factory", "app_debug"})
@dagger.Component(modules = {com.denis.appForRentaTeam.di.modules.DataModule.class, com.denis.appForRentaTeam.di.modules.DataRepositoryModule.class, com.denis.appForRentaTeam.di.modules.DomainModule.class, com.denis.appForRentaTeam.di.modules.PresentationModule.class, com.denis.appForRentaTeam.di.modules.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void injectUsersListFragment(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.ui.userListFragment.UserListFragment fragment);
    
    public abstract void injectUserCardFragment(@org.jetbrains.annotations.NotNull()
    com.denis.appForRentaTeam.ui.UserCard fragment);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/denis/appForRentaTeam/di/components/AppComponent$Factory;", "", "create", "Lcom/denis/appForRentaTeam/di/components/AppComponent;", "applicationContext", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    @javax.inject.Singleton()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.denis.appForRentaTeam.di.components.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context applicationContext);
    }
}