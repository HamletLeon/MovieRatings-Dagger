package com.hamletleon.movieratings.injection.modules

import com.google.gson.Gson
import com.hamletleon.movieratings.injection.interfaces.MainScope
import com.hamletleon.movieratings.repositories.remote.MoviesRemoteService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder

@Module(includes = [OkHttpClientModule::class])
class RepositoryModule {

    @Provides
    fun movieRemoteService(retrofit: Retrofit): MoviesRemoteService {
        return retrofit.create(MoviesRemoteService::class.java)
    }

    @MainScope
    fun retrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory, gson: Gson): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.themoviedb.org/3")
                .addConverterFactory(gsonConverterFactory)
                .build()
    }

    @Provides
    fun gson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    fun gsonConverterFactory(gson: Gson): GsonConverterFactory {
        return GsonConverterFactory.create(gson)
    }
}