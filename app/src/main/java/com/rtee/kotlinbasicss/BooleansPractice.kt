package com.rtee.kotlinbasicss

fun main(){
    println("enter your age")
    val enteredValue = readln()
    var age = enteredValue.toInt()
    //age = readln().toInt()
    if (age >= 18 && age < 40) {
        println("you can go to the club")
    } else if (age >= 40){
        println("you can go to the club")
    }else {
        println("you're too young for the club mf")
    }
}