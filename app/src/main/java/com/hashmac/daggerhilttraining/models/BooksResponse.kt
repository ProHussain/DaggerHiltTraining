package com.hashmac.daggerhilttraining.models

data class BooksResponse(
    val code: Int,
    val `data`: List<Data>,
    val status: String,
    val total: Int
)