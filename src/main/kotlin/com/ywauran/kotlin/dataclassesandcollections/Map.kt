package com.ywauran.kotlin.dataclassesandcollections

fun main() {
    //Map
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital["Kuala Lumpur"])
    //println(capital.getValue("Kuala Lumpur"))

    println(capital.keys)
    println(capital.values)

    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Kuala Lumpur", "Malaysia")

    println(mutableCapital)
}