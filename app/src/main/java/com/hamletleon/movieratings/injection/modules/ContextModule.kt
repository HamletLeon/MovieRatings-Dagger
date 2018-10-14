package com.hamletleon.movieratings.injection.modules

import android.content.Context
import com.hamletleon.movieratings.injection.interfaces.ApplicationContext
import com.hamletleon.movieratings.injection.interfaces.MainScope
import dagger.Module
import dagger.Provides

@Module
class ContextModule constructor(ctx: Context) {
    val context: Context = ctx

    @ApplicationContext
    @MainScope
    @Provides
    fun context(): Context = context.applicationContext
}