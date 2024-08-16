package com.playground._null_handling_

import kotlin.random.Random

fun main(){
    val movie : Movie = Movie("Bahubali", "Hindi")
    val nullMovie : Movie? = null

    startMovie(movie)
    startMovie(nullMovie)

    //Another way of handling nullable types
    nullMovie?.run {
        showMovieLanguage(this)
    }

    //Use of Elvis operator to handle null assignment to some default object
    val newMovie : Movie = getMovie() ?: Movie("Sholay", "Hindi")

    startMovie(newMovie)

    collectionsNullability()
}

fun collectionsNullability() {
    val list : MutableList<String?>? = mutableListOf("dev", "kumar", "rao")
    list?.forEach { println(it) }

    list?.add(null)

    list?.forEach{println(it!!.length)}
}

class Movie(val name : String?, val language : String?){
    override fun toString(): String {
        return "Movie(name=$name, language=$language)"
    }
}

fun startMovie(movie : Movie?){
    //println(movie) //this method prints the null as a string
    println(movie!!) //use of null-assertions let the jvm through null pointer exception if movie is null
}

fun showMovieLanguage(movie : Movie){
    println("Language of the movie is: ${movie.language}")
}

fun getMovie() : Movie?{
    val movies = arrayOf(null,
        Movie("MIB", "English"),
        Movie("Avengers", "English"),
        Movie("Ra-one", "Hindi"),
        Movie("DDLJ", "Hinde")
    )

    return movies[Random.nextInt(0, movies.size)]
}