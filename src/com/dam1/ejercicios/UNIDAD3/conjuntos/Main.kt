package com.dam1.ejercicios.UNIDAD3.conjuntos

import com.dam1.ejercicios.UNIDAD2.SentenciasCondicionales.ejercicio6condicionales
import com.dam1.ejercicios.UNIDAD3.diccionarios.*


fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 3 | Conjuntos
        -------------------------------
        Indica a que ejercicio quieres acceder: 
        1. Ejercicio1.
        2. Ejercicio2.
        4. Ejercicio4.
        5. Ejercicio5.
        6. Ejercicio6.
        
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

fun mainconjuntos() {
    val EJERCICIOS = listOf(1,2,5,6)
    mostrar_menu()
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)

    when(ejercicio_usuario){
        1 -> ejercicio1conjuntos()
        2 -> ejercicio2conjuntos()
        5 -> ejercicio5conjuntos()
        6 -> ejercicio6conjuntos()

        else ->{
            println("has finalizado el programa")
        }
    }
}