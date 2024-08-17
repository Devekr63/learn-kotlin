package com.playground._exception_handling_

import java.lang.Exception
import kotlin.NullPointerException

fun main(){
    println(stringLength("Devendra"))
    println(stringLength(null))

    println(mergeName("devendra", "Kumar"))
    println(mergeName("Dev", null))
}

//Try catch block is also an expression

fun stringLength(s : String?) : Int?{
    return try{
        s!!.length
    }catch(ex: Exception){
        println(ex)
        null
    }
}

fun mergeName(firstName : String?, lastName : String?) : String?{
    try{
        firstName!!
    }
    catch(ex : NullPointerException){
        throw NullPointerException("*** first name is null.")
    }
    try{
        lastName!!
    }catch(ex : NullPointerException){
        throw NullPointerException("*** last name is null.")
    }
    return "${firstName.replaceFirstChar {firstName[0].uppercaseChar()}} ${lastName.replaceFirstChar { lastName[0].uppercaseChar() }}"
}