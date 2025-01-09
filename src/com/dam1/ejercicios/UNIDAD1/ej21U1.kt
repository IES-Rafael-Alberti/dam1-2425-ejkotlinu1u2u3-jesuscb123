package com.dam1.ejercicios.UNIDAD1

// Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.


fun invertir_frase(frase: String): String{
    val frase_invertida = frase.reversed()
    return frase_invertida
}

fun introducir_frase(msj: String): String{
    println(msj)
    val frase = readLine().toString()
    return frase
}


fun ejercicio21(){
    val frase = introducir_frase("Introduce una frase para invertirla:")
    println(invertir_frase(frase))
    pausa()

}