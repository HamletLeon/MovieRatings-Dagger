package com.hamletleon.movieratings.di.modules

import android.arch.lifecycle.ViewModelProviders
import com.hamletleon.movieratings.MainActivity
import com.hamletleon.movieratings.ui.main.MainViewModel
import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {
    @Provides
    fun provideMainViewModel(activity: MainActivity): MainViewModel {
        return ViewModelProviders.of(activity).get(MainViewModel::class.java)
    }
}