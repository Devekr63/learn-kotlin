package com.playground._classes_.inheritance

open class User(private val user : String, private val type : String) {
    fun login(){
        println("$type, $user logged in.")
    }
}

class Student(name : String) : User(name, Student::class.simpleName.toString())
class Teacher(name : String) : User(name, Teacher::class.simpleName.toString())

fun main(){
    val student = Student("Deepak")
    val teacher = Teacher("Devendra")

    student.login()
    teacher.login()
}