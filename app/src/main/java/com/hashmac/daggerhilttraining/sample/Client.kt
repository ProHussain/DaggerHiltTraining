package com.hashmac.daggerhilttraining.sample

import javax.inject.Inject

class Client @Inject constructor() {

    fun getData(): String {
        return "Data from client"
    }
}