package com.example.kotlinesenciallinkedin

//Funciones de una expresion
//Funciones que unicamente tienen una instruccion


fun main() {
    val resultado = cuadrado(5.0)
    val resultadoOptimizado = cuadradoOptimizado(5.0)
    println(resultado)
    println(resultadoOptimizado)
}

fun cuadrado(numero : Double) : Double {
    return numero * numero
}

//Se puede escribir tambien como

fun cuadradoOptimizado(numero : Double) = numero * numero

fun mostrarMensaje(mensaje : String) = println(mensaje) //No se recomienda por que no se expresa la funcionalidad de la funcion