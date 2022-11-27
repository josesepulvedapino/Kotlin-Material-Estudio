package com.example.kotlinesenciallinkedin

fun main() {
    //Convertir de Short a Int//
    val miShort: Short = 5
    val miSInt : Int = miShort.toInt()

    //Convertir de Long a Int//
    var miLong: Long = 300_000_000 //Las conversiones deben estar dentro del rango del otro tipo de dato o se imprimiran datos totalmete distintos
    var miOtroInt : Int = miLong.toInt() //Int solo admite 300_000_000 y no 3000_000_000
    println(miOtroInt)

    //Convertir de Coma Flotante a Short//
    val miDouble = 5.2
    //val miOtroShort : Short = miDouble.toShort()//

    //Convertir de String a Int//
    val edad = "28"
    val edadNumerica = edad.toInt() //Si la variable edad no posee valores que se pueden parsear a Int producira Error NumberFormatException
    println(edadNumerica)


}