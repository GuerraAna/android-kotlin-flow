package com.example.android_kotlin_flow

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_kotlin_flow.databinding.ListItemMainBinding

internal class ListAdapter(private val context: Context) : RecyclerView.Adapter<ListViewHolder>() {

	private val listOfValues: MutableList<String> = mutableListOf()

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
		val inflater = LayoutInflater.from(context)
		val binding = ListItemMainBinding.inflate(inflater, parent, false)

		return ListViewHolder(context, binding)
	}

	override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
		holder.bind(listOfValues[position])
	}

	override fun getItemCount(): Int = listOfValues.count()

	fun addInList(itemValue: String) {
		listOfValues.add(itemValue)
		notifyItemInserted(itemCount)
	}
}