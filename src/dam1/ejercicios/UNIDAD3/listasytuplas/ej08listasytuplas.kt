package dam1.ejercicios.UNIDAD3.listasytuplas

import dam1.ejercicios.UNIDAD1.pedir_dato

//Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.

fun es_palindromo(palabra: String){
    val palabra_al_reves = palabra.reversed()
    if(palabra == palabra_al_reves){
        println("Es palindromo")
    }else{
        println("No es palindromo")
    }
}


fun pedir_dato_string(msj: String): String{
    println(msj)
    val palabra = readln()
    return palabra
}

fun ejercicio8listasytuplas(){
    var palabra = pedir_dato_string("Introduce una palabra para comprobar si es palindromo.")
    es_palindromo(palabra)
}