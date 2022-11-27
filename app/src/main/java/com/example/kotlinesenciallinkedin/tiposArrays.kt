package com.example.kotlinesenciallinkedin

fun main() {
    //Tipos de datos basicos : Arrays//
    var miArray = arrayOf(25, "perro", "a", 22.2, true) //Declarar array con elementos de tipos variados (Int, String, Char, Double y Boolean)

    var miArrayDeInt = arrayOf<Int>(7,6,32) //Declarar array y declarar que tipo de dato poseen los valores
    //Otra forma de escribirlo mas eficiente
    var miArrayDeIntEficiente = intArrayOf(7,4,23)

    //Acceder a sus posiciones
    println(miArrayDeInt[2])
    println(miArrayDeInt.get(2))

    //Modificar valor forma 1
    miArrayDeInt[2] = 96

    println(miArrayDeInt[2])

    //Modificar valor forma 1
    miArrayDeInt.set(2,88)

    println(miArrayDeInt[2])

    //Consultar tamano de array
    println(miArrayDeInt.size)

    //Ver si tiene un elemento en concreto
    println(miArrayDeInt.contains(25))

    //Encontrar posicion de un elemento en el array
    println(miArrayDeInt.indexOf(6)) //Si preguntamos un valor que no se encuentra dentro del array arrojara -1





}