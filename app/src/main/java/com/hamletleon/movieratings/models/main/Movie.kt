package com.hamletleon.movieratings.models.main

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.hamletleon.movieratings.utils.RoomUtils

@Entity(tableName = "Movies")
class Movie {
    @PrimaryKey var id: Int = 0
    var adult: Boolean = false
    @SerializedName("backdrop_path") var backdropPath: String? = null
    @Embedded @SerializedName("belongs_to_collection") var belongToCollection: Any? = null
    var budget: Int = 0

//    @TypeConverters(RoomUtils::class) var genres: List<Genre> = emptyList()

    var homepage: String? = null
    @SerializedName("imdb_id") var imdbId: String? = null
    @SerializedName("original_language") var originalLanguage: String = ""
    @SerializedName("original_title") var originalTitle: String = ""
    var overview: String? = null
    var popularity: Float = 0f
    @SerializedName("poster_path") var posterPath: String? = null

//    @TypeConverters(RoomUtils::class) @SerializedName("production_companies") var productionCompanies: List<ProductionCompany> = emptyList()
//    @TypeConverters(RoomUtils::class) @SerializedName("production_countries") var productionCountries: List<InternationalInfo> = emptyList()

    @SerializedName("release_date") var releaseDate: String = ""
    var revenue: Int = 0
    var runtime: Int? = null

//    @TypeConverters(RoomUtils::class) @SerializedName("spoken_languages") var spokenLanguages: List<InternationalInfo> = emptyList()

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