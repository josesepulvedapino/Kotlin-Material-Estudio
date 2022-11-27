package com.example.kotlinesenciallinkedin


//Argumentos con nombre y argumentos por defecto

fun main() {
    saludar2("Jorge") //En el caso de no asignar un valor, se pasara el por defecto que vendria siendo Stranger
    felicitarCumple2(edad = 25) //Indicar para cual de los parametros es el valor que quiero ingresar, en este caso solo quiero mandar la edad
    felicitarCumple(edad = 16, nombre = "Diego")
}

fun saludar2(nombre : String = "Stranger") { //Asignar un valor por defecto
    println("Hola, $nombre")
}


fun felicitarCumple2(nombre : String = "Stranger", edad : Int = 28) {
    println("Felicidades $nombre por cumplir $edad anitos")
}
