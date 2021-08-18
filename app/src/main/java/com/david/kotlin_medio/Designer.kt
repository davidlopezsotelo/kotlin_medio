package com.david.kotlin_medio

class Designer (override val nombre:String, edad:Int):Persona(nombre, edad ){
    override fun trabajo() {
        println(nombre+" esta diseñando")
    }
}