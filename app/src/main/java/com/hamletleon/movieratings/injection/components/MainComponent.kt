package com.hamletleon.movieratings.injection.components

import com.hamletleon.movieratings.injection.interfaces.MainScope
import com.hamletleon.movieratings.injection.modules.RepositoryModule
import com.hamletleon.movieratings.injection.modules.PicassoModule
import com.hamletleon.movieratings.repositories.remote.MoviesRemoteService
import com.squareup.picasso.Picasso
import dagger.Component

@MainScope
@Component(modules = [RepositoryModule::class, PicassoModule::class])
interface MainComponent {
    fun getMovieRemoteService(): MoviesRemoteService
    fun getPicasso(): Picasso
}