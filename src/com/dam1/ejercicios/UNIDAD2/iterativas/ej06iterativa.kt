package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa
import com.dam1.ejercicios.UNIDAD2.excepciones.pedir_numero_positivo

//Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.

fun mostrar_triangulo(numero: Int){
    var simbolo = "*"
    for(i: Int in 1..numero){
        println(simbolo)
        simbolo += "*"
    }
}


fun ejercicio6iterativa(){
    var numero = pedir_numero_positivo("Introduce un número entero positivo")
    mostrar_triangulo(numero)
    pausa()
}