package com.playground._scope_functions_

import com.playground._classes_.data_class.Course
import com.playground._classes_.data_class.CourseCategory

//purpose of scope function is to execute a block of code within the context of an object.
fun main(){
    //example of run
    var nameNullable : String? = null
    nameNullable?.run {
        nameNullable = "Devendra"
        println(this)
    }

    val arr = arrayOf(1,2,3,4,5)
    val sum = arr.map { it*2 }.filter{it > 5}.let{println(it); it.sum()}
    println(sum)

    val course : Course? = Course("Java 8 features", 100, "Dev")
    println(course)
    modifyCourseData(course, "Java Stream Api", 101, null, null)

    //non extension scope functions
    //with example
    exploreWith()
}

//let, apply and also examples
fun modifyCourseData(course : Course?, newName : String?, newCode : Int?, newCategory : CourseCategory?, newAuthor : String?){
//    newCode?.apply {course?.apply { this.code = newCode }}
//    newName?.apply {course?.apply { this.name = newName }}
//    newAuthor?.apply{course?.apply { this.author = newAuthor }}
//    newCategory?.apply {course?.apply { this.courseCategory = newCategory }}

    newCode?.let {course?.apply { this.code = it }}.also { println(it) }
    newName?.let {course?.apply { this.name = it }}.also { println(it) }
    newAuthor?.let{course?.apply { this.author = it }}.also { println(it) }
    newCategory?.let {course?.apply { this.courseCategory = it }}.also { println(it) }

    course?.also { println(it) }
}

fun exploreWith(){
    val numbers = listOf(1,2,3,4,5,6)

    val res = with(numbers){
       map { number -> number*2 }
       filter{it>(numbers.sum()/numbers.size)}
        sum()
    }
    println(res)
}