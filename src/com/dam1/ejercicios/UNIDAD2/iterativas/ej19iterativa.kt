package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa
import java.lang.classfile.Opcode

//Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-finalizar programa. A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El menú se debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las opciones 1 ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará.

var MENU ="""
          Bienvenido a mi programa
          ------------------------
          1. Comenzar programa.
          2. Imprimir listado.
          3. Salir.
            """.trimIndent()

fun limpiar_pantalla(){
    for (i in 1..10) {
        println(" ")
    }
}

fun pedir_opcion(OPCIONES: Int): Int{
   var opcion_correcta = false
    var opcion = 0
    while(!opcion_correcta){
        try{
            println("Introduce una opción")
            opcion = readln().toInt()
            if(opcion < 1 || opcion > OPCIONES){
                throw IllegalArgumentException("**ERROR** Introduce una opción correcta")
            }
            opcion_correcta = true
        }catch(e:IllegalArgumentException){
            mostrar_error("$e")
        }catch(e:Exception){
            mostrar_error("$e")
        }
    }
  return opcion
}



fun ejercicio19iterativa(){
    val OPCIONES = 3
    do{
        limpiar_pantalla()
        println(MENU)
        var opcion = pedir_opcion(OPCIONES)
        when(opcion){
            1 ->{println("Has comenzado el programa")
                pausa()
            }

            2 -> {println("Imprimiendo listado...")
                pausa()
            }
            else ->{

                println("Has finalizado el programa.")
                pausa()
            }
        }
    } while(opcion != 3)

}