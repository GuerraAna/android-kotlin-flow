package com.example.android_kotlin_flow

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.android_kotlin_flow.databinding.ListItemMainBinding

internal class ListViewHolder(
	private val context: Context,
	private val binding: ListItemMainBinding
) : RecyclerView.ViewHolder(binding.root) {

	fun bind(listOfValues: String) {
		binding.text.text = listOfValues
	}
}