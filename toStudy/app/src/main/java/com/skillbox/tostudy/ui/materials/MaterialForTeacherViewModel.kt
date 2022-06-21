package com.skillbox.tostudy.ui.materials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MaterialForTeacherViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is material for teacher Fragment"
    }
    val text: LiveData<String> = _text
}