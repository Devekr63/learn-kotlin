package com.playground

import java.time.LocalDate
import java.util.Date
import java.util.Locale

fun main(){
    val range = 1..10
    for(num in range){
        println(num)
    }

    for(evenNum in 0..10 step 2){
        println(evenNum)
    }

    for(reveseNum in 5 downTo 0){
        println(reveseNum)
    }

    println("devekr12@gmail.com".lastIndexOf(".com"))

    println(validateEmail("devekr12@rediff.com"))

    labelExample()

    personDetails(name = "Ravi", dob = LocalDate.now(), email = "ravi.kumar@gmail.com")
}

fun validateEmail(email : String) = when(email.indexOf("@")){
    in 1..email.length -> when(email.lastIndexOf(".com")){
        email.length-4 -> true
        else -> false
    }
    else -> false
}

fun  labelExample(){
    firstFiveWord@ for(i in 0..4){
        print('a'+i)
        oneToThree@ for(j in 1..5){
            if(i+1 == j){
                print("->"+(i+1))
                break@oneToThree
            }
        }
        println()
    }
}

fun personDetails(name : String, dob : LocalDate = LocalDate.now(), email : String = ""){
    println("Name of the person is $name, email is $email and dob is $dob")
}

