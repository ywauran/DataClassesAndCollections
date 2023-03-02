package com.ywauran.kotlin.oop

class Animal (val name: String,
              val weight: Double,
              val age: Int,
              val isMammal: Boolean) {
    fun eat() {
        println("$name sedang makan")
    }

    fun sleep() {
        println("$name sedang tidur")
    }
}

fun main() {
    val kucing = Animal("Kucing", 20.0, 3, true)

    println(kucing.eat())
}