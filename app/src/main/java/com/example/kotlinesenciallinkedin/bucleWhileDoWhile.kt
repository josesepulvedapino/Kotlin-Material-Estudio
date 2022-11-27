package com.example.kotlinesenciallinkedin

fun main() {
    //Bucles While y Do-While

    /*
    while (condicion) {
    //Instrucciones a ejecutar
    }
     */

    //Utilizar ciclo while hasta encontrar una potencia mayor a 3000, cuando suceda esto el ciclo while dejara de trabajar.
    var potenciaDeDos = 2
    while (potenciaDeDos <= 3000) {
        println(potenciaDeDos)
        potenciaDeDos = potenciaDeDos * 2
    }
    //Es la primera potencia de 2 que es mayor a 3000
    println("$potenciaDeDos Es la primera potencia de 2 que es mayor a 3000")


    //do while es similar a while pero tiene una diferencia, y es que sabemos que su bloque de instrucciones se ejecutara al menos 1 vez
    var x = 21
    do {
        println(x)
        x++
    } while (x < 20)
    println(x)

    var y = 21  //No se ejecuta ya que y de por si ya es mayor a 20, por lo que no entra en bucle
    while (y <20) {
        println(y)
        y++
    }

    //Usaremos while y do while cuando querramos ejecutar una serie de instrucciones de forma iterativam mientras se cumpla una determinada condicion




}