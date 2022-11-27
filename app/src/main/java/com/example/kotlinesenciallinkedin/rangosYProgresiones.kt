package com.example.kotlinesenciallinkedin

fun main() {
    //Rangos y Progresiones

    //Un rango es una secuencia de elementos definidas por un inicio, un final y un paso

    1..5 //rango del 1 al 5 con los numeros incluidos


    //Consultar si 3 esta dentro del rango de 1 a 5
    println(3 in 1..5)

    //Los rangos se utilizan mucho con el bucle for para realizar un numero determindo de iteraciones
    for (x in 1..5){ //Forma ascendente
        println(x)
    }

    for (i in 5.downTo(1)){ //Forma descendente
        println(i)
    }

    //Cambiar el paso
    for (j in 1..10 step 2) { //Avanza del 1 al 10 avanzando entre 2
        println(j)
    }

    //Preguntar si alfabeticamente hablando una palabra esta entre otras dos
    "mariposa" in "acacia".."zapato" //Nos arroja true por que m esta entre a y z

    //Los rangos sobre los que se pueden iterar se llaman progresiones
    //Podemos crear progresiones con los tipo Int Long y Char
    for (ch in 'a'..'d'){ //Utilizar comillas simples
        println(ch)
    }

    //No se puede
    //for (palabra in 'acacia'..'mariposa') //Es imposible

    //Si no queremos mostrar el ultimo elemento
    for (x in 1 until 5) {
        println(x)
    }

    //Con un rango podemos saber si un determinado elemento se encuentra comprendido en el
    //Con una progresion somos capaces de enumerar cada uno de los elementos que la componen


    val a = 3
    val b = 2
    val c = 1
    var opcion = 0
    opcion = (c % b) + a
    print(opcion)

    var x = 1
    var y = 0
    val z = 55

    do{
        x = y*15
        println("$x")
        y++
    } while (x<z)

    println("Fin de instruccion while")

}

