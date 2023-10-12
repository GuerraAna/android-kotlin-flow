package com.example.android_kotlin_flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_kotlin_flow.databinding.ActivityMainBinding

internal class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listMocked = listOf<String>(
                "PRIMEIRO",
                "SEGUNDO",
                "TERCEIRO",
                "QUARTO",
                "SEGUNDO",
                "TERCEIRO",
                "SEGUNDO",
                "TERCEIRO",
                "SEGUNDO",
                "TERCEIRO",
                "SEGUNDO",
                "TERCEIRO"
        )

        with(binding.list) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ListAdapter(this@MainActivity, listMocked)
        }
    }
}