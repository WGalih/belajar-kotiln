package com.example.hewanmvvm.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.hewanmvvm.model.AnimalModel

class ListViewModel(application: Application): AndroidViewModel(application) {

    val animals by lazy { MutableLiveData<List<AnimalModel>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loading by lazy { MutableLiveData<Boolean>() }

    fun refresh() {
        getAnimals()
    }

    private fun getAnimals() {
        val a1 = AnimalModel("kucing")
        val a2 = AnimalModel("anjing")
        val a3 = AnimalModel("jerapah")
        val a4 = AnimalModel("kuda")

        val animalList = arrayListOf(a1, a2, a3, a4)

        animals.value = animalList
        loadError.value = false
        loading.value = false
    }
}