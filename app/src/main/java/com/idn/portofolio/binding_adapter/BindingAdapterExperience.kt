package com.idn.portofolio.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.idn.portofolio.data.Portofolio
import coil.load

@BindingAdapter("experienceTitle")
fun TextView.setExperienceTitle(data: Portofolio?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("experienceDetail")
fun TextView.setExperienceDetail(data: Portofolio?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("experienceImage")
fun ImageView.setExperienceImage(data: Portofolio){
    load(data.image){
        crossfade(1000)
    }
}