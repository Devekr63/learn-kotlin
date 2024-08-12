package com.playground._classes_

fun main(){
    val p : Person = Person("Devendra", 29);

    println(p.getName()+" "+p.getAge())
    p.action()

    val iphone : Item = Item(
        manufacturer = "Apple",
        dateOfManufacturing = "01/03/2024",
        name = "Iphone"
    )

    println(iphone)

    val lays : Item = Item(
        manufacturer = "Frito lay",
        dateOfManufacturing = "30/04/2024",
        name = "Spicy masala",
        expiryDate = "30/07/2024",
        price = 40.0F
    )

    println(lays)
    println("${lays.getPrice} ${lays.price}")

    val p1 = Person(name = "Ajay", age = 30, email = "ajay@gmail.com")
    println(p1)
}