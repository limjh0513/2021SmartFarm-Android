package com.example.smartfarm.network

import com.example.smartfarm.network.api.FarmService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitConnection {
    var farmService : FarmService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://10.80.163.229:8000/v1/")
            //.baseUrl("http://10.80.163.229:5000/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        farmService = retrofit.create(FarmService::class.java)
    }
}