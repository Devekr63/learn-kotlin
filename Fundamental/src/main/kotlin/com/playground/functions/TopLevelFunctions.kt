package com.playground.functions

import com.playground.functions.utils.validateEmail
import com.playground.functions.utils.*

fun main(){
    println("Name of the user : $userName")
    println("Date of birth : $dob")
    println("This mail id is : ${validateEmail(email)}")
}