package com.example.kotlinesenciallinkedin

class InterfazAuto: InterfazMotor,InterfazReproductor {

    //Interfaz de Motor
    override fun arrancar(){

    }

    override fun acelerar(unidades: Int){
        //Acelera girando el puño del acelerador

    }

    override fun frenar(unidades: Int){

    }

    override fun parar(){

    }

    //Interfaz de Reproductor

    override fun stop() {
    }

    override fun pause() {
    }
}