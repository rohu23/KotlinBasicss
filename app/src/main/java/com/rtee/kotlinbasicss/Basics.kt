package com.rtee.kotlinbasicss

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)
fun main(){

    val coffee1 = CoffeeDetails(2,"Rohit","Small",2)
    makeCoffee(coffee1)
}


fun main1(){
    println("Enter first number: ")
    var num1 = readln().toDouble()
    println("Enter second number: ")
    var num2 = readln().toDouble()

    var myResult = divide(num1, num2)
    println("The result of $num1 / $num2 is = $myResult")
}
fun add(num1 : Int, num2 : Int) : Int {
    val result = num1 + num2
    return result
}
fun divide(num1: Double, num2: Double): Double{
    val result = num1/num2.toDouble()
    return result
}
fun askCoffeeDetails()  {
    println("Enter your name here: ")
    var name = readln().toString()
    println("How much sugar would you like in your coffee?:")
    var sugarCount = readln().toInt()
    // Call Function


    //makeCoffee(sugarCount, name)
}



// Define Function

fun makeCoffee(coffeeDetails: CoffeeDetails){
    if (coffeeDetails.sugarCount == 1){
        println("Coffee with ${coffeeDetails.sugarCount} " +
                "spoon of sugar for ${coffeeDetails.name} " +
                " and ${coffeeDetails.creamAmount} creams")
    } else if (coffeeDetails.sugarCount >=2){
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}" +
                " and ${coffeeDetails.creamAmount} creams")
    } else {
        println("Coffee with no sugar for ${coffeeDetails.name}" +
                " and ${coffeeDetails.creamAmount} creams")
    }


}