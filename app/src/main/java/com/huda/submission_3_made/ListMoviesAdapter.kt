package com.huda.submission_3_made

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_data.view.*

class ListMoviesAdapter : RecyclerView.Adapter<ListMoviesAdapter.ListViewHolder>() {
    private val mData = ArrayList<RootData>()
    fun setData(items: ArrayList<RootData>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int):ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_data, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = mData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind (movies: RootData){
            with(itemView){
                Glide.with(itemView.context)
                    .load("https://image.tmdb.org/t/p/w185_and_h278_bestv2"+movies.photo)
                    .apply(RequestOptions().override(512, 512))
                    .into(img_item_photo)
                tv_item_name.text = movies.name
                tv_item_description.text = movies.description
                itemView.setOnClickListener {

                }
            }
        }
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(mData[position])
    }
}