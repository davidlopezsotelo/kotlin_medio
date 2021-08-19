package com.david.kotlin_medio
/*
el modificador de acceso OPEN indica
que se puede heredar de esta clase
de no ponerlo, no se podra heredar
 */

// la clase persona hereda de trabajo, e implementa Game

open class Persona(open val nombre:String, edad:Int):Trabajo() ,Game{

   open fun trabajo(){// open, para poder sobreescribir la funcion

        println("Esta persona esta trabajando")
    }

    override fun irTrabajo() {
        println(nombre+" va al trabajo")
    }

    //Game interface
     override val game:String
        get() ="Among Us"

    override fun play() {
        println("Esta persona esta jugando a $game")
    }

}

/*
actualizacion git 25/08/21
 */