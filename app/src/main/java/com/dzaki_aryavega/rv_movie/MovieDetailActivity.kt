package com.dzaki_aryavega.rv_movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        // Ambil data dari Intent
        val movieTitle = intent.getStringExtra("MOVIE_TITLE")
        val movieImage = intent.getIntExtra("MOVIE_IMAGE", 0)

        // Inisialisasi view
        val imgMovieDetail = findViewById<ImageView>(R.id.imgMovieDetail)
        val txtMovieDetail = findViewById<TextView>(R.id.txtMovieDetail)

        // Set data ke view
        imgMovieDetail.setImageResource(movieImage)
        txtMovieDetail.text = movieTitle
    }
}