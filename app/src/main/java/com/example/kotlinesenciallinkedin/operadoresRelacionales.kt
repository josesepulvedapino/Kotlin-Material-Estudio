package com.example.kotlinesenciallinkedin

fun main() {
    //Operadores Relacionales//

    println(8 > 7)
    println(7 > 8)

    val a = 9
    val b = 11.5
    println(a<b) //Se pueden comparar valores de tipo Int y Double

    val c = 12
    val d = 10
    println(c >= d)

    println(c <= d)


    //Usaremos operadores relaciones mayor, menor, mayor o igual, menor o igual siempre que queramos comparar valores numeros, mezclando diferentes tipos
    //Usaremos igualdad y desigualdad para comprar cualquier tipo de objeto en donde ambos operandos pertenezcan al mismo tipo

    //Igualdad
    println(c == d)

    //println(a == b) //No se pueden comparar valores al preguntar igualdad ya que ambas variables son de distinto tipo de dato
    //Se pueden cambiar el tipo de dato
    println(a.toDouble() == b)

    println("maria" == "Maria") //Comparar valores de tipo String

    //Desigualdad
    println(c != d)






}