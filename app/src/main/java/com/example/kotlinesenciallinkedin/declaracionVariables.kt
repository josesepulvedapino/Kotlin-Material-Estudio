package com.example.kotlinesenciallinkedin

fun main() {
    //Declaracion de variables//

    var edad = 42 //Si sabemos que valor tendra, Int
    var litros = 1.5 //Si sabemos que valor tendra, Double
    var numeroDeInvitados : Int = 20 //No sabemos que valor tendra pero si que tipo de dato, entonces se utiliza : <tipoDato>
    var numeroDeCopas = numeroDeInvitados * 2
    numeroDeInvitados = 20

    var timeStamp : Long = System.currentTimeMillis()

    edad = 43 //Edad es una variable de tipo 'var', por lo que se puede editar su contenedor, pero solo del mismo tipo de dato

    // edad = 65.5 //Edad puede ser modificada por su tipo de dato, que es Int, pero no cambiarlo, en este caso a Double
}