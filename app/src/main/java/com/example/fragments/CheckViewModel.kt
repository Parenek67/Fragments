package com.example.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CheckViewModel: ViewModel() {
    val check = MutableLiveData(false)

    fun changeCheck(){
        check.value = !check.value!!
    }
}
