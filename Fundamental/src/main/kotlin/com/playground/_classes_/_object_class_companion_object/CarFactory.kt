package com.playground._classes_._object_class_companion_object



class CarFactory{
    class Car(){
        var model : String = ""
        var fuelType : String = ""
        var color : Color = Color.NO_COLOR

        constructor(model : String, fuelType : String, color : Color) : this(){
            this.model= model
            this.fuelType = fuelType
            this.color = color
        }
    }

    enum class Color{
        RED,
        YELLOW,
        BLACK,
        SILVER,
        WHITE,
        CYAN,
        GREEN,
        NO_COLOR
    }

    companion object{
        fun createCar(model : String, fuelType : String, color: Color) : Car{
            return Car(model, fuelType, color)
        }
    }
}

fun main(){
    val car : CarFactory.Car = CarFactory.createCar("Mustang", "Petrol", CarFactory.Color.BLACK)

    println("Car model is: ${car.model}, fuel type is: ${car.fuelType} and color is ${car.color}")
}



