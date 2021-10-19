package com.trivm.lib4

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["imgResourceId"], requireAll = false)
fun ImageView.setImgResourceId(id: Int?) {
    id?.let {
        this.setImageResource(it)
    }
}