package com.example.kotlinesenciallinkedin

import kotlin.math.PI
import kotlin.math.pow

//Funciones que devuelven
//RETURN

fun main() {
    val area = areaDelCirculo(2.5)
    println("El area de un circulo de 2.5 de radio es $area")
}

fun saludar3 (nombre : String) : Unit { //Cuando una funcion no devuelve nada por defecto esta en Unit
    println("Hola $nombre")
    return Unit // No es necesario
}

fun areaDelCirculo(radio : Double) : Double { //Queremos que devuelva el area del circulo indicando el tipo de dato en este caso Double
    return PI * radio.pow(2) //Si queremos devolver algo en nuestra funcion deberemos escribir return seguido del valor o la expresion que nos llevara a conseguir ese resultado
    //Return es la ultima linea de una funcion, no recorre las de abajo
}
