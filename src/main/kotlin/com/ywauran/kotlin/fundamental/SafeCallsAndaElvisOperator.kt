package com.ywauran.kotlin.fundamental

fun main() {
    val text: String? = null
    val textLength = text?.length ?: 7

//    val textLength = text!!.length // ready to go ???
}