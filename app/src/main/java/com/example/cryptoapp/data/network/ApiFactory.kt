package com.example.cryptoapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {

    private const val BASE_URL = "https://min-api.cryptocompare.com/data/"
    private const val IMAGE_BASE_URL = "https://www.cryptocompare.com"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiServices = retrofit.create(ApiServices::class.java)


}