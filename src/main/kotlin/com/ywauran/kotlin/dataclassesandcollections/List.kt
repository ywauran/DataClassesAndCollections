package com.ywauran.kotlin.dataclassesandcollections

fun main() {
    //List
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    println(numberList)
    println(numberList[4])
    val anyList = mutableListOf(1, "A", "Kotlin", true)
    anyList.add(4, false)
    anyList.add(5, "Programming")
    println(anyList)
}