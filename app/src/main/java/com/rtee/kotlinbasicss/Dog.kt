package com.rtee.kotlinbasicss

class Dog (val name: String, val breed : String = "Daisy", var age : Int = 0 ){
    init{
        bark()
    }
    fun bark(){
        println("$name says Woof Woof")
    }
}
fun main(){
    var daisy = Dog("Daisy", "Labrador", 1)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    daisy.age = 2
    println("A year has passed")
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
}

