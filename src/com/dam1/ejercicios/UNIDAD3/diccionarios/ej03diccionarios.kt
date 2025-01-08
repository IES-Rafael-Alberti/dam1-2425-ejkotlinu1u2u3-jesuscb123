package com.dam1.ejercicios.UNIDAD3.diccionarios

import java.util.Dictionary

//Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla, pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio de ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.
//
//Fruta	Precio
//Plátano	1.35
//Manzana	0.80
//Pera	0.85
//Naranja	0.70

fun mostrar_precio_kilos(fruta_usuario: String, kilos: Double, FRUTAS: Map<String, Double>){
    val precio_fruta = FRUTAS[fruta_usuario]
    val precio_total = kilos * precio_fruta!!
    println("La fruta elegida es: $fruta_usuario, su precio es: $precio_fruta. El número de kilos que has pedido es: $kilos y el total es: $precio_total")
}
fun pedir_kilos(msj: String): Double{
    println(msj)
    val kilos_usuario = readln().toDouble()
    return kilos_usuario
}

fun pedir_fruta(msj: String, FRUTAS: Map<String,Double>): Pair<String, Double> {
    var fruta_correcta = false
    var fruta_usuario = ""
    var kilos_fruta = 0.0
    while(!fruta_correcta){
        try {
            println(msj)
            fruta_usuario = readln().lowercase()
            if (FRUTAS.containsKey(fruta_usuario)){
                kilos_fruta = pedir_kilos("Introduce cuántos kilos quieres")
                fruta_correcta = true

            }else{
                throw IllegalArgumentException("La fruta no se encuentra en el diccionario.")
            }
        }catch (e: IllegalArgumentException){
            com.dam1.ejercicios.UNIDAD2.excepciones.mostrar_error("$e")
        }
    }
    return Pair(fruta_usuario,kilos_fruta)
}

fun ejercicio3diccionarios(){
    val FRUTAS = mapOf("platano" to 1.35,"manzana" to 0.80, "pera" to 0.85, "naranja" to 0.70 )
    var (fruta_usuario,kilos) = pedir_fruta("Introduce la fruta que quieres y cuántos kilos",FRUTAS)
    mostrar_precio_kilos(fruta_usuario,kilos,FRUTAS)
}
