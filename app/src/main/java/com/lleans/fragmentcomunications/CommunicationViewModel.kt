package com.lleans.fragmentcomunications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {

    private val mutableLiveData = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mutableLiveData

    fun setName(name: String) {
        mutableLiveData.value = name
    }
}