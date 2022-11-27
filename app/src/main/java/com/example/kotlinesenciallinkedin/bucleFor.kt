package com.example.kotlinesenciallinkedin

fun main() {
    //Bucle for
    //los bucle for nos permiten ejecutar un determinado codigo de forma repetida
    //A cada una de las repeticions se les llama iteracion
    //Los bucles for se suelen usar cuando de antemano sabemos cuantas iteraciones vamos a realizar

    //Si tiene mas de una instruccion
    for (x in 1..100) {
        println(x)
    }

    //Si tiene solo una instruccion
    for (i in 1..100) println(i)


    //Recorrer un array de solo lectura
    val animales = arrayOf("Perro","Gato","Elefante")
    for (animal in animales) {
        println("$animal tiene ${animal.length} letras")
    }

    //Mostrar los elementos del array que su indice es par
    for (indice in animales.indices) {
        if (indice % 2 == 0) {
            println(animales.get(indice))
        }
    }

    //Iterar al mismo tiempo sobre el indice y sobre el elemento
    for ((indice, valor) in animales.withIndex()) {
        if (indice % 2 == 0) {
            println(valor)
        }
    }


    //Recorrer una variable de tipo String para saber cuantas veces tiene la letra 'a'
    val nombre = "Maria"
    var numeroDeAes = 0
    for (letra in nombre) {
        if (letra.equals('a')) { //Utilizar comillas simples
            numeroDeAes++ //numeroDeAes = numeroDeAes + 1
        }
    }
    println("El nombre $nombre tiene una cantidad de $numeroDeAes Aes")






}