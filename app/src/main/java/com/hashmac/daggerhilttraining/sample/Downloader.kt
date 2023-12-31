package com.hashmac.daggerhilttraining.sample

import javax.inject.Inject


class Downloader @Inject constructor(private val client: Client){

    fun downloadData(): String {
        return "Data Downloaded from ${client.getData()}"
    }
}