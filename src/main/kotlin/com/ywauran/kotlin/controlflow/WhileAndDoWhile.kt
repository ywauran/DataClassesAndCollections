package com.ywauran.kotlin.controlflow

fun main() {
    var counterA = 1
    while (counterA <= 7){
        println("Hello, World!")
        counterA++
    }

    var counterB = 1
    do {
        println("Hello, World!")
        counterB++
    } while (counterB <= 7)
}