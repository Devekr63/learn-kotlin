package com.playground._functions_

import com.playground._functions_.utils.validateEmail
import com.playground._functions_.utils.*

fun main(){
    println("Name of the user : $userName")
    println("Date of birth : $dob")
    println("This mail id is : ${validateEmail(email)}")
}