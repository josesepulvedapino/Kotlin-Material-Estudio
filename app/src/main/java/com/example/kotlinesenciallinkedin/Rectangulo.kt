package com.example.kotlinesenciallinkedin


//Creacion de clase mediante la palabra Class y el nombre (Mayuscula al inicio)
//Propiedades de una clase van entre los parentesis de la primera linea en donde se declara la clase
class Rectangulo(var alto : Double, var ancho: Double, var grosor: Int = 1) { //Constructor primario

    //Constructor secundario
    constructor(rectangulo: Rectangulo): this(rectangulo.ancho, rectangulo.alto, rectangulo.grosor)
    //Init sirve para ejecutar un bloque de codigo siempre al inicio de creacion de nuestro objeto
    init {//Siempre sera ejecutado al inicio
        if (ancho < 0 || alto < 0) {
            throw IllegalArgumentException("El ancho y alto no pueden ser negativos")
        }
    }
    //Asignamos una funcion que funcionara a partir de la clase y las variables creadas anteriormente
    fun obtenerArea() = ancho * alto
}