package com.playground._lambda_

fun main(){
    val range = 1 .. 1_000_000_000
    range.asSequence()
        .take(40)
        .map{n -> n.toDouble()}
        .forEach{n -> println(n)}
}