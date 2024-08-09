package com.playground

import kotlin.reflect.typeOf

fun main(){
    println("Hello World")
    val firstName = "Devendra"
    val lastName = "kumar";

    println("Name of the author: $firstName ${lastName[0].uppercase()+lastName.substring(1, lastName.length)}")
}