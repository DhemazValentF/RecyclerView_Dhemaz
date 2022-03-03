package com.app.recyclerview_dhemaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val movie = intent.getParcelableExtra<Music>(MainActivity.INTENT_PARCELABLE)

        val imgMovie = findViewById<ImageView>(R.id.img_item_photo)
        val nameMovie = findViewById<TextView>(R.id.tv_item_name)
        val descMovie = findViewById<TextView>(R.id.tv_item_description)

        imgMovie.setImageResource(movie?.imgBook!!)
        nameMovie.text = movie.nameBook
        descMovie.text = movie.descBook
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}