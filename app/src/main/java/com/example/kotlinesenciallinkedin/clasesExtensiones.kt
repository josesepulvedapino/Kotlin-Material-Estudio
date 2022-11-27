package com.example.kotlinesenciallinkedin

fun main() {
    val nombre = "Jose"

    val primerCaracter = nombre.first()
    println(primerCaracter)

    val segundoCaracter = nombre.segundo()
    println(segundoCaracter)

    val segundoCaracterPropiedad = nombre.segundoPropiedad
    println(segundoCaracterPropiedad)
}

//Extender una clase predefinida de Kotlin
//Extender funcion
fun String.segundo() = get(1)

//Extender propiedad
val String.segundoPropiedad
get() = get(1)

