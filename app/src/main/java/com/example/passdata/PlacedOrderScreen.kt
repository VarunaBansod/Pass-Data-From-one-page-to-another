package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PlacedOrderScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placed_order_screen)
        val orderOfCust = intent.getStringArrayExtra(MainActivity.key)
        val orderList= findViewById<TextView>(R.id.tvOrder)
        orderList.text= orderOfCust.toString()


    }
}