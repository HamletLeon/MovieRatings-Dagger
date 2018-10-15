package com.hamletleon.movieratings.di.components

import com.hamletleon.movieratings.MainActivity
import com.hamletleon.movieratings.di.modules.MainActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent: AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}