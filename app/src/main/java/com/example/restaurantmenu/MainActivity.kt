// MainActivity.kt
package com.example.restaurantmenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerCuisine: Spinner
    private lateinit var buttonViewMenu: Button
    private lateinit var selectedCuisine: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerCuisine = findViewById(R.id.spinnerCuisine)
        buttonViewMenu = findViewById(R.id.buttonViewMenu)

        val cuisines = arrayOf("Italian", "Chinese", "Indian", "Mexican")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cuisines)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCuisine.adapter = adapter

        spinnerCuisine.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedCuisine = cuisines[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                selectedCuisine = cuisines[0]
            }
        }

        buttonViewMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("CUISINE", selectedCuisine)
            startActivity(intent)
        }

    }
}


