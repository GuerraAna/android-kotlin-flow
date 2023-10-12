package com.example.android_kotlin_flow

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_kotlin_flow.databinding.ListItemMainBinding

internal class ListAdapter(
	private val context: Context,
	private val listOfValues: List<String>
) : RecyclerView.Adapter<ListViewHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
		val inflater = LayoutInflater.from(context)
		val binding = ListItemMainBinding.inflate(inflater, parent, false)

		return ListViewHolder(context, binding)
	}

	override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
		listOfValues[position].let { value ->
			holder.bind(value)
		}
	}

	override fun getItemCount(): Int = listOfValues.size
}