package com.playground._lambda_

import com.playground.data.Course
import com.playground.data.courseList

fun main(){
    val list = listOf(listOf(1,2,3), listOf(5,6,7))

    val doubleList = list.map { values -> values.map { num -> num.toDouble() } }
    println(doubleList)

    val flatDoubleList = list.flatMap { values -> values.map { num -> num.toDouble() }}
    println(flatDoubleList)

    println(list.flatMap{numbers -> numbers.filter{number -> number and 1==0}}.reduce{ s, n -> s+n})

    val courses = courseList()
    println(filterCourseByTopic("java", courses))

    println("\n How the flat map works....\n")

    println(courses.flatMap { course -> course.topicsCovered })

    println(courses.flatMap { course -> course.topicsCovered
        .filter { it.lowercase() == "java"  } })

    courses.flatMap { course -> course.topicsCovered
        .filter { it.lowercase() == "java"  }
        .map{course.name}}
        .forEach{println(it)}
}

fun filterCourseByTopic(filterTopic : String, courses : MutableList<Course>) : List<String>{
    return courses.flatMap { course ->
        val courseName = course.name
        course.topicsCovered
            .filter{topic -> topic.lowercase() == filterTopic}
            .map{courseName}
    }
}