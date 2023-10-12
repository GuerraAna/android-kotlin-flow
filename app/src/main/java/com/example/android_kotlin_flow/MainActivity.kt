package com.example.android_kotlin_flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_kotlin_flow.databinding.ActivityMainBinding

internal class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = "teste de output"
    }
}