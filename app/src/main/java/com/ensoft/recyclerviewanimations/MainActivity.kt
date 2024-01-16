package com.ensoft.recyclerviewanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list: MutableList<Item> = ArrayList()
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        var counter = 1
        for (i in 0 until 25){
            list.add(Item("Item $counter", "Description $counter"))
            counter++
        }
        val adapter = RecyclerviewAdapter(list)
        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = adapter
    }
}