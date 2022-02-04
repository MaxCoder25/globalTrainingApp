package com.example.globaltrainingapp_11.ui.rutinas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RutinasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is rutinas Fragment"
    }
    val text: LiveData<String> = _text
}