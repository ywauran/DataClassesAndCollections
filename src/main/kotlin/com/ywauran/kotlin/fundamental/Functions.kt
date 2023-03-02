package com.ywauran.kotlin.fundamental

fun greetins(name: String): String {
    return "Halo $name"
}

fun setUser(name: String, age: Int): String = "Perkenalkan nama saya $name, umur $age"

fun main() {
    println(greetins("Harke"))
    println(setUser("Harke", 21))
}