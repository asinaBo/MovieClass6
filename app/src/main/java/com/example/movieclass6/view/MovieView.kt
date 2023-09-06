package com.example.movieclass6.view

import com.example.movieclass6.model.MovieModel

interface MovieView {
    fun showMovie(movieModel: MovieModel)
    fun showError(error: String)
}