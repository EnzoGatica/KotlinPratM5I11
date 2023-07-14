package com.example.kotlinpratm5i11

class Perfil {
}

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        hobby?.let {
            println("Likes to $hobby.")
        } ?: println("Doesn't have a hobby.")

        referrer?.let {
            println("Has a referrer named ${it.name}, who likes ${it.hobby}.")
        } ?: println("Doesn't have a referrer.")

        println()
    }
}

