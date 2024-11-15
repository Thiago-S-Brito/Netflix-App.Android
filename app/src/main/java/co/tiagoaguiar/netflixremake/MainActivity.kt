package co.tiagoaguiar.netflixremake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.netflixremake.model.Category
import co.tiagoaguiar.netflixremake.model.Movie


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Teste", "onCreate")

    //lista vertical
        // categoria 1
            // Listas horizoltais -> f1 - f2 - f3 - f4 ...
        // cat 2
            // Listas horizoltais -> f1 - f2 - f3 - f4 ...

        val categories = mutableListOf<Category>()
        for (j in 0 until 5) {
            val movies = mutableListOf<Movie>()
            for(i in 0 until 15) {
                val movie = Movie(R.drawable.movie)
                movies.add(movie)
            }

            val category = Category("cat $j", movies)
            categories.add(category)
        }


        val adapter = CategoryAdapter(categories)
        val rv: RecyclerView = findViewById(R.id.rv_main)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }

}