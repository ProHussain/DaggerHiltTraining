package com.hashmac.daggerhilttraining

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthProvider {
    @Provides
    @Singleton
    fun provideAuthService(
        @FirstAuth auth:String,
        @SecondAuth auth2:String
    ): AuthService {
        return AuthServiceImpl(auth,auth2)
    }

    @Provides
    @FirstAuth
    fun provideUser(): String {
        return MainActivity.name
    }

    @Provides
    @SecondAuth
    fun providerUser2(): String {
        return "Learning, Programming, and Simplifying"
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstAuth

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondAuth