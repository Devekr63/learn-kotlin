package com.playground._lambda_

fun main(){
    val addTwoNum = {x : Int, y : Int ->
        x+y
    }

    println(addTwoNum(3,7))

    val multipleTwoNum = {x : Int, y : Int ->
        x*y
    }

    println(multipleTwoNum(3,7))

    var result : Int = 0

    val addAndSave = {x : Int, y : Int ->
        result = x+y
        x+y
    }

    addAndSave(3,7)
    println(result)

    println(calculator(10.22, 21.254, {x : Double, y : Double -> x+y}))
    println(calculator(10.22, 21.254) { x: Double, y: Double -> x * y })
}

//Higher order function
fun calculator(x : Double, y : Double, op : (x : Double, y : Double) -> Double) : Double{
    return String.format("%.3f",op(x, y)).toDouble()
}
