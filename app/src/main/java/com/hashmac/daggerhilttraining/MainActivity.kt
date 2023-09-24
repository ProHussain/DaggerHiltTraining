package com.hashmac.daggerhilttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var downloader: Downloader

    companion object {
        var name = "HashMac Learning, Programming, and Simplifying"
    }

    @Inject
    lateinit var authRepo: AuthRepo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity",downloader.downloadData())
        Log.e("MainActivity", authRepo.login("hashmac","123456").toString())
        authRepo.logout()
    }
}