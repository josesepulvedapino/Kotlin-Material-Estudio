package com.example.kotlinesenciallinkedin

fun main() {
    val colorSalmon = Color.SALMON.hex
    println(DiasDeLaSemana.LUNES.ordinal) //Muestra la posicion del valor LUNES dentro de enum
    println(DiasDeLaSemana.LUNES.name) //Muestra el nombre del enum
    for (dia in DiasDeLaSemana.values()) { //values() sirve para mostrar todas las constantes del enum y poder utilizar un for para recorrerlas
    println(dia.name) }

    println(DiasDeLaSemana.valueOf("LUNES")) //valuesOf nos devuelve la constante dependiendo del nombre que pasemos

    println(DiasDeLaSemana.LUNES < DiasDeLaSemana.MARTES) //Lunes es menor que martes por que esta fue declarada antes que martes en el enum

}


enum class DiasDeLaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}