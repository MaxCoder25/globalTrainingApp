package com.example.globaltrainingapp_11.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.globaltrainingapp_11.entidades.CategoriaRutinasEntity
import com.squareup.picasso.Picasso
/*
class ListCategoriaRutinasAdapter(val listRutinas: List<CategoriaRutinasEntity>, val onClickItemSelected: (CategoriaRutinasEntity) -> Unit) {
    RecyclerView.Adapter<NewsViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return NewsViewHolder(inflater.inflate(R.layout.news_items, parent, false))
        }

        override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
            val item = listRutinas[position]
            holder.render(item, onClickItemSelected)
        }

        override fun getItemCount(): Int = listRutinas.size
    }

    class NewsViewHolder(itemNews: View) : RecyclerView.ViewHolder(itemNews) {

        private val binding: NewsItemsBinding = NewsItemsBinding.bind(itemNews)

        fun render(itemNewsEntity: CategoriaRutinasEntity, onClickItemSelected: (CategoriaRutinasEntity) -> Unit) {
            binding.  txtTitleNews.text = itemNewsEntity.title
            Picasso.get().load(itemNewsEntity.img).into(binding.imageView)

            itemView.setOnClickListener {
                onClickItemSelected(itemNewsEntity)
            }
        }

    }
}*/