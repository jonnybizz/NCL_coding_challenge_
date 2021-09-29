package com.example.ncl_coding_challenge.ui.utils

import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.core.view.isVisible
import com.example.ncl_coding_challenge.utils.Resource

fun ProgressBar.handleVisibility(resource : Resource<Any>) {
    this.isVisible = resource is Resource.Loading
}

fun Button.handleIsEnabled(resource : Resource<Any>) {
    this.isEnabled = resource !is Resource.Loading
}

fun Button.configureButton(text : String, clickListener : (view : View) -> Unit) {
    this.text = text
    this.setOnClickListener {
        clickListener.invoke(this)
    }
}