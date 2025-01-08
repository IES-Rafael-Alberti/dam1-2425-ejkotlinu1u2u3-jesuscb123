package com.dam1.ejercicios.UNIDAD2.excepciones

import com.dam1.ejercicios.UNIDAD2.iterativas.*

fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 2 | Captura de excepciones
        --------------------------------
        Indica el ejercicio al que quieres acceder: 
        2:  Ejercicio2.
        3:  Ejercicio3.
        4:  Ejercicio4.
        
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

fun mainexcepciones() {
    val EJERCICIOS = listOf(2,3,4)
    mostrar_menu()
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)

    when(ejercicio_usuario){
        2 -> ejercicio2excepciones()
        3 -> ejercicio3excepciones()
        4 -> ejercicio4excepciones()
        else ->{
            println("has finalizado el programa")
        }
    }
}