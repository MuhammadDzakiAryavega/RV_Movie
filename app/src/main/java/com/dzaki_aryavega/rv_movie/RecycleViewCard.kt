package com.dzaki_aryavega.rv_movie

import adapter.MovieAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzaki_aryavega.rv_movie.Model.ModelMovie

class RecycleViewCard : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var movieAdapter: MovieAdapter? = null
    private var movieList = mutableListOf<ModelMovie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view_card)

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.rvMovieList) as RecyclerView
        movieAdapter = MovieAdapter(this, movieList)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieAdapter

        prepareMovieList()

        // Set padding untuk edge-to-edge

    }

    // Mengisi daftar film ke dalam list
    private fun prepareMovieList() {
        var movie = ModelMovie("venom", R.drawable.venom)
        movieList.add(movie)
        movie = ModelMovie("avatar", R.drawable.avatar)
        movieList.add(movie)
        movie = ModelMovie("batman", R.drawable.batman)
        movieList.add(movie)
        movie = ModelMovie("end game", R.drawable.end_game)
        movieList.add(movie)
        movie = ModelMovie("Hulk", R.drawable.hulk)
        movieList.add(movie)
        movie = ModelMovie("DeadPool And Wolfrine", R.drawable.deadpool_and_wolfrine)
        movieList.add(movie)
        movie = ModelMovie("jumanji", R.drawable.jumanji)
        movieList.add(movie)
        movie = ModelMovie("Lucy", R.drawable.lucy)
        movieList.add(movie)
        movie = ModelMovie("spiderman", R.drawable.spiderman)
        movieList.add(movie)

        movieAdapter!!.notifyDataSetChanged()
        }
}
