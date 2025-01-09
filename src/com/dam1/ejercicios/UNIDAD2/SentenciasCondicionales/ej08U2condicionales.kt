package com.dam1.ejercicios.UNIDAD2.SentenciasCondicionales

import com.dam1.ejercicios.UNIDAD1.pausa
import java.text.Format

//En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas. A continuación se muestra una tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.
//
//Nivel	Puntuación
//Inaceptable	0.0
//Aceptable	0.4
//Meritorio	0.6 o más

//Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento, así como la cantidad de dinero que recibirá el usuario.

fun comprobar_puntuacion(puntuacion: Float): Boolean{
    val puntuaciones_invalidas = listOf(0.1F,0.2F,0.3F,0.5F)
    if (puntuacion in puntuaciones_invalidas) {
        return false
    }else{
        return true
    }
}


fun introducir_puntuacion(msj: String): Float{
    var puntuacion_correcta = false
    var puntuacion_usuario = 0.0F
    while(!puntuacion_correcta){
        try {
            println(msj)
            puntuacion_usuario = readln().toFloat()
            if (!comprobar_puntuacion(puntuacion_usuario)){
                throw IllegalArgumentException("Error, puntuación introducida es inválida.")
            }
            puntuacion_correcta = true

    }catch (e:NumberFormatException){
        mostrar_error("$e")
    }catch (e:IllegalArgumentException){
        mostrar_error("$e")
    }
    }
    return puntuacion_usuario
}

fun mostrar_nivel(puntuacion: Float){
    if(puntuacion == 0.0F){
        val dinero_logrado = 2400 * 0.0F
        println("Tu nivel es: Inaceptable. Cantidad de dinero conseguida: $dinero_logrado")
    }else if(puntuacion == 0.4F){
        val dinero_logrado = 2400 * 0.4F
        println("Tu nivel es: aceptable. Cantidad de dinero logrado: $dinero_logrado")
    }else if(puntuacion >= 0.6){
        val dinero_logrado = 2400 * 0.6F
        println("Tu nivel es: metitorio. Cantidad de dinero logrado: $dinero_logrado")
    }
}

fun ejercicio8condicionales(){
    val puntuacion_usuario = introducir_puntuacion("Introduce la puntuación")
    mostrar_nivel(puntuacion_usuario)
    pausa()
}