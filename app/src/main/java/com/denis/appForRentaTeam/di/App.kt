package com.denis.appForRentaTeam.di

import android.app.Application
import com.denis.appForRentaTeam.di.components.AppComponent
import com.denis.appForRentaTeam.di.components.DaggerAppComponent

open class App : Application() {
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}