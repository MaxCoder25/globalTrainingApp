package com.example.globaltrainingapp_11.ui.articulos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArticulosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is articulos Fragment"
    }
    val text: LiveData<String> = _text
}