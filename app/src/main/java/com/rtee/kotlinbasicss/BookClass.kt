package com.rtee.kotlinbasicss

class Book(val title : String = "Unknown",val author : String = "Anonymous",val yearPublished : Int = 2024){
    init{


    }
}
fun main(){
    var myBook = Book()
    println("${myBook.title}, ${myBook.author}, ${myBook.yearPublished}")
    var customBook = Book("48 Laws of Power", "Robert Greene", 2002)
    println("${customBook.title}, ${customBook.author}, ${customBook.yearPublished}")

}