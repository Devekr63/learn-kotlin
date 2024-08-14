package com.playground

import com.playground._classes_.inheritance.Student
import kotlin.random.Random

fun isStudent(obj : Any): Boolean {
    return if(obj is Student) true
    else false
}

fun main(){
    val student = Student(name = "Devendra", subject = "Computer Science")
    println(isStudent(student))
    println(isStudent("Student"))

    val num = Random.nextInt(0, 100)
    println(num.toDouble())
}