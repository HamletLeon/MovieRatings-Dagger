package com.hamletleon.movieratings.models.main

import com.google.gson.annotations.SerializedName

class Movie {
    var adult: Boolean = false
    @SerializedName("backdrop_path") var backdropPath: String? = null
    @SerializedName("belongs_to_collection") var belongToCollection: Any? = null
    var budget: Int = 0
    var genres: List<Genre> = emptyList()
    var homepage: String? = null
    var id: Int = 0
    @SerializedName("imdb_id") var imdbId: String? = null
    @SerializedName("original_language") var originalLanguage: String = ""
    @SerializedName("original_title") var originalTitle: String = ""
    var overview: String? = null
    var popularity: Float = 0f
    @SerializedName("poster_path") var posterPath: String? = null
    @SerializedName("production_companies") var productionCompanies: List<ProductionCompany> = emptyList()
    @SerializedName("production_countries") var productionCountries: List<InternationalInfo> = emptyList()
    @SerializedName("release_date") var releaseDate: String = ""
    var revenue: Int = 0
    var runtime: Int? = null
    @SerializedName("spoken_languages") var spokenLanguages: List<InternationalInfo> = emptyList()
    var status: String = MovieStatus.Rumored.value
    var tagline: String? = null
    var title: String = ""
    var video: Boolean = false
    @SerializedName("vote_average") var voteAverage: Float = 0f
    @SerializedName("vote_count") var voteCount: Int = 0
}

open class Genre {
    var id: Int = 0
    var name: String = ""
}

class ProductionCompany: Genre() {
    @SerializedName("logo_path") var logoPath: String = ""
    @SerializedName("origin_country") var originCountry: String = ""
}

class InternationalInfo {
    @SerializedName("iso_3166_1") var iso3166_1: String = ""
    var name: String = ""
}