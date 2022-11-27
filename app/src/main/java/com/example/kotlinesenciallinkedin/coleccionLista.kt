package com.example.kotlinesenciallinkedin

fun main() {
    //Listas//
    //Es una coleccion ordenada donde a cuyos elementos podemos acceder mediante un indice//
    //Los elementos de una lista pueden estar repetidos//

    //Lista solo lectura
    val nombres = listOf("Jose", "Luis", "Hector", "Lucas","Benjamin","Jose")
    //Lista mutable
    val edades = mutableListOf(21,19,21,34,12,22)

    //En ambos casos podemos acceder a los elementos de forma ordenada
    println(nombres[0])
    println(nombres.get(0))

    println(edades[0])
    println(edades.get(0))

    //Conocer la posicion de un elemento en concreto
    println(nombres.indexOf("Luis"))
    println(nombres.indexOf("Jose")) //Si la variable esta repetida solamente mostrara la primera vez ordenada en donde aparece

    //Contar elementos de la lista
    println(nombres.count())
    println(nombres.size)

    //Acceder al primero y ultimo elemento de la lista
    println(nombres.first())
    println(nombres.last())

    //Saber si nuestra lista contiene un determinado valor
    println(edades.contains(22)) //Devuelve booleano
    println(22 in edades)

    //Obtener una lista ordenada con los elementos
    val edadesOrdenadas = edades.sorted() //Muestra lista ordenada de menor a mayor
    println(edadesOrdenadas)

    val nombresOrdenados = nombres.sorted()
    println(nombresOrdenados) //Se ordenan alfabeticamente

    //Las listas mantienen su orden original//

    //Obtener el maximo de una lista
    println(edades.max())

    //Suma de todas los valores
    println(edades.sum())

    //Media de todos los valores
    println(edades.average())

    //Particularidades de las listas mutables
    //Se puede modificar, agregar o eliminar elementos

    //Modificar
    edades[2] = 22
    println(edades)

    //Agregar

    edades.add(38)
    println(edades) //Se agrega al final de la lista de forma automatica

    edades.add(0,23) //Puedo agregar en una determinada posicion un valor
    println(edades) //Las posiciones se corren uno adelante, no se modifica la posicion actual

    //Eliminar
    edades.remove(12) //Si un elemento esta mas de una vez, se borra solamente el primero en aparecer
    println(edades)

    edades.removeAt(0) //Eliminar un elemento en especifico
    println(edades)


    //Particularidades de las listas solo lecutra
    //No se puede modificar, agregar o eliminar elementos

    //nombres.remove("Jose") //Las listas de solo lectura no se pueden modificar, agregar o eliminar sus elementos, da error




}