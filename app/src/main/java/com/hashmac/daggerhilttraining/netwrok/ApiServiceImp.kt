package com.hashmac.daggerhilttraining.netwrok

import com.hashmac.daggerhilttraining.models.BooksResponse
import javax.inject.Inject

class ApiServiceImp @Inject constructor(private val apiService: ApiService) {
    suspend fun getApiService():BooksResponse = apiService.getBooks()
}