// MenuActivity.kt
package com.example.restaurantmenu

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuActivity : AppCompatActivity() {

    private lateinit var textViewCuisine: TextView
    private lateinit var recyclerViewMenu: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        textViewCuisine = findViewById(R.id.textViewCuisine)
        recyclerViewMenu = findViewById(R.id.recyclerViewMenu)

        val cuisine = intent.getStringExtra("CUISINE")
        textViewCuisine.text = "Cuisine: $cuisine"

        val menuItems = getMenuItems(cuisine)
        recyclerViewMenu.layoutManager = LinearLayoutManager(this)
        recyclerViewMenu.adapter = MenuAdapter(menuItems)
    }


    private fun getMenuItems(cuisine: String?): List<MenuItem> {
        return when (cuisine) {
            "Italian" -> listOf(
                MenuItem("Pizza", 10, R.drawable.pizza, "Delicious cheesy pizza with a crispy crust."),
                MenuItem("Pasta", 12, R.drawable.pasta, "Creamy Alfredo pasta with fresh herbs."),
                MenuItem("Tiramisu", 8, R.drawable.tiramisu, "Classic Italian dessert with mascarpone cheese."), MenuItem("Pizza", 10, R.drawable.pizza, "Delicious cheesy pizza with a crispy crust."),
                MenuItem("Pasta", 12, R.drawable.pasta, "Creamy Alfredo pasta with fresh herbs."),
                MenuItem("Tiramisu", 8, R.drawable.tiramisu, "Classic Italian dessert with mascarpone cheese."), MenuItem("Pizza", 10, R.drawable.pizza, "Delicious cheesy pizza with a crispy crust."),
                MenuItem("Pasta", 12, R.drawable.pasta, "Creamy Alfredo pasta with fresh herbs."),
                MenuItem("Tiramisu", 8, R.drawable.tiramisu, "Classic Italian dessert with mascarpone cheese.")
            )
            "Chinese" -> listOf(
                MenuItem("Noodles", 9, R.drawable.noodles, "Stir-fried noodles with vegetables and soy sauce."),
                MenuItem("Dumplings", 7, R.drawable.dumplings, "Steamed dumplings with pork filling."),
                MenuItem("Sweet and Sour Pork", 11, R.drawable.ssp, "Crispy pork with sweet and sour sauce."),MenuItem("Noodles", 9, R.drawable.noodles, "Stir-fried noodles with vegetables and soy sauce."),
                MenuItem("Dumplings", 7, R.drawable.dumplings, "Steamed dumplings with pork filling."),
                MenuItem("Sweet and Sour Pork", 11, R.drawable.ssp, "Crispy pork with sweet and sour sauce."),MenuItem("Noodles", 9, R.drawable.noodles, "Stir-fried noodles with vegetables and soy sauce."),
                MenuItem("Dumplings", 7, R.drawable.dumplings, "Steamed dumplings with pork filling."),
                MenuItem("Sweet and Sour Pork", 11, R.drawable.ssp, "Crispy pork with sweet and sour sauce.")

            )
            "Indian" -> listOf(
                MenuItem("Butter Chicken", 13, R.drawable.bc, "Rich and creamy butter chicken."),
                MenuItem("Naan", 3, R.drawable.nn, "Soft and fluffy naan bread."),
                MenuItem("Biryani", 10, R.drawable.bryani, "Spiced rice with chicken and vegetables."), MenuItem("Butter Chicken", 13, R.drawable.bc, "Rich and creamy butter chicken."),
                MenuItem("Naan", 3, R.drawable.nn, "Soft and fluffy naan bread."),
                MenuItem("Biryani", 10, R.drawable.bryani, "Spiced rice with chicken and vegetables."), MenuItem("Butter Chicken", 13, R.drawable.bc, "Rich and creamy butter chicken."),
                MenuItem("Naan", 3, R.drawable.nn, "Soft and fluffy naan bread."),
                MenuItem("Biryani", 10, R.drawable.bryani, "Spiced rice with chicken and vegetables.")
            )
            "Mexican" -> listOf(
                MenuItem("Tacos", 8, R.drawable.taco, "Crispy tacos with beef and fresh toppings."),
                MenuItem("Burritos", 9, R.drawable.bt, "Hearty burritos with beans and cheese."),
                MenuItem("Guacamole", 5, R.drawable.gc, "Fresh guacamole with ripe avocados."), MenuItem("Tacos", 8, R.drawable.taco, "Crispy tacos with beef and fresh toppings."),
                MenuItem("Burritos", 9, R.drawable.bt, "Hearty burritos with beans and cheese."),
                MenuItem("Guacamole", 5, R.drawable.gc, "Fresh guacamole with ripe avocados."), MenuItem("Tacos", 8, R.drawable.taco, "Crispy tacos with beef and fresh toppings."),
                MenuItem("Burritos", 9, R.drawable.bt, "Hearty burritos with beans and cheese."),
                MenuItem("Guacamole", 5, R.drawable.gc, "Fresh guacamole with ripe avocados.")
            )
            else -> listOf()
        }
    }
}
