package com.example.kotlinesenciallinkedin

import kotlin.math.ceil


//Funciones anidadas
//Funciones que se declaran dentro de otras funciones

fun main() {
    val area = calcularAreaRectangulo(0.5 , 3.5)
}

fun calcularNumeroDeBaldosas(anchoEstancia: Double, largoEstancia: Double,
anchoBaldosa: Double, largoBaldosa: Double) : Int {
    fun comprobarDimensiones(ancho: Double, largo: Double) {
        if (ancho <= 0 || largo <= 0) {
            throw java.lang.IllegalArgumentException("No se puede realizar el calculo, las dimensiones deben ser mayor que 0")
        }
    }

    comprobarDimensiones(anchoBaldosa,largoBaldosa)
    comprobarDimensiones(anchoEstancia,largoEstancia)

    val areaEstancia = calcularAreaRectangulo(anchoEstancia,largoEstancia)
    val areaBaloda = calcularAreaRectangulo(anchoBaldosa,largoBaldosa)
    return ceil(areaEstancia/areaBaloda).toInt() //Utilizamos ceil para redondear hacia arriba y no quedarnos cortos de baldosas


}

fun calcularAreaRectangulo(ancho: Double, largo: Double): Double {
    return ancho * largo
}

