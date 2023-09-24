package com.hashmac.daggerhilttraining

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.response.observe(this) {
            Log.e("MainActivity", "Code: ${it.code}")
            Log.e("MainActivity", "Status: ${it.status}")
            Log.e("MainActivity", "Total: ${it.total}")
            Log.e("MainActivity", "Data: ${it.data}")
        }
    }
}