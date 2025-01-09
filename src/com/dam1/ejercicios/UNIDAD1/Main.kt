package com.dam1.ejercicios.UNIDAD1

import com.dam1.ejercicios.UNIDAD2.iterativas.limpiar_pantalla
import com.dam1.ejercicios.main

fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 1
        -------------------
        Indica el ejercicio al que quieres hacer ejercicio: 
        4:  Ejercicio4.
        6:  Ejercicio6.
        12: Ejercicio12.
        15: Ejercicio15.
        18: Ejercicio18.
        20: Ejercicio20.
        21: Ejercicio21.
        22: Ejercicio22.
        24: Ejercicio24.
        25: Ejercicio25.
        26: Ejercicio26.
        27: Ejercicio27.
        
        0. Atrás.
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

fun mainunidad1() {
    val EJERCICIOS = listOf(4,6,12,15,18,20,21,22,24,25,26,27)
    var salir = false
    while(!salir){
        limpiar_pantalla()
        mostrar_menu()
        val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)
        when(ejercicio_usuario){
            4 -> ejercicio4()
            6 -> ejercicio6()
            12 -> ejercicio12()
            15 -> ejercicio15()
            18 -> ejercicio18()
            20 -> ejercicio20()
            21 -> ejercicio21()
            22 -> ejercicio22()
            24 -> ejercicio24()
            25 -> ejercicio25()
            26 -> ejercicio26()
            27 -> ejercicio27()
            else ->{
                salir = true
            }
        }
    }

}



