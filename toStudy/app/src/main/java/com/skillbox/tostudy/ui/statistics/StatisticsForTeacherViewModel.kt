package com.skillbox.tostudy.ui.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatisticsForTeacherViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is statistics for teacher Fragment"
    }
    val text: LiveData<String> = _text
}