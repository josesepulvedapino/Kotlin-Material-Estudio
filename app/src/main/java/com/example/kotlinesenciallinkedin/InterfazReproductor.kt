package com.example.kotlinesenciallinkedin

interface InterfazReproductor {
    fun play(cancion: Int) {
        println("Reproduciendo cancion: $cancion")
    }
    fun stop()
    fun pause()
}