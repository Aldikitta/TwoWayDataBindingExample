package com.aldikitta.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val userName = MutableLiveData<String>()

    init {
        userName.value = "Aldi"
    }
}