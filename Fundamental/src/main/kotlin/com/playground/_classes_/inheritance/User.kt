package com.playground._classes_.inheritance

open class User(private val user : String, private val type : String) {
    open var id : Int = 0
    fun login(){
        println("$type, $user logged in.")
    }

    open fun getUserInfo() : String{
        return "$user $type"
    }
}

class Student(private val name : String, private val subject : String) : User(name, Student::class.simpleName.toString()){

    override var id : Int = 10
    override fun getUserInfo(): String {
        return "${super.getUserInfo()}, \nsubject taken by student $subject"
    }
}
class Teacher(name : String) : User(name, Teacher::class.simpleName.toString())

fun main(){
    val student = Student("Deepak", "Computer Science")
    val teacher = Teacher("Devendra")

    student.login()
    teacher.login()
    println(student.getUserInfo())
}