package com.playground._classes_._object_class_companion_object

import com.playground._classes_.inheritance.Student

object Authenticate{
    fun authenticate(student : Student, password : String){
        if(password == "12345")
            println("${student.getUserInfo()} is authenticated.")
    }
}

fun main(){
    Authenticate.authenticate(Student("Devendra", "Maths"), "12345")
}