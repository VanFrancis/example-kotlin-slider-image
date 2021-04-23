package com.example.imageslider


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_slider_product.view.*


class SliderAdapter(
    private val imagesList: List<Int>
) : RecyclerView.Adapter<SliderAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_slider_product, parent, false)
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {

        holder.itemView.iv_sliderImage.setImageResource(imagesList[position])
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }


    class ViewPagerHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}