package com.gulfemervaaltun.recycleviewkullanimi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gulfemervaaltun.recycleviewkullanimi.databinding.CardCellBinding

class CardAdapter (
    private val books: List<Book>,
    private val clickListener: BookClickListener

)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from =LayoutInflater.from(parent.context)
        val binding= CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding,clickListener)

    }

    override fun getItemCount(): Int =books.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindBook(books[position])
    }
}