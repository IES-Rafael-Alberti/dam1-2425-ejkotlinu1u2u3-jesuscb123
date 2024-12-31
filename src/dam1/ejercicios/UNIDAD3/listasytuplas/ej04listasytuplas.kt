package dam1.ejercicios.UNIDAD3.listasytuplas

import dam1.ejercicios.UNIDAD2.excepciones.pedir_numero_positivo
import dam1.ejercicios.UNIDAD2.iterativas.pedir_numero

//Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.

fun mostrar_lista_ordenada(numeros_loteria: List<Int>){
    val numeros_loteria_ordenado = numeros_loteria.sorted()
    println(numeros_loteria_ordenado)
}


fun ganadores_loteria(): List<Int>{
    var numero = 0
    var posicion = 1
    var numeros_loteria: MutableList<Int> = mutableListOf()
    for(i in 1..5){
        numero = pedir_numero_positivo("Introduce el número $posicion de la lotería:")
        numeros_loteria.add(numero)
        posicion ++
    }
    return numeros_loteria
}


fun ejercicio4listasytuplas(){
    val numeros_loteria = ganadores_loteria()
    mostrar_lista_ordenada(numeros_loteria)
}