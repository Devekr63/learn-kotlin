package com.playground.functions.utils

fun validateEmail(email : String) = when(email.indexOf("@")){
    in 1..email.length -> when(email.lastIndexOf(".com")){
        email.length-4 -> true
        else -> false
    }
    else -> false
}