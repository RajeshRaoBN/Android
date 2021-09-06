package com.rbnr.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectedFoodTxt: TextView = findViewById(R.id.android_text) as TextView
        selectedFoodTxt.setOnClickListener {
            selectedFoodTxt.text = "Hungary Jacks"
        }

        //selectedFoodTxt.text = "Hungary Jacks"
    }
}