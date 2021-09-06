package com.rbnr.diceroler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            // val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            // toast.show()

            rollDice()

            // println("Roll Button Clicked")
        }
    }

    // Roll the dice and update the result on the screen

    private fun rollDice() {
        // Create dice with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Refresh screen with new data
        val resultTextView: TextView = findViewById(R.id.textView)
        val diceImage: ImageView = findViewById(R.id.imageView)

        // Determine what drawable resource is to be displayed
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update image with the right drawable resource
        diceImage.setImageResource(drawableResource)

        // Update content description
        diceImage.contentDescription = diceRoll.toString()
        resultTextView.text = diceRoll.toString()
    }
}

class Dice (val numSides: Int) {

    fun roll (): Int {
        return (1..numSides).random()
    }
}