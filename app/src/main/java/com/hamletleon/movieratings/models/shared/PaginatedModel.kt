package com.hamletleon.movieratings.models.shared

import com.google.gson.annotations.SerializedName

class PaginatedModel<T> {
    var page: Int = 0
    @SerializedName("total_results") var totalResults: Int = 0
    @SerializedName("total_pages") var totalPages: Int = 0
    @SerializedName("results") var results: List<T> = emptyList()
}