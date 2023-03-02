package com.ywauran.kotlin.dataclassesandcollections

fun main() {
    //Set
    val integerSet = setOf(1, 2, 3 ,4, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 3, 4)
    val setB = setOf(3, 4, 2, 1)

    println(setA == setB)
    println(5 in setA)

    val mutableSet = mutableSetOf(1, 2 ,3 , 3, 4, 4)

    //mutableSet[2] = 6
    mutableSet.add(6)
    mutableSet.remove(3)
    println(mutableSet)
}