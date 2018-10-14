package com.hamletleon.movieratings.models.main

import com.google.gson.annotations.SerializedName

class MovieBrief {
    @SerializedName("id") var id: Int = 0
    @SerializedName("vote_count") var voteCount: Int = 0
    @SerializedName("video") var video: Boolean = false
    @SerializedName("vote_average") var voteAverage: Float = 0.0f
    @SerializedName("title") var title: String = "No especificado"
    @SerializedName("popularity") var popularity: Double = 0.0
    @SerializedName("poster_path") var posterPath: String? = null
    @SerializedName("original_language") var originalLanguage: String = ""
    @SerializedName("original_title") var originalTitle: String = ""
    @SerializedName("genre_ids") var genreIds: List<Int> = emptyList()
    @SerializedName("backdrop_path") var backdropPath: String? = null
    @SerializedName("adult") var adult: Boolean = false
    @SerializedName("overview") var overview: String = ""
    @SerializedName("release_date") var releaseDate: String = ""
}