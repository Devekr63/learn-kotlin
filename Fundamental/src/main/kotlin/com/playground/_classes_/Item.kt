package com.playground._classes_

class Item(val manufacturer : String,
           val dateOfManufacturing : String,
           val name : String)
{
    var expiryDate : String = ""

    private var price : Float = 0.0F

    var getPrice: Float = 0.0f
        get() = price

    constructor(manufacturer: String,
                dateOfManufacturing: String,
                name : String,
                expiryDate : String) :
            this(manufacturer, dateOfManufacturing, name)
    {
        this.expiryDate = expiryDate;
    }

    constructor(manufacturer: String,
                dateOfManufacturing: String,
                name : String,
                expiryDate : String,
                price : Float) :
            this(manufacturer, dateOfManufacturing, name)
    {
        this.expiryDate = expiryDate
        this.price = price
    }

    override fun toString(): String {
        return "Item(manufacturer='$manufacturer', dateOfManufacturing='$dateOfManufacturing', name='$name', expiryDate='$expiryDate', price=$price)"
    }
}