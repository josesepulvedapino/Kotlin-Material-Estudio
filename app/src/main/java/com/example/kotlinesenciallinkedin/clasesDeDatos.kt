package com.example.kotlinesenciallinkedin

fun main() {
    val miDireccion = Direccion("La Rotonda",1710,3780000,"Chillan")
    println(miDireccion.toString())

    val miDireccion2 = Direccion("La Rotonda",1710,3780000,"Chillan")



    println("Es miDireccion igual a miDireccion2? ${miDireccion.equals(miDireccion2)}") //Devuelve Boolean

    val miDireccion3 = miDireccion.copy(numero = 1721) //Se asigna la mismas propiedades a excepcion del numero que cambia

    println(miDireccion3.toString())
}