package com.example.kotlinesenciallinkedin

fun main(){
    //Operadores Aritmeticos//

    //Suma de dos Int
    val a = 8
    val b = 10
    a + b

    //Suma de Long e Int
    val ab : Long = 8
    val ba = 10
    val c = ab + ba //Sumar un Long y Int el valor c sera de tipo Long ya que es el mas amplio

    //Los tipos Short y Byte seran promocionados a Int
    val d: Short = 7
    val e: Short = 9
    val f = d + e //Kotlin infiere que esta variable es de tipo Int

    val g = 9.6 + 5.97

    //Concatenacion de String se utiliza el operador Suma +
    val nombre = "Ana" + " " + "Salvador"


    //Resta Double e Int
    val primerNumero = 5.6
    val segundoNumero = 9
    val resultadoResta = primerNumero - segundoNumero //Restar Long e Int el valor resultadoResta sera de tipo Double ya que es el mas amplio

    //Multiplicacion
    val operando1 = 5
    val operando2 = 6
    val resultadoMultiplicacion = operando1 * operando2

    //Division
    val x = 1
    val y = 2
    val resultadoDivision = x.toDouble() / y //Para recibir el resultado esperado al menos uno de los operadores se debe transformar a toDouble()
    println(resultadoDivision)

    //Resto
    val resultadoResto = 5 % 2
    println(resultadoResto)

    //Podemos saber si un numero es par si el resultado del resto entre 2 es 0
    4 % 2 // es 0, entonces es par
    5 % 2 // es 1, entonces es impar








}