package com.example.kotlinesenciallinkedin

import kotlin.math.PI


fun main() {
}

//Declaramos una clase abstracta con abstract, no es necesario declarar como open

abstract class Forma(var x: Int, var y: Int) {
    abstract fun obtenerArea(): Double
    abstract fun obtenerPerimetro(): Double
    fun trasladar(movimientoX: Int, movimientoY: Int) {
        x = x + movimientoX
        y = y + movimientoY
    }
}


class RectanguloAbstracto(val ancho: Double, val alto: Double): Forma(x = 0, y = 0) {
    override fun obtenerArea() = ancho * alto
    override fun obtenerPerimetro() = 2 * ancho + 2 * alto
}

class CirculoAbastracto(val radio: Double):Forma(x = 0, y = 0) {
    override fun obtenerArea() = PI * radio * radio
    override fun obtenerPerimetro() = 2 * PI * radio
}