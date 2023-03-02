package com.ywauran.kotlin.fundamental

fun main() {
//    val text: String = null // compile time error
    val text: String? = null
//    val textLength = text.length // compile time error
    if(text != null) {
        val textLength = text.length
    }
}