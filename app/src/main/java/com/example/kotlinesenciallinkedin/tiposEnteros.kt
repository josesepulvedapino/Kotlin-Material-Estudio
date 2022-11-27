package com.example.kotlinesenciallinkedin

fun main() {
    //Tipos de datos basicos : Numeros enteros//


    //Tipo Byte
    val miByte : Byte = 1 //Dato primitivo y que ocupa menos espacio (8/bit) (Se usa para representar valores entre -128 y 127)

    //Tipo Short
    val miShort: Short = 300 //Dato primitivo y ocupa el doble que los Byte (16/bit) (Se usa para representar valores entre -32768 y 32767)

    //Tipo Int
    val miInt : Int = 72 //Dato mas usado para representar numeros enteros (32/bit)
    //(Se usa para representar valores:)
    println("${Int.MIN_VALUE} y ${Int.MAX_VALUE}")

    //Tipo Long
    val miLong : Long = 165 //Dato mas grande que Int (64/bit)
    //(Se usa para representar valores:)
    println("${Long.MIN_VALUE} y ${Long.MAX_VALUE}")
}