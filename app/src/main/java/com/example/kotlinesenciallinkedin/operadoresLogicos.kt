package com.example.kotlinesenciallinkedin

fun main() {
    //Operadores Logicos//

    val x = 100
    val y = 20
    val z = 15

    //Operador AND, Ambas comparaciones deben ser verdaderas para que arroje true
    println(true && true)
    println(true && false)
    println((z > x) && (z < y))

    //Operador OR, Solo una de las comparaciones deben ser verdaderas para que arroje true
    println((z > x) || (z < y))
    println(true || true)
    println(true || false)

    //Operador NOT, nega y cambia de valor
    println(!false)
    println(!true)

}