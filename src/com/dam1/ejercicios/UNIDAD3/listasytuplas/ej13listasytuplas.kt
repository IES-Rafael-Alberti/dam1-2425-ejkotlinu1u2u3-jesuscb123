package com.dam1.ejercicios.UNIDAD3.listasytuplas

import com.dam1.ejercicios.UNIDAD1.pausa

// Escribir un programa que pregunte por una muestra de números, separados por comas, los guarde en una lista y muestre por pantalla su media y desviación típica

fun convertir_a_entero(numero_string: String): Int{
    val numero = numero_string.toInt()
    return numero
}

fun crear_lista_entero(lista_numeros_string: List<String>): List<Int>{
   var lista_numeros_int = mutableListOf<Int>()
    for(numero_string in lista_numeros_string){
        val numero = (convertir_a_entero(numero_string))
        lista_numeros_int.add(numero)
    }
    return lista_numeros_int
}

fun pedir_numeros_por_comas(msj: String): List<String>{
    println(msj)
    var numeros_comas = readln().toString()
    val lista_numeros_string= numeros_comas.split(",")
    return lista_numeros_string
}

fun mostrar_media(lista_numeros_int: List<Int>){
    println(lista_numeros_int.average())
}

fun ejercicio13listasytuplas(){
    val lista_numeros_string = pedir_numeros_por_comas("Introduce números separados por , para mostrar su media y desviación típica")
    val lista_numeros_int = crear_lista_entero(lista_numeros_string)
    mostrar_media(lista_numeros_int)
    pausa()
}