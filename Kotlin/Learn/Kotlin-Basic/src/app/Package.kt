// Package 
// Package adalah tempat yang bisa digunakan untuk mengorganisir kode program yang kita buat di Kotlin
// Jika ingin membuat sub package bisa menggunakan tanda . (titik)

package app

fun sayHello(name:String){
    println("Hello $name")
}

fun sayHello(firstName:String, lastName:String){
    println("Hello $firstName $lastName")
}