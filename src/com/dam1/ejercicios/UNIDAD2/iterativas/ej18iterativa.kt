package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa
import com.dam1.ejercicios.UNIDAD2.excepciones.pedir_numero_positivo

//Solicitar al usuario que ingrese números enteros positivos y, por cada uno, imprimir la suma de los dígitos que lo componen. La condición de corte es que se ingrese el número -1. Al finalizar, mostrar cuántos de los números ingresados por el usuario fueron números pares.

fun imprimir_suma(numero: Int){
    var suma_digito = 0
    var numero_string = numero.toString()
    for(digito in numero_string)
        suma_digito += digito - '0'
    println(suma_digito)
}

fun comprobar_par(numero: Int): Boolean{
    if(numero%2==0){
        return true
    }else{
        return false
    }
}

fun pedir_numero(msj: String): Int{
    var numero_correcto = false
    var numero = 0
    while(!numero_correcto){
        try {
            println(msj)
            numero = readln().toInt()
            numero_correcto = true
        }catch(e: NumberFormatException){
            com.dam1.ejercicios.mostrar_error("$e")
        }
    }
    return numero
}

fun ejercicio18iterativa(){
    var pares = 0
    var numero = 0
    while(numero != -1){
        numero = pedir_numero("Introduce un número o introduce -1 para finalizar.")
        if(comprobar_par(numero)){
            pares ++
        }
        imprimir_suma(numero)
        pausa()
    }
    println("De los números introducidos $pares de ellos son pares")
    pausa()
}