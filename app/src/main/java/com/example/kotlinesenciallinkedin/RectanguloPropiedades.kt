package com.example.kotlinesenciallinkedin

class RectanguloPropiedades(val alto: Double, var ancho: Double) {



    val esCuadrado: Boolean
    //Preguntamos si ancho es igual a alto, si es verdadero, nos lanzara un booleano true
    get() = ancho == alto

    var grosor: Int = 1
    set(value) {
        if (value <=0) {
            throw IllegalArgumentException("El valor del grosor debe ser positivo")
        }
        field = value //field representa grosor, es una palabra que otorga Kotlin
    }



    fun obtenerAreaPropiedades() = alto * ancho


}
