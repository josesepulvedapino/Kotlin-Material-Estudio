package com.example.kotlinesenciallinkedin

fun main() {
    val miProcesador = Ordenador.Procesador(4,2.5)
    miProcesador.mostrarEspecificaciones()


    //val miMarcador = Juego.Marcador() //La clase marcador solamente vivira si existe un objeto de tipo juego

    val miJuego = Juego()
    val miMarcador = miJuego.Marcador()
    miMarcador.incrementar(5)
    println("La puntuacion de miJuego es: ${miJuego.puntuacion}")

}


//Anidar una clase dentro de otra clase
 class Ordenador(val RamGB: Double, val procesador: Procesador) {
    //Se declara la clase dentro de la misma clase
    class Procesador(val numeroDeNucleos: Int, val frecuenciaGH: Double) {
        fun mostrarEspecificaciones() {
            println("Numero de nucleos: $numeroDeNucleos, Frecuencia: $frecuenciaGH")
        }
    }
}

//Otro ejemplo
class Juego() {
    var puntuacion = 0

    inner class Marcador() {
        fun incrementar(puntos: Int){
            puntuacion = puntuacion + puntos //La clase marcador no puede acceder a las propiedades de la clase externa, se debe declarar la clase como inner
        }
        fun decrementar(puntos: Int){
            puntuacion = puntuacion - puntos
        }
    }
}