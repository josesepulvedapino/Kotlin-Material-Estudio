package com.example.kotlinesenciallinkedin

fun main() {
    //Sentencia when
    //Se puede usar como expresion como el if

    val mes = "julio"
    var numeroDeDias = 0
    when (mes) { //Siempre se ejecutara un unico camino y el resto se ignoraran
        "enero","marzo","mayo","julio","agosto","octubre","diciembre" -> numeroDeDias = 31
        "febrero" -> numeroDeDias = 28
        "abril","julio","septiembre","noviembre" -> numeroDeDias = 30
        else -> numeroDeDias = -1
    }
    println("El mes $mes tiene $numeroDeDias dias")

    //Utilizar when como expresion
    val producto = "coca"
    var precio = when (producto) {
        "coca","zapato"->  700
        "jengibre" -> 500
        "pepsi" -> 900
        else ->  -1 //Else obligatorio
    }
    println("El producto $producto cuesta $precio pesos")

    //Utilizar condiciones complejas p[ara selecciona un camino utilizando rangos

    val numero = 160
    when (numero) {
        in 1..5 -> print("El numero esta entre 1 y 5")
        in 6..10 -> print("El numero esta entre 6 y 10")
        in 11..19 -> print("El numero esta entre 11 y 19")
        !in 0..130 -> print("Numero incorrecto") //Se utiliza ! para Not
        else -> print("El numero es mayor a 20")
    } //Las condiciones se pueden solapar y solamente se imprimira la primera vez que se cumpla y seguira ese camino

    //Un when puede sustituir una escalera if elseif
    val number = 14
    when { //Se eliminan los entre parentesis al lado del when
        number < 13 -> print("Es un nino")
        number < 18 -> print("Es un adolecente")
        number < 0 || number > 130 -> print("Edad incorrecta")
        else -> print("Es un adulto")
    }



















}