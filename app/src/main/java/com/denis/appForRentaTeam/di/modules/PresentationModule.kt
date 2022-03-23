package com.denis.appForRentaTeam.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.denis.appForRentaTeam.di.keys.ViewModelKey
import com.denis.appForRentaTeam.presentation.viewModels.UserCardViewModel
import com.denis.appForRentaTeam.presentation.viewModels.UsersViewModel
import com.denis.appForRentaTeam.presentation.viewModels.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface PresentationModule {

    @Binds
    @IntoMap
    @Singleton
    @ViewModelKey(UsersViewModel::class)
    fun provideUserViewModel(viewModel: UsersViewModel): ViewModel


    @Binds
    @IntoMap
    @Singleton
    @ViewModelKey(UserCardViewModel::class)
    fun provideUserCardViewModel(viewModel: UserCardViewModel): ViewModel


    @Binds
    @Singleton
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}