package com.playground._classes_

import com.playground.validateEmail

class Person (private val name : String = "", private val age : Int = 0){

//    secondary constructor
//    constructor() : this("", 0)
    var email : String = ""

    constructor(name : String, age : Int, email : String) :
            this(name, age){
                println("Person created")
                this.email = email
            }

    init {
        println()
        println("New Person object requested")
    }

    fun getName() : String{
        return this.name
    }

    fun getAge() : Int{
        return this.age;
    }

    fun action(){
        println("Person walks")
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, email='$email')"
    }

}