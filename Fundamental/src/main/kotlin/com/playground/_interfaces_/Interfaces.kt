package com.playground._interfaces_

import com.playground._classes_.data_class.Course

interface CourseRepository{
    val isCoursePersisted : Boolean

    fun getById(id : Int) : Course

    fun getAllCourse() : Array<Course>{
        return arrayOf(
            Course("Kotlin", 100, "Mr Tiger Strong"),
            Course("Java", 101, "Ms Smith Williams"),
            Course("Web Dev", 102, "Mad Dev"))
    }
}

class SqlCourseRepo : CourseRepository{
    override var isCoursePersisted : Boolean = true;

    lateinit var name : String
    var id : Int = 100

    override fun getById(id: Int): Course {
        return Course("Kotlin", id, "Mr Tiger Strong")
    }
}

fun main(args : Array<String>){
    val sqlCourseRepo = SqlCourseRepo()
    val kotlinCourse : Course = sqlCourseRepo.getById(100)
    println(kotlinCourse)

    val ab= AB();
    ab.doSomething()
}

//Function conflict handling in interfaces
interface A{
    fun doSomething(){
        println("Inside Interface A.")
    }
}

interface B{
    fun doSomething(){
        println("Inside Interface B.")
    }
}

class AB : A, B{
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
    }
}