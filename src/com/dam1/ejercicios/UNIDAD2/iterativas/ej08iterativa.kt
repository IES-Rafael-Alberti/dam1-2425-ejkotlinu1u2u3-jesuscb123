package com.dam1.ejercicios.UNIDAD2.iterativas

import com.dam1.ejercicios.UNIDAD2.excepciones.pedir_numero_positivo


//Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo.

//1
//3 1
//5 3 1
//7 5 3 1
//9 7 5 3 1



fun triangulo_numero(numero: Int){
   var serie_filas = ""
    var serie_cuenta_atras = ""
    for(columna in (1..numero + 1) step 2){
        for(filas in (columna downTo 1) step 2){
            serie_cuenta_atras += filas.toString() + " "
        }
        serie_filas = "$columna" + serie_cuenta_atras
        serie_cuenta_atras = ""
        println(serie_filas)
    }
}

fun ejercicio8iterativa(){
    val numero = pedir_numero_positivo("Introduce un número para crear la pirámide")
    triangulo_numero(numero)

}
