package com.david.kotlin_medio

/*
Una interface no se puede instanciar por si sola
deve de implementarse dentro de una clase
 */

interface Game {
    val game:String

    fun play()

    fun stream(){
        println("Estoy haciendo stream de mi juego ${game}")
    }



}