package com.example.android_kotlin_flow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class MainViewModel : ViewModel() {

	val items: LiveData<String> = getItems().asLiveData()

	fun getItems(): Flow<String> {
		return flow {
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

			for (item in listMocked) {
				emit(item)
				delay(1000)
			}
		}
	}
}