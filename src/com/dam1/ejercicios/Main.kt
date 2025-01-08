package com.dam1.ejercicios

import com.dam1.ejercicios.UNIDAD1.*
import com.dam1.ejercicios.UNIDAD2.mainunidad2
import com.dam1.ejercicios.UNIDAD3.mainunidad3

fun mostrar_menu(){
    val menu = """
        EJERCICIOS | UNIDAD 1 | UNIDAD 2 | UNIDAD 3
        -------------------------------------------
        Indica a que unidad quieres acceder: 
        1. Unidad 1
        2. Unidad 2
        3. Unidad 3
        
        0. Salir.
                """.trimIndent()
    println(menu)
}

fun mostrar_error(msj: String){
    println(msj)
}

fun pedir_ejercicio(msj:String,EJERCICIOS: List<Int>):Int{
    var ejercicio_correcto = false
    var ejercicio_usuario = 0
    while(!ejercicio_correcto){
        try{
            println(msj)
            ejercicio_usuario = readln().toInt()
            if (ejercicio_usuario !in EJERCICIOS && ejercicio_usuario != 0) {
                throw IllegalArgumentException("Debes meter una opción correcta")
            }else{
                ejercicio_correcto = true
            }

        } catch (e: IllegalArgumentException){
            mostrar_error("$e")
        } catch (e: NumberFormatException){
            mostrar_error("Introduce un número correcto")
        }
    }
    return ejercicio_usuario
}

fun main() {
    val EJERCICIOS = listOf(1,2,3)
    mostrar_menu()
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)

    when(ejercicio_usuario){
        1 -> mainunidad1()
        2 -> mainunidad2()
        3 -> mainunidad3()
        else ->{
            println("has finalizado el programa")
        }
    }
}
