package com.example.kotlinesenciallinkedin

fun main() {
    //Tipos de datos basicos : Strings//

    //Tipo String
    var nombre = "Manuel" //Kotlin automaticamente asigna esta variable como tipo String
    var apellido = "Garcia"
    //Los tipo String se pueden concatenar
    var nombreCompleto = nombre + " " + apellido
    println(nombreCompleto)

    //Se puede acceder a cada una de las posiciones del String utilizando [], la primera posicon es 0
    println(nombre[3])

    //Se puede obtener la longitud de la cadena de caracteres con length
    println(nombre.length)

    //Se puede pasar a mayusculas con toUpperCase
    println(nombre.toUpperCase())

    //Se puede saber si contiene una determinada secuencia de caracteres (true/false)
    println(nombreCompleto.contains(nombre))

    //Kotlin permite las string template (plantillas de string) que permite incrustrar expresiones dentro del string utilizando $
    println("Mi nombre es $nombre y mi apellido es $apellido")

    //Permite agregar expresiones complejas entre llaves
    var edad = 21
    println("${if (edad >= 18)"Si" else "No"} soy mayor de edad")


}