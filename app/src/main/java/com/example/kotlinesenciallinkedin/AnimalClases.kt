package com.example.kotlinesenciallinkedin

//Clases herencia
fun main() {

    //Creamos una constante de tipo clase Gato con su superclase Animal, y llamamos a la funcionalidad tipo que viene de la superclase y su edad
    val miGato = Gato(8)
    //println("Mi gato es un animal de tipo ${miGato.tipo} que tiene ${miGato.edad} años")


    //llamar a la funcion comer sobreescribida
    miGato.comer()

    /*val miAnimal = Animal()
    miAnimal.dormir()
    val miPerro = Perro()
    miPerro.dormir()
    miPerro.ladrar()
     */
    //miPerro.maullar() //Mi objeto perro no tomara las funcionalidades de otra clase que sea heredada de ella, solamente podra dormir y comer que son de la superclase
}

//Crearemos una superclase llamada Animal de la cual conseguiremos las funcionalidades basicas como dormir y comer
//Se declara open antes de la clase para decirle a Kotlin que esta clase puede heredar a otras

open class Animal(val edad: Int, val tipo: TipoDeAnimal) {
    init {
        println("Inicializacion de animal")
    }
    fun dormir() {
        println("Estoy durmiendo")
    }
    //Si queremos sobreescribir esta funcion en la clase gato debemos agregar el open
    open fun comer() {
        println("Estoy comiendo")
    }
}

//Para que las subclases hereden de otras se debe ingresa : Clasedelaquehereda
//Estas tres clases comparten algunas funcionalidades (dormir,comer) (las borre por que se pasaron a la superclase)

//Para no asignarle una edad base a la clase se debe llamar a edad: Int luego del nombre de la clase y en Animal llamar a ese parametro
class Gato(edad: Int): Animal(edad,TipoDeAnimal.VERTEBRADO) {
    init {
        println("Inicializacion de gato")
    }
    //Cuando las propiedades de la superclase que queremos heredar no encajan con el comportamiento de la subclase podemos sobreescribirla utilizando override
    override fun comer() {
        println("Estoy comiendo sardinas")
    }
    fun maullar() {
        println("Miau")
    }
}

class Perro(edad: Int): Animal(edad,TipoDeAnimal.VERTEBRADO) {
    fun ladrar() {
        println("Guau")
    }
}

class Ave(edad: Int): Animal(edad,TipoDeAnimal.INVERTEBRADO) {
    fun volar() {
        println("Estoy volando")
    }
}