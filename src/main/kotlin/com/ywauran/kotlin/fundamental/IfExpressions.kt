package com.ywauran.kotlin.fundamental

fun exampleIf() {
    val openHours = 7
    val now = 20

    if(now > openHours) {
        println("Office")
    }
}

fun exampleIfElse(): String {
    val openHours = 7
    val now = 20
    val office: String

    if( now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    return office
}

fun exampleIfElseIfElse(): String {
    val openHours = 7
    val now = 7
    val office: String

    office = if(now > 7) {
        "Office already open"
    } else if(now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    return office
}

fun main(){
    println(exampleIf())
    println(exampleIfElse())
    println(exampleIfElseIfElse())
}