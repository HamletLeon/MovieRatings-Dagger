package com.hamletleon.movieratings.models.main

enum class MovieStatus(val value: String) {
    Rumored("Rumored"),
    Planned("Planned"),
    InProduction("In Production"),
    PostProduction("Post Production"),
    Released("Released"),
    Canceled("Canceled")
}