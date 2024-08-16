package com.playground._lambda_

fun main(){
    val map = hashMapOf("Devendra" to 29, "Deepak" to 30, "Aman" to 32)

    println(map.map{it.value}.average().toString().substring(0,6))

    println(map.filter{it.value >= 30}.map{it.key})

    println(map.getOrElse("Devendra"){"Suman"})

    println(map.maxByOrNull { it.value })
}