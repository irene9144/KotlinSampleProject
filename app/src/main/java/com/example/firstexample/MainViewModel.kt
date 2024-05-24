package com.example.firstexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var _currentValue = MutableLiveData<Int>()
    val currentValue : LiveData<Int>
        get() = _currentValue

    init {
        _currentValue.value = 100
    }

    fun increase() {
        _currentValue.value = _currentValue.value?.plus(1)
    }

    fun decrease() {
        _currentValue.value = _currentValue.value?.minus(1)
    }

}