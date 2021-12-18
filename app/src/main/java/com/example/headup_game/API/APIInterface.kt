package com.example.headup_game.API

import com.example.headup_game.Model.Celebrity
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("/celebrities/")
    fun getAllCelebrity():Call<Celebrity>
}