package com.example.lab1_android.data

import com.example.lab1_android.R
import com.example.lab1_android.model.Images

class Datasource {
    fun loadImages (): List<Images> {
        return listOf<Images>(
            Images(R.drawable.img1, R.string.name1),
            Images(R.drawable.img2, R.string.name2),
            Images (R.drawable.img3, R.string.name3)
        )
    }
}