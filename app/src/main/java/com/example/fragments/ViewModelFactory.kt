package com.example.fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(CheckViewModel::class.java)){
            return CheckViewModel() as T
        }
        throw IllegalArgumentException ("UnknownViewModel")
    }
}