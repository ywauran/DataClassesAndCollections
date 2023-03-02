package com.ywauran.kotlin.dataclassesandcollections

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User (name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("Harke", 21)
    val dataUser = DataUser("Harke", 21)

    print(dataUser.name)

    println(user)
    println(dataUser)

    val (name, age) = dataUser
    println(name)
}