package com.hashmac.daggerhilttraining.sample

import com.hashmac.daggerhilttraining.MainActivity
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
        return "Hashmac"
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