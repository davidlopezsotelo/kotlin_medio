package com.david.kotlin_medio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //enumClasses()

        //nestedAndInnerClasses()

        //herenciaClases()

        misInterfaces()

    }

}


    //CLASES ENUM:--------------------------------------------------------------------------------

    /*
    las clases ennum, proporcionan un rango de opciones
    para los valores de las variables o metodos, que podemos definir
     */
    enum class Direction{

        NORTE,SUR,ESTE,OESTE;// ; para seguir añadiendo funciones a la clase

        fun descripcion():String{  // funcion que describe los valores

            return when(this){ //tenemos que describir todos los valores del enum
                NORTE -> "Norte es hacia arriba"
                SUR -> "Sur es hacia abajo"
                ESTE -> "Este es hacia la derecha"
                OESTE -> "Oeste es hacia la izquierda"

            }
        }

    }

    private fun enumClasses(){

        var usaDireccion:Direction?= null
        println("Direccion: "+usaDireccion)

        usaDireccion=Direction.ESTE
        println("Direccion: "+usaDireccion)

        usaDireccion=Direction.NORTE
        println("Direccion: "+usaDireccion)

        println("Propiedad name: "+usaDireccion.name)//nombre del valor enum utilizado

        println("Propiedad ordinal: "+usaDireccion.ordinal)//posicion del valor del enum

       //metodo que debuelve el valor de la descripcion de la direccion seleccionada

        println(usaDireccion.descripcion())
    }


    //CLASES ANIDADAS O INTERNAS-------------------------------------------------------------------------

    /*

     */
    private fun nestedAndInnerClasses(){

        //metodos de la clase anidada (nested)
        val miClaseAnidada=MyNestedAndInnerClass.MyNestedClass()//instanciamos la clase
        val suma=miClaseAnidada.suma(3,8)
        println(suma)

        //metodos de la clase interna
        val miClaseInterna=MyNestedAndInnerClass().MyInnerClass()//instanciamos la clase
        val sumaDos=miClaseInterna.sumaUno(4)
        println(sumaDos)


    }

//HERENCIA-----------------------------------------------------------------

    private fun herenciaClases(){
        val programador=Programador("David",44,"Kotlin")
        val designer=Designer("Juan",34)

        //accedemos a la clases wue hereda,desde la clase Programador
        programador.trabajo()
        programador.diLenguaje()
        programador.irTrabajo()
        programador.conducir()
        //accedemos a la clase padre (Persona) desde la clase designer
        designer.trabajo()

}

//INTERFACES---------------------------------------------------------------------

private fun misInterfaces(){}