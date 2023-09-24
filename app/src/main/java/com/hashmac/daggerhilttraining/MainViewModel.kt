package com.hashmac.daggerhilttraining

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hashmac.daggerhilttraining.models.BooksResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: MainRepo) : ViewModel()  {
    val response:LiveData<BooksResponse> = repo.getBooks().catch {
        Log.e("MainViewModel", "getBooks: ${it.message}")
    }.asLiveData()
}