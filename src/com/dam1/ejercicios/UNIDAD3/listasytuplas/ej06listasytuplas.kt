package com.dam1.ejercicios.UNIDAD3.listasytuplas

import com.dam1.ejercicios.UNIDAD2.excepciones.pedir_numero_positivo

//Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.

fun eliminar_asignatura_aprobada(lista_asignaturas: MutableList<String>, asignatura: String){
    lista_asignaturas.remove(asignatura)
}


fun mostrar_asignaturas_suspensas(asignaturas_suspensas: MutableList<String>){
    println("Asignaturas que debe repetir:")
    for(asignatura in asignaturas_suspensas){
        println(asignatura)
    }
}

fun pedir_notas(lista_asignaturas: MutableList<String>): MutableList<String> {
    for(asignatura in lista_asignaturas){
        var nota = pedir_numero_positivo("Introduce la nota que has sacado en $asignatura")
        if(nota > 5){
            eliminar_asignatura_aprobada(lista_asignaturas, asignatura)
        }
    }
    return lista_asignaturas
}

fun ejercicio6listasytuplas(){
    var lista_asignaturas = mutableListOf("Matemáticas", "Física", "Química","Historia","Lengua")
    var asignaturas_suspensas = pedir_notas(lista_asignaturas)
    mostrar_asignaturas_suspensas(asignaturas_suspensas)
}