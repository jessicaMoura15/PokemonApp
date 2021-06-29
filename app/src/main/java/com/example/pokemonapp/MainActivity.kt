package com.example.pokemonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=PokemonAdapter(arrayOf("test","test","test","teste2"))
        val lista=findViewById<RecyclerView>(R.id.lista)
        lista.layoutManager=LinearLayoutManager(this)
        lista.adapter=adapter
        adapter.notifyDataSetChanged()
    }
}