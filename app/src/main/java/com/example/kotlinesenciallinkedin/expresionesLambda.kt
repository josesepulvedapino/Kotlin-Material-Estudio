package com.example.kotlinesenciallinkedin

//Expresiones lambda { it }
fun main() {
    val numeros = listOf(1,2,4,67,6,45,3)
    val nombres = listOf("jose","jorge","adrian","sara","luis")

    val numerosMayores40 = numeros.filter { it > 40 }
    val nombresConJ = nombres.filter { it.contains('j') }

    println(nombresConJ)
    println(numerosMayores40)

    println(nombres.map { it.uppercase() })

    println(nombres.any{it.startsWith('j')})

    println(nombres.all{it.startsWith('j')})

    println(nombres.none(){it.startsWith('b')})

    //Primero elemento que la contiene, Si no encuentra alguno devuelve null
    println(nombres.find { it.contains('j') })

    //Mostrar cuantos elementos de la lista la contiene
    println(nombres.count { it.contains('j') })



}