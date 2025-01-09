package com.dam1.ejercicios.UNIDAD2.excepciones

import com.dam1.ejercicios.UNIDAD1.pausa

//Escribir un programa que pida al usuario un número entero, si la entrada no es correcta, mostrará el mensaje "La entrada no es correcta" y lanzará la excepción capturada.

fun ejercicio4excepciones(){
    var numero = pedir_numero_positivo("Introduce un número entero y positivo")
    println(numero)
    pausa()
}