package com.hashmac.daggerhilttraining.sample

import javax.inject.Inject

class AuthRepo @Inject constructor(private val authService: AuthService) {
    fun login(username: String, password: String): Boolean {
        return authService.login(username, password)
    }

    fun logout() {
        authService.logout()
    }
}