package com.example.movieclass6.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


//http://www.omdbapi.com/?t=avengers&apikey=ef2a0f67

interface MovieApi {
    @GET(".")
    fun getMovie(@Query("t") name: String,
    @Query("apikey") key: String="ef2a0f67"): Call<MovieModel>

}