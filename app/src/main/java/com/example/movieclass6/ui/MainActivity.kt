package com.example.movieclass6.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import coil.load
import com.example.movieclass6.changeScreen
import com.example.movieclass6.databinding.ActivityMainBinding
import com.example.movieclass6.model.MovieModel
import com.example.movieclass6.presenter.Presenter
import com.example.movieclass6.view.MovieView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(),MovieView {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var presenter:Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()


    }

    private fun initClickers() {
        binding.findBtn.setOnClickListener {
            presenter.getMoviewDetails(binding.titleEd.text.toString())
        }
    }

    override fun showMovie(movieModel: MovieModel) {
       changeScreen(ResultActivity(),movieModel)

       // binding.posterImg.load(movieModel.Poster)
       Log.e("the", "showMovie: ${movieModel}")
    }

    override fun showError(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_SHORT).show()
    }
}