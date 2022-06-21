package com.skillbox.tostudy.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileForTeacherViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is profile teacher Fragment"
    }
    val text: LiveData<String> = _text
}