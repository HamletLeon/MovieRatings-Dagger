package com.hamletleon.movieratings.di.modules

import com.hamletleon.movieratings.MainActivity
import com.hamletleon.movieratings.di.components.MainActivityComponent
import dagger.Module
import dagger.Provides
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module
class ActivityBuilder {

    @Provides
    fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector<MainActivity> {
        return builder.build()
    }
}