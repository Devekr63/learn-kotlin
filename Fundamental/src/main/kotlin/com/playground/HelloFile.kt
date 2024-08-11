package com.playground

import kotlin.reflect.typeOf

fun main(){
    println("Hello World")
    val firstName = "Devendra"
    val lastName = "kumar";

    val num = 100L
    val no:Long = 100;
    println(num+no)

    println("Name of the author: $firstName ${lastName[0].uppercase()+lastName.substring(1, lastName.length)}")

    var balance = 100_000_001

    val condition = if(balance > 100_000_000){
        println("You are rich.")
        balance
    }else{
        println("You are poor.")
        balance
    }

    println(condition)
}