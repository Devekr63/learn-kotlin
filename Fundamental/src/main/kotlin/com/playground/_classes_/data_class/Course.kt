package com.playground._classes_.data_class


data class Course(var name : String,
    var code : Int,
    var author : String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT)

enum class CourseCategory{
    DEVELOPMENT,
    DESIGN,
    MARKETING,
    BUSINESS
}

fun main(){
    val c1 = Course(name = "Kotlin for begineers",
        code = 1001,
        author = "Devendra")

    val c2 = c1.copy(code = 1002)
    println(c2)
    println(c1 == c2)
}
