package com.playground._lambda_

import com.playground.data.courseList
import com.playground.data.Course
import com.playground.data.CourseCategory

fun main(){
    val courses = courseList()

    //*** filter operation ***
    val devFilter = {course : Course ->
        course.category == CourseCategory.DEVELOPEMENT}

    val businessFilter = {course : Course ->
        course.category == CourseCategory.BUSINESS}

    val kafkaFilter = {course : Course -> course.topicsCovered.containsAll(arrayListOf("Kafka", "SpringBoot"))}

//    filterCourseOnCategory(courses, devFilter)
//    filterCourseOnCategory(courses, businessFilter)
//    filterCourseOnCategory(courses, kafkaFilter)

    //*** map operation ***
    displayCourse(courses, businessFilter)

}

fun filterCourseOnCategory(courses : MutableList<Course>,
                           filterCourse : (course: Course) -> Boolean)
{
    courses.filter { filterCourse.invoke(it) }
        .forEach{
            println(it)
        }
}

fun displayCourse(courses : MutableList<Course>, filterCourse: (course: Course) -> Boolean){

    courses.filter(filterCourse)
        .map{course -> "Course : ${course.name}, course category : ${course.category}"}
        .forEach{course -> println(course)}
}