package com.example.kotlinesenciallinkedin

fun main() {
    //Sets//
    //Es una coleccion no ordenada donde no se puede repetir ningun elemento//

    //Set para solo lecutra
    //MutableSet para Set que pueden modificarse
    //Los objetos inmutables son siempre mas seguros por lo que se da preferencia a Set de solo lectura

    //Solo lectura
    val listaDeLaCompra = setOf<String>("Harina","Huevos","Sal","Naranjas") //Se puede limitar el tipo de elemento dentro de <> setOf<Tipo>

    //Lista modificable
    val listaDeLaCompraMutable = mutableListOf("Harina","Huevos","Sal","Naranjas")

    //Consultar numeros de elementos
    println(listaDeLaCompra.size)
    println(listaDeLaCompra.count())

    //Consultar elemento especifico
    println(listaDeLaCompra.contains("Patatas"))
    println("Harina" in listaDeLaCompra)

    //Consultar por posicion
    println(listaDeLaCompra.elementAt(1))

    //Acceder al primero y ultimo elemento de la lista
    println(listaDeLaCompra.first())
    println(listaDeLaCompra.last())

    //Ordenar Lista
    val listaDeLaCompraOrdenada =listaDeLaCompra.sorted() //Ordenar Lista
    println(listaDeLaCompraOrdenada)

    //Obtener elemento aleatorio del Set
    println(listaDeLaCompra.random())

    //Particularidades de los Set mutables
    //Se puede modificar, agregar o eliminar elementos

    //Agregar
    println(listaDeLaCompraMutable.add("Patatas"))

    //Eliminar
    println(listaDeLaCompraMutable.remove("Harina"))

    println(listaDeLaCompraMutable)

    //Limpiar Set
    //listaDeLaCompraMutable.clear()//
    //println(listaDeLaCompraMutable)//


    println(listaDeLaCompraMutable)
    println(listaDeLaCompra)
    //Union devolvera una lista que contenga todos los elementos de dos listas quitando los repetidos
    var listaCompleta =listaDeLaCompra.union(listaDeLaCompraMutable)
    println(listaCompleta)

    println(setOf(1, 2).equals(setOf(2,1))) //Devolvera true por que contienen los mismos elementos ambas listas Set





}