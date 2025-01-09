package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa

// Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.


fun mostrar_tabla_1_10(){
   var tabla = 1
    while(tabla <= 10){
        println("Tabla del $tabla")
        for(i in 1..10){
            println(i * tabla)
        }
        tabla += 1
    }

}

fun ejercicio7iterativa(){
    mostrar_tabla_1_10()
    pausa()
}