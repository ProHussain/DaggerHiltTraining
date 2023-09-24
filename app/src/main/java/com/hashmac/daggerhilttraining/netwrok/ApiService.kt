package com.hashmac.daggerhilttraining.netwrok

import com.hashmac.daggerhilttraining.models.BooksResponse
import retrofit2.http.GET

interface ApiService {

    @GET("api/v1/books")
    suspend fun getBooks(): BooksResponse
}