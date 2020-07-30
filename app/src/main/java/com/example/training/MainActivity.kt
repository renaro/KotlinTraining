package com.example.training

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        planet_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        planet_list.adapter = PlanetListAdapter()
    }
}
