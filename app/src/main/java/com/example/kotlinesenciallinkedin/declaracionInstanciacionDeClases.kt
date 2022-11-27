package com.example.kotlinesenciallinkedin

fun main() {
    //Asignar una clase a una constante (Objeto)
    val miRectangulo = Rectangulo(4.1,6.2)
    println("miRectangulo tiene un ancho de ${miRectangulo.ancho} y un alto de ${miRectangulo.alto}")

    //Crear una constante que posea la funcion creada en la clase para conseguir el area mediante las variables
    val area = miRectangulo.obtenerArea()
    println("El area de miRectangulo es $area")



    //Propiedades
    val miRectanguloPropiedades = RectanguloPropiedades(22.9,5.1)
    miRectanguloPropiedades.grosor = 6

    //Se puede cambiar el valor por que en la clase la definimos como variable
    miRectanguloPropiedades.ancho = 22.9

    //No se puede cambiar el valor por que en la clase la definimos como constante
    //miRectanguloPropiedades.alto = 5.3

    //Puedo hacer
    println("miRectangulo tiene un ancho de ${miRectanguloPropiedades.ancho} y un alto de ${miRectanguloPropiedades.alto}")

    val areaPropiedades = miRectanguloPropiedades.ancho * miRectanguloPropiedades.alto

    println(miRectanguloPropiedades.esCuadrado)
}