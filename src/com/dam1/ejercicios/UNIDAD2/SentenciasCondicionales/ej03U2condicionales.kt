package com.dam1.ejercicios.UNIDAD2.SentenciasCondicionales

import com.dam1.ejercicios.UNIDAD1.introducir_numero


fun dividir(num1: Int, num2: Int): Int {
    var resultado_division = 0
        try{
            resultado_division = num1 / num2
        }catch (e:ArithmeticException){
            mostrar_error("Error, no se puede dividir entre 0")
    }catch (e: Exception){
    mostrar_error("$e")
        }
    return resultado_division
}

fun ejercicio3condicionales(){
    val num1 = introducir_numero("Introduce un número")
    val num2 = introducir_numero("Introduce un segundo número para la división")
    println("El resultado es: ${dividir(num1, num2)}")
}