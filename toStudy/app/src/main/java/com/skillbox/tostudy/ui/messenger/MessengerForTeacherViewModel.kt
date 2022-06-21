package com.skillbox.tostudy.ui.messenger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MessengerForTeacherViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is messenger for teacher Fragment"
    }
    val text: LiveData<String> = _text
}