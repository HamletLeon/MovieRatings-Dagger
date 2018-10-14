package com.hamletleon.movieratings.injection.modules

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module(includes = [ContextModule::class])
class OkHttpClientModule {

    @Provides
    fun okHttpClient(): OkHttpClient {
        return OkHttpClient()
                .newBuilder()
                .build()
    }
}