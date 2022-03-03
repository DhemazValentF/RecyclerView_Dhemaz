package com.app.recyclerview_dhemaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookList = listOf<Music>(
            Music(
                R.drawable.pamungkas,
                nameBook = "To The Bone",
                descBook = "Pamungkas"
            ),
            Music(
                R.drawable.payung,
                nameBook = "Akad",
                descBook = "Payung Teduh"
            ),
            Music(
                R.drawable.raisa,
                nameBook = "Raisa",
                descBook = "Raisa"
            ),
            Music(
                R.drawable.tulus,
                nameBook = "Monokrom",
                descBook = "Tulus"
            ),
            Music(
                R.drawable.virgoun,
                nameBook = "Surat Cinta",
                descBook = "Virgoun"
            ),


            )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_book)
        val horizontalLayoutManagaer =
            LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MusicAdapter(this, bookList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}