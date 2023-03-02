package com.ywauran.kotlin.fundamental


//Functions
fun greetings(name: String): String {
    return "Halo $name"
}
fun main() {
    //Char
    val character = "A"
    //String
    val textString = "Kotlin"

    println(character)
    for (char in textString) {
        println("$char")
    }

    println(greetings("Harke"))

    //If Expressions
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > openHours) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    println(office)

}
