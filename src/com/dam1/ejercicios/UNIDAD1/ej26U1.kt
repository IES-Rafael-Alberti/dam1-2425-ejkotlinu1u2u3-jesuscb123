package com.dam1.ejercicios.UNIDAD1

//Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas, y muestre por pantalla cada uno de los productos en una línea distinta.


fun mostrar_productos(cesta: String){
    var lista_productos = cesta.split(",")
    for(producto in lista_productos){
        println(producto)
    }
}

fun introducir_productos(msj: String): String{
    println(msj)
    var cesta = readln().toString()
    return cesta
}

fun ejercicio26(){
    var cesta_compra = introducir_productos("Introduces los productos separados por ,")
    mostrar_productos(cesta_compra)
}