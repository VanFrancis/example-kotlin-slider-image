package com.example.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList= listOf(
            R.drawable.card01,
            R.drawable.card02,
            R.drawable.card03,
            R.drawable.card04)

        val adapter = SliderAdapter(imageList)

        vp_slider_product.adapter = adapter
    }
}