package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa
import com.dam1.ejercicios.UNIDAD2.excepciones.pedir_numero_positivo

//Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.


fun mostrar_cuenta_atras(numero: Int){
    var cuenta_atras = ""
    for(i: Int in numero downTo 1){
        if(i == 1){
            cuenta_atras += i.toString() + "."
        } else{
            cuenta_atras += i.toString() + ","
        }
    }
    println(cuenta_atras)
}

fun ejercicio4iterativa(){
    var numero = pedir_numero_positivo("Introduce un número positivo")
    mostrar_cuenta_atras(numero)
    pausa()
}