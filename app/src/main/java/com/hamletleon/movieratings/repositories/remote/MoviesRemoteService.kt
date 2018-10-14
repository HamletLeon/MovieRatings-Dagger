package com.hamletleon.movieratings.repositories.remote

import com.hamletleon.movieratings.models.main.Movie
import com.hamletleon.movieratings.models.main.MovieBrief
import com.hamletleon.movieratings.models.shared.PaginatedModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MoviesRemoteService {
    @GET("discover/movie")
    fun getPaginatedMovies(@Query("page") page: Int): Call<PaginatedModel<MovieBrief>>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") movieId: Int): Call<Movie>
}