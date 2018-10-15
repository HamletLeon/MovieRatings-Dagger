package com.hamletleon.movieratings.di.components

import com.hamletleon.movieratings.BaseApp
import dagger.Component
import javax.inject.Singleton
import android.app.Application
import com.hamletleon.movieratings.di.modules.ActivityBuilder
import com.hamletleon.movieratings.di.modules.AppModule
import dagger.BindsInstance
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent: AndroidInjector<BaseApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}