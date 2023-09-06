package com.example.movieclass6.presenter

import com.example.movieclass6.model.MovieApi
import com.example.movieclass6.model.MovieModel
import com.example.movieclass6.view.ResultView
import javax.inject.Inject

class ResultPresenter (private val resultView: ResultView) {



    fun getMovieResult(movieModel: MovieModel){
       resultView.showMovieResult(movieModel)
    }




}