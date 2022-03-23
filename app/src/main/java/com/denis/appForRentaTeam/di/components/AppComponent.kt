package com.denis.appForRentaTeam.di.components

import android.content.Context
import com.denis.appForRentaTeam.di.modules.*
import com.denis.appForRentaTeam.ui.UserCard
import com.denis.appForRentaTeam.ui.userListFragment.UserListFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DataModule::class,
        DataRepositoryModule::class,
        DomainModule::class,
        PresentationModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    @Singleton
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }

    fun injectUsersListFragment(fragment: UserListFragment)
    fun injectUserCardFragment(fragment: UserCard)

}