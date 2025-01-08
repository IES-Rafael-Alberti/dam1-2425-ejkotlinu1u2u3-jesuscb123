package com.dam1.ejercicios.UNIDAD3.diccionarios

import com.dam1.ejercicios.UNIDAD3.listasytuplas.pedir_dato_string

//Escribir un programa que cree un diccionario simulando una cesta de la compra. El programa debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que el usuario decida terminar. Después se debe mostrar por pantalla la lista de la compra y el coste total, con el siguiente formato
//
//Lista de la compra
//Artículo 1	Precio
//Artículo 2	Precio
//Artículo 3	Precio
//…	…
//Total	Coste



fun mostrar_cesta(lista_cesta: MutableMap<String, Double>){
    println("Lista de la compra")
    var total = 0.0
    for(producto in lista_cesta.keys){
        var precio = lista_cesta.get(producto)
        if (precio != null) {
            total += precio
        }
        println("$producto   $precio")
    }
     println("Total: $total")
    }

fun pedir_precio(msj: String): Double{
    var precio_correcto = false
    var precio = 0.0
    while(!precio_correcto){
        try{
            println(msj)
            precio = readln().toDouble()
            if(precio < 0){
                throw IllegalArgumentException("**ERROR**: Introduce un precio correcto.")
            }
            precio_correcto = true
        }catch (e: IllegalArgumentException){
            com.dam1.ejercicios.UNIDAD2.excepciones.mostrar_error("$e")
        }catch (e: NumberFormatException){
            com.dam1.ejercicios.UNIDAD2.excepciones.mostrar_error("$e")
        }
    }
    return precio
}


fun ejercicio7diccionarios(){
    var lista_cesta = mutableMapOf<String, Double>()
    var terminar = false
    while(!terminar){
        var producto = pedir_dato_string("Introduce un producto")
        if(producto == "salir"){
            terminar = true
        }else{
            var precio = pedir_precio("Introduce el precio del producto")
            lista_cesta[producto] = precio
            println(lista_cesta)
        }

    }
    mostrar_cesta(lista_cesta)
}