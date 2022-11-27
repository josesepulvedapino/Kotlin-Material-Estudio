package com.example.kotlinesenciallinkedin


//Funciones con parametros de entrada

fun main() {
    saludar("Jose") //El argumento que pasemos a la funcion debera ser del tipo tipo que declaramos en la funcion saludar(), en este caso String
    //saludar(34) //Error

    felicitarCumple("Jose",21) //Los argumentos se deben pasar en orden
    felicitarCumple(edad = 24, nombre = "Juan") //Se podria hacer lo siguiente
}


//Crear funcion con un parametro

fun saludar(nombre : String) {
    println("Hola, $nombre")
}

//Crear una funcion con mas argumentos

fun felicitarCumple(nombre : String, edad : Int) {
    println("Felicidades $nombre por cumplir $edad anitos")
}


