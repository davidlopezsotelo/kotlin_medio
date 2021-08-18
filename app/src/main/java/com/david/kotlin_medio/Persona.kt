package com.david.kotlin_medio
/*
el modificador de acceso OPEN indica
que se puede heredar de esta clase
de no ponerlo, no se podra heredar
 */

open class Persona(open val nombre:String, edad:Int):Trabajo (){

   open fun trabajo(){// open, para poder sobreescribir la funcion

        println("Esta persona esta trabajando")
    }

    override fun irTrabajo() {
        println(nombre+" va al trabajo")
    }
}