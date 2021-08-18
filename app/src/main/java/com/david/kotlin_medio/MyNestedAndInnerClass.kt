package com.david.kotlin_medio

class MyNestedAndInnerClass {

    private val uno=1

    //CLASE ANIDADA---------------------------------------------------

    class MyNestedClass{


        fun suma(a:Int,b:Int):Int{
            return a + b
        }
    }

    //CLASE INTERNA-------------------------------------------

    inner class MyInnerClass{//las clases internas deben llevar declaracion de inner
        fun sumaUno(numero:Int):Int{
            return numero+uno
        }
    }
}