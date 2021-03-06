package com.example.testmeli.repositories.remote

import com.example.testmeli.models.Results
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {

    @GET("/sites/MLA/search")
    fun getProductsList(@Query("q") param:String): Deferred<Response<Results>>
}