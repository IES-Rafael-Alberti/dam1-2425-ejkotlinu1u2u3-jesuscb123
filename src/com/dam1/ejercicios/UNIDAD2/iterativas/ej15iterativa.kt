package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa


fun sumar(numero: Int, suma: Int): Int{
    var resultado = numero + suma
    return resultado
}

fun ejercicio15iterativa() {
    var suma = 0
    var resultado = 0
    var numero = 1
    while(numero != 0){
        numero = pedir_numero("Introduce un número para sumar los números o pulsa 0 para terminar y ver la suma:")
        resultado += sumar(numero,suma)
    }
    println(resultado)
    pausa()
}