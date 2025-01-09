package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa
import com.dam1.ejercicios.UNIDAD2.excepciones.pedir_numero_positivo

//Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).


fun mostrar_años(edad_usuario: Int){
    for(i: Int in 1..edad_usuario){
        println(i)
    }
}



fun ejercicio2iterativa(){
    val edad_usuario = pedir_numero_positivo("Introduce tu edad")
    mostrar_años(edad_usuario)
    pausa()
}