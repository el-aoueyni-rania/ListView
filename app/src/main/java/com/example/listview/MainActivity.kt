package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txt1 : TextView
    lateinit var listview : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1 = findViewById(R.id.txt1)
        listview = findViewById(R.id.listview)

        val colors = listOf(
            "Red" , "Green" , "Blue" ,
            "Yellow" , "Black" , "Orange" ,
            "Crimson"
        )
        val adapter = ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , colors)
        listview.adapter = adapter

        listview.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            txt1.text = "Your favorite color is : $selectedItem"

        }

    }
}