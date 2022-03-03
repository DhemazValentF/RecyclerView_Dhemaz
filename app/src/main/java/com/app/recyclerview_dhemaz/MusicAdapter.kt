package com.app.recyclerview_dhemaz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(private val context: Context, private val music: List<Music>, val listener: (Music) -> Unit)
    : RecyclerView.Adapter<MusicAdapter.BookViewHolder>(){

    class BookViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgBook = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBook = view.findViewById<TextView>(R.id.tv_item_name)
        val descBook = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(music: Music, listener: (Music) -> Unit) {
            imgBook.setImageResource(music.imgBook)
            nameBook.text = music.nameBook
            descBook.text = music.descBook
            itemView.setOnClickListener{
                listener(music)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bindView(music[position], listener)
    }

    override fun getItemCount(): Int = music.size
}