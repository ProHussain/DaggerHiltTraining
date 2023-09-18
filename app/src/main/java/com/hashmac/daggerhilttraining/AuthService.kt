package com.hashmac.daggerhilttraining

import android.util.Log
import javax.inject.Inject

interface AuthService {
    fun login(username: String, password: String): Boolean
    fun logout()
}

class AuthServiceImpl @Inject constructor() : AuthService {
    override fun login(username: String, password: String): Boolean {
        Log.e("AuthService", "login: $username")
        return true
    }

    override fun logout() {
        Log.e("AuthService", "logout")
    }
}