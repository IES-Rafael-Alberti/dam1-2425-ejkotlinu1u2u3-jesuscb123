package com.dam1.ejercicios.UNIDAD2.iterativas

//Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.

fun mostrar_triangulo(numero: Int){
    var simbolo = "*"
    for(i: Int in 1..numero){
        println(simbolo)
        simbolo += "*"
    }
}


fun ejercicio6iterativa(){
    var numero = pedir_numero("Introduce un número entero positivo")
    mostrar_triangulo(numero)
}