package com.dam1.ejercicios.UNIDAD3.diccionarios

import com.dam1.ejercicios.UNIDAD1.pausa

//Escribir un programa que almacene el diccionario con los créditos de las asignaturas de un curso {'Matemáticas': 6, 'Física': 4, 'Química': 5} y después muestre por pantalla los créditos de cada asignatura en el formato <asignatura> tiene <créditos> créditos, donde <asignatura> es cada una de las asignaturas del curso, y <créditos> son sus créditos. Al final debe mostrar también el número total de créditos del curso.


fun mostrar_asginaturas_creditos(ASIGNATURAS: Map<String,Int>) {
    var suma_creditos = 0
    for(asignatura in ASIGNATURAS.keys){
        val creditos = ASIGNATURAS[asignatura]
        if (creditos != null) {
            suma_creditos += creditos
        }else{
            println("Error al acceder a los créditos de la asginatura $asignatura")
        }
        println("$asignatura tiene $creditos")
    }
    println("Los créditos totales son: $suma_creditos")
}

fun ejercicio5diccionarios(){
    val ASIGNATURAS = mapOf("matematicas" to 6, "fisica" to 4, "quimica" to 5)
    mostrar_asginaturas_creditos(ASIGNATURAS)
    pausa()
}