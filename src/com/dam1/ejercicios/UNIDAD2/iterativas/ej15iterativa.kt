package com.dam1.ejercicios.UNIDAD2.iterativas


fun sumar(numero: Int, suma: Int): Int{
    var resultado = numero + suma
    return resultado
}

fun ejercicio15iterativa() {
    var suma = 0
    var resultado = 0
    var numero = 1
    while(numero != 0){
        println("Introduce un número")
        numero = readln().toInt()
        resultado += sumar(numero,suma)
    }
    println(resultado)
}