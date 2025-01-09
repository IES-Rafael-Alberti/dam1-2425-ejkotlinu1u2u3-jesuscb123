package com.dam1.ejercicios.UNIDAD3.conjuntos

import com.dam1.ejercicios.UNIDAD1.pausa

//Dado el conjunto de números enteros:
//
//numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//Crea un conjunto pares que contenga los números pares del conjunto numeros.
//Crea un conjunto multiplos_de_tres que contenga los números que son múltiplos de tres del conjunto numeros.
//Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y guárdala en un conjunto llamado pares_y_multiplos_de_tres.




fun conjunto_pares_multiplo3(numeros: Set<Int>): Pair<Set<Int>, Set<Int>>{
    val pares = mutableSetOf<Int>()
    val multiplo3 = mutableSetOf<Int>()
    for(numero in numeros){
        if((numero % 2) == 0) {
            pares.add(numero)
        }
        if((numero % 3) == 0){
            multiplo3.add(numero)
        }
    }
   return Pair(pares, multiplo3)
}

fun ejercicio5conjuntos(){
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val (pares, multiplo3) = conjunto_pares_multiplo3(numeros)
    val pares_y_multiplos_de_3 = pares.intersect(multiplo3)
    println("Numeros: $numeros")
    println("Numeros pares: $pares")
    println("Numeros multiplo3: $multiplo3")
    println("Numeros pares y multiplos de 3: $pares_y_multiplos_de_3")
    pausa()
}