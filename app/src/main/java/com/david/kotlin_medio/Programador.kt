package com.david.kotlin_medio

/*
clase que hereda de persona, e implementa de la interfaz vehiculo

     (sobreescribimos el constructor):clase de la que hereda(parametros del constructor)
 */

class Programador (override val nombre:String, edad:Int, val lenguaje:String):Persona(nombre, edad ),Vehiculo{

    //sobreescritura de funcion
    override fun trabajo() {
        super.trabajo()
        println(nombre+" esta programando")
    }

    //funcion expecifica de esta clase
    fun diLenguaje(){
        println(nombre+" esta programando en "+lenguaje)
    }

    //sobreescribir la funcion de la interfaz

    override fun conducir() {
        println(nombre+" conduce una moto")
    }

}