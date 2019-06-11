package com.develop.grizzzly.pediatry.adapters.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.develop.grizzzly.pediatry.R
import com.develop.grizzzly.pediatry.network.model.News

class NewsAdapter: PagedListAdapter<News, NewsAdapter.NewsViewHolder>(NewsDiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.news_item, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(news: News) {
//            itemView.setOnClickListener {
//                val action = PartListFragmentDirections.actionPartListFragmentToPartDetailFragment(part)
//                Navigation.findNavController(it).navigate(action)
//            }
//            itemView.tv_part_item_name.text = part.email
//            itemView.tv_part_id.text = part.id.toString()
//            Picasso.get().load(part.avatar).into(itemView.profile_image)
        }
    }



}