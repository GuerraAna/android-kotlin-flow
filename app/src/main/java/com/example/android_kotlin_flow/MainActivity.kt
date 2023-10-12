package com.example.android_kotlin_flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_kotlin_flow.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

internal class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()
    private val listAdapter = ListAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            viewModel.getItems().collect() { itemValue ->
                with(binding.list) {
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = listAdapter
                    listAdapter.addInList(itemValue)
                }
            }
        }
    }
}