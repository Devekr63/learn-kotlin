package com.playground._interfaces_

import com.playground._classes_.data_class.Course

interface CourseRepository{
    fun getById(id : Int) : Course

    fun getAllCourse() : Array<Course>{
        return arrayOf(
            Course("Kotlin", 100, "Mr Tiger Strong"),
            Course("Java", 101, "Ms Smith Williams"),
            Course("Web Dev", 102, "Mad Dev"))
    }
}

class SqlCourseRepo : CourseRepository{
    override fun getById(id: Int): Course {
        return Course("Kotlin", id, "Mr Tiger Strong")
    }
}

fun main(){
    val sqlCourseRepo = SqlCourseRepo()
    val kotlinCourse : Course = sqlCourseRepo.getById(100)
    println(kotlinCourse)
}