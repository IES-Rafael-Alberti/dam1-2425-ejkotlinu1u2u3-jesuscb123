package com.dam1.ejercicios.UNIDAD3.conjuntos

import com.dam1.ejercicios.UNIDAD1.pausa

//Dadas las siguientes listas:
//
//frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
//frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]
//Crea conjuntos a partir de estas listas y nómbralos set_frutas1 y set_frutas2.
//Encuentra las frutas que están en ambas listas y guárdalas en un nuevo conjunto llamado frutas_comunes.
//Encuentra las frutas que están en frutas1 pero no en frutas2 y guárdalas en un conjunto llamado frutas_solo_en_frutas1.
//Encuentra las frutas que están en frutas2 pero no en frutas1 y guárdalas en un conjunto llamado frutas_solo_en_frutas2.

fun solo_frutas2(frutas1: Set<String>, frutas2: Set<String>):Set<String> {
    val frutas_solo_en_frutas2 = frutas2 - frutas1
    return frutas_solo_en_frutas2
}
fun solo_frutas1(frutas1: Set<String>, frutas2: Set<String>): Set<String> {
    val frutas_solo_en_frutas1 = frutas1 - frutas2
    return frutas_solo_en_frutas1
}

fun frutas_repetidas(frutas1: Set<String>, frutas2: Set<String>): Set<String> {
    val frutas_comunes = frutas1.intersect(frutas2)
    return frutas_comunes
}


fun ejercicio4conjuntos(){
    val frutas1 = setOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = setOf("manzana", "pera", "durazno", "sandía", "uva")
    val frutas_comunes = frutas_repetidas(frutas1, frutas2)
    val solo_frutas_en_frutas1 = solo_frutas1(frutas1,frutas2)
    val solo_frutas_en_frutas2 = solo_frutas2(frutas1,frutas2)
    println("Frutas comunes: $frutas_comunes")
    println("Frutas solo en frutas1: $solo_frutas_en_frutas1")
    println("Frutas solo en frutas2: $solo_frutas_en_frutas2")
    pausa()
}