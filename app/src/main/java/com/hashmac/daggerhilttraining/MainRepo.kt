package com.hashmac.daggerhilttraining

import com.hashmac.daggerhilttraining.models.BooksResponse
import com.hashmac.daggerhilttraining.netwrok.ApiService
import com.hashmac.daggerhilttraining.netwrok.ApiServiceImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepo @Inject constructor(private val apiServiceImp: ApiServiceImp) {

    fun getBooks(): Flow<BooksResponse> = flow {
        val response = apiServiceImp.getApiService()
        emit(response)
    }.flowOn(Dispatchers.IO)

}