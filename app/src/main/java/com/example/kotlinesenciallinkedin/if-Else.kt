package com.example.kotlinesenciallinkedin

fun main() {
    //Sentencia If Else//

    //Sirve para ejecutar una instruccion solo en el caso de que se cumpla una determinada condicion

    /*if (condicion) {
    // Instrucciones a ejecutar si se umple
    } else {
    // Instrucciones a ejecutar si no se cumple
    }*/

    val edad = 25
    var esMayor: Boolean = false
    if (edad > 18) {
        esMayor = true
        println("Es mayor de edad")
    } else { //Else no obligatorio
        println("Es menor de edad")
        esMayor = false
    }

    //Particularidad de Kotlin en If-Else
    //Usar if else como expresion y asignar resultados a una variable

    //Ejemplo
    val edadParticularidad = 25
    var esMayorParticularidad = if (edadParticularidad > 18) {
        true
        println("Es mayor de edad")
    } else  { //Else obligatorio
        false
    }
    esMayorParticularidad

    //Ejemplo 2
    val edad2 = 19
    var esMayorParticularidad2 = if (edadParticularidad > 18) true else false
    println(esMayorParticularidad2)


    //Ejemplo If else If
    val edadPersona = 25
    var precio: Double = 0.0
    if (edadPersona < 5) {
        precio = 0.0
    } else if (edadPersona < 12 ) {
        precio = 0.5
    } else if (edadPersona < 65) {
        precio = 0.75
    } else {
        precio = 0.5
    }


}