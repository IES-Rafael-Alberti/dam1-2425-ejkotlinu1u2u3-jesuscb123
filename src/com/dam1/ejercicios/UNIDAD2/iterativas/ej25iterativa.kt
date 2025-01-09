package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa

//Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga (en caso de haber más de una, mostrar la primera) y cuántas palabras había. Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más.


fun mostrar_palabra_mas_larga(frase: String){
    val lista_palabras_frase = frase.split(" ")
    var n_caracteres_ganadores = 0
    var palabra_mas_larga = ""
    for(palabra: String in lista_palabras_frase){
        var n_caracter = palabra.length
        if(n_caracter > n_caracteres_ganadores){
            n_caracteres_ganadores = n_caracter
            palabra_mas_larga = palabra
        }
    }
    println("La palabra más larga es: $palabra_mas_larga y cuenta con $n_caracteres_ganadores caracteres")
}

fun ejercicio25iterativa(){
    var frase = pedir_frase("Introduce una frase")
    mostrar_palabra_mas_larga(frase)
    pausa()
}