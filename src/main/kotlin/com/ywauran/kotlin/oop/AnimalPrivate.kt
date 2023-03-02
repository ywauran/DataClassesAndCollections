package com.ywauran.kotlin.oop

class AnimalPrivate (private var name: String,
                     private val weight: Double,
                     private val age: Int,
                     private val isMammal: Boolean) {
    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val cat = AnimalPrivate("kathy", 2.5, 2, true)
    println(cat.getName())
    println(cat.setName("kat"))
    println(cat.getName())
}