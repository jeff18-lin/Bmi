package com.example.lib

fun main() {
    var p = Person()
    p.height = 65f
    p.weight = 70f

    println("Your BMI is ${p.getBmi()}")
}

class Person {
    var weight : Float = 0f
    var height : Float = 0f

    fun getBmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }
}