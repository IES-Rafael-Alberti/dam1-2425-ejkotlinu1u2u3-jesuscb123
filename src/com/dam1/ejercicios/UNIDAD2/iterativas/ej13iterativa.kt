package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD1.pausa

//Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba “salir” que terminará.



fun pedir_frase(msj: String): String{
    println(msj)
    val frase = readln().toString()
    return frase
}

fun mostrar_eco(frase: String){
    for(i: Int in 1..2){
        println(frase)
    }
}

fun ejercicio13iterativa(){
    var frase = ""
    while(frase != "salir"){
        frase = pedir_frase("Introduce una frase: ")
        pausa()
        if(frase == "salir"){
            println("Has finalizado el programa.")
            pausa()
        }else{
            mostrar_eco(frase)
        }

    }

}