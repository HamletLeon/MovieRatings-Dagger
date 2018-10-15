package com.hamletleon.movieratings.di.modules

import android.content.Context
import com.hamletleon.movieratings.BaseApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [RepositoryModule::class, PicassoModule::class])
class AppModule {
    @Provides
    @Singleton
    fun provideApplication(app: BaseApp): Context = app
}