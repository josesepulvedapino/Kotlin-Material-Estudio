package com.example.kotlinesenciallinkedin

//Funciones con un numero variable de argumentos
//Para trabajar con una funcion con un indeterminado numero de argumentos, debemos utilizar siempre vararg
fun main() {
    val misValores = doubleArrayOf(5.8,9.3)
    println(calcularMedia("Aaa",7.0,7.0,6.5))
}


fun calcularMedia( x: String, vararg valores :Double) : Double { //Cuando usemos vararg el numero de elementos tambien puede ser 0 // vararg siempre debe ser el ultimo parametro o cuando llamemos a la funcion principal debemos escribir el argumento especifico
    var media = 0.0
    for (valor in valores) {
        media = media + valor
    }
    media = media / valores.size
    return media
}

