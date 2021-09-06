package com.example.happybirthday

class Dice (val diceSides: Int){
    // var sides = 6

    fun role(): Int {
        // val myRandomNumber = (1..diceSides).random()
        // println(myRandomNumber)
        // return myRandomNumber
        return (1..diceSides).random()
    }
}

fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.diceSides} sided dice rolled ${myFirstDice.role()}")
    // myFirstDice.role()
    // myFirstDice.sides = 20
    // println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.role()}")
}