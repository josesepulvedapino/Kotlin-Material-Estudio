package com.example.kotlinesenciallinkedin

fun main() {
    //Coleccion Mapas
    //Coleccion de pares de objetos
    //Coleccion clave valor, las claves son unicas y no se pueden repetir

    //Mapa solo lectura
    val millonesDeHabitantes = mapOf("Chile" to 19.24, "Inglaterra" to 47.19, "Ecuador" to 17.4, "Peru" to 32.31, "Mexico" to 127.18)

    //Map mutable
    val millonesDeHabitantesMutables = mutableMapOf("Chile" to 19.24, "Inglaterra" to 47.19, "Ecuador" to 17.4, "Peru" to 32.31, "Mexico" to 127.18)

    //Ver su tamano
    println(millonesDeHabitantes.size)
    println(millonesDeHabitantes.count())

    //Acceder al valor de una determinada clave
    println(millonesDeHabitantes["Ecuador"])
    println(millonesDeHabitantes.get("Chile"))

    //Comprobar si el mapa contiene una determinada clave o valor
    println(millonesDeHabitantes.containsKey("Alemania")) //Uso clave y pido valor, Devuelve Boolean
    println(millonesDeHabitantes.containsValue(19.2)) //Uso valor y pido clave, Devuelve Boolean

    //Particularidades de los Map mutables
    //Se puede modificar, agregar o eliminar elementos

    //Agregar
    millonesDeHabitantesMutables.put("Alemania",49.88) //Se agrega al final
    println(millonesDeHabitantesMutables)

    //Agregar repetido solo modifica el valor para la clave
    millonesDeHabitantesMutables.put("Alemania",45.88) //Se agrega al final
    println(millonesDeHabitantesMutables)

    //Eliminar
    millonesDeHabitantesMutables.remove("Chile")
    println(millonesDeHabitantesMutables)







}