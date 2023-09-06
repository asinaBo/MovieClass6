package com.example.movieclass6.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.example.movieclass6.App
import com.example.movieclass6.databinding.ActivityResultBinding
import com.example.movieclass6.model.MovieModel
import com.example.movieclass6.model.RatingModel
import com.example.movieclass6.presenter.ResultPresenter
import com.example.movieclass6.view.ResultView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject



class ResultActivity : AppCompatActivity(),ResultView {
    private lateinit var binding:ActivityResultBinding

private val resultPresenter = ResultPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI(){
        val result = intent.getSerializableExtra("key") as MovieModel
        resultPresenter.getMovieResult(result)
    }

    override fun showMovieResult(movieModel: MovieModel) {
        with(binding) {
            posterImg.load(movieModel.Poster)
            tvTitle.text = movieModel.Title
            tvYear.text = movieModel.Year
            tvGenre.text = movieModel.Genre
            tvAward.text = movieModel.Awards
            //movieModel.Raitings.forEach {
                //tvRating.append("${it.Value}\n ${it.Source} \n")

            //}

        }

    }
}