package com.dam1.ejercicios.UNIDAD2.excepciones

//Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas. Deberá solicitar el número hasta introducir uno correcto.

fun mostrar_cuenta_atras(numero: Int){
    var cuenta_atras_coma = ""
    for(i in numero downTo 0){
        if(i == 0){
            cuenta_atras_coma += i.toString() + "."
        }else{
            cuenta_atras_coma += i.toString() + ","
        }
    }
    println(cuenta_atras_coma)
}

fun ejercicio3excepciones(){
    var numero = pedir_numero_positivo("Introduce un número entero")
    mostrar_cuenta_atras(numero)

}