package com.rtee.kotlinbasicss

fun main() {
    var userInput = readln()
    while(userInput == "1"){
        println("While loop executed")
        userInput = readln()
    }
    println("Done with loop")
}