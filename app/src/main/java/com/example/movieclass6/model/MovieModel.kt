package com.example.movieclass6.model

import java.io.Serializable

data class MovieModel (
    var Title: String,
    var Year: String,
    var Genre: String,
    var Awards: String,
    var Poster: String,
    var Raitings: ArrayList<RatingModel>

    ): Serializable

data class RatingModel(
    var Value:String,
    var Source: String

):Serializable