package com.example.kotlinesenciallinkedin

fun main() {
    //Interrupciones y saltos

    var listX = listOf(8,4,5,6,7,8,9)
    var listY = listOf(1,2,3,4,5,6,2,4)

    //Break sirve para detener un bucle
    //Continue sirve para proceder a la siguiente iteracion de su bucle
    //Recorremos ambas listas e imprimimos que elementos se encuentran en ambas
    bucle_externo@ for (x in listX) { //Para parar el bucle externo debemos poner una etiqueta
        for (y in listY) {
            if (x == y) { //Si queremos saber si el numero esta repetido y no nos interesa cuantas veces, debemos escribir break
                println("Al menos hay un numero repetido")
                break@bucle_externo //Al break se anade la etiqueta que agregamos arriba
            }

        }
    }


    //Tomar la frase String de la variable e imprimirla en pantalla sin los espacios utilizando continue
    val frase = "el mundo es una servilleta"
    for (char in frase) {
        if (char == ' ') {
            continue
        }
        print(char)
    }


    //Usaremos break y continue para controlar la ejecucion de nuestros bucles



}