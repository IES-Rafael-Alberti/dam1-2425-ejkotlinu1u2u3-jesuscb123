package com.dam1.ejercicios.UNIDAD3.conjuntos

import com.dam1.ejercicios.UNIDAD1.pausa
import com.dam1.ejercicios.UNIDAD3.listasytuplas.pedir_dato_string

//Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de una escuela, finalizando cuando se introduzca “x”. A continuación, solicitar que introduzca los nombres de los alumnos de secundaria, finalizando al introducir “x”.
//
//Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin repeticiones.
//Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
//Mostrar qué nombres de primaria no se repiten en los de nivel secundaria.
//Mostrar si todos los nombres de primaria están incluidos en secundaria


fun mostrar_alumnos(alumnos_primaria: Set<String>, alumnos_secundaria: Set<String>){
    println("Alumnos de primaria: $alumnos_primaria")
    println("Alumnos de secundaria: $alumnos_secundaria")
}

fun mostrar_repetidos(alumnos_primaria: Set<String>, alumnos_secundaria: Set<String>){
    println(alumnos_primaria.intersect(alumnos_secundaria))
}

fun mostrar_no_repetidos(alumnos_primaria: Set<String>, alumnos_secundaria: Set<String>){
    println(alumnos_primaria - alumnos_secundaria)
}

fun incluidos(alumnos_primaria: Set<String>, alumnos_secundaria: Set<String>){
    if(alumnos_secundaria.containsAll(alumnos_primaria)){
        println("Todos los alumnos de primaria están en secundaria")
        }else{
            println("No todos los alumnos de primaria están en secundaria.")
    }
}

fun ejercicio2conjuntos(){
    var terminar = false
    var primaria_terminado = false
    var alumnos_primaria = mutableSetOf<String>()
    var alumnos_secundaria = mutableSetOf<String>()
    while (!terminar){
        while (!primaria_terminado){
            println("Introduce alumnos de primaria")
            var alumno = pedir_dato_string("Introduce el nombre del alumno o x para finalizar")
            if(alumno == "x"){
                primaria_terminado = true
            }else{
                alumnos_primaria.add(alumno)
            }
        }
        println("Introduce alumnos de secundaria")
        var alumno = pedir_dato_string("Introduce el nombre del alumno o x para finalizar")
        if(alumno == "x"){
            terminar = true
        }else{
            alumnos_secundaria.add(alumno)
        }
    }
    println("Mostrar todos los alumnos:")
    mostrar_alumnos(alumnos_primaria,alumnos_secundaria)

    println("Mostrar los alumnos repetidos:")
    mostrar_repetidos(alumnos_primaria,alumnos_secundaria)

    println("Mostrar los que no son repetidos:")
    mostrar_no_repetidos(alumnos_primaria,alumnos_secundaria)

    println("Mostrar si los alumnos de primaria están en secundaria")
    incluidos(alumnos_primaria,alumnos_secundaria)
    pausa()
}