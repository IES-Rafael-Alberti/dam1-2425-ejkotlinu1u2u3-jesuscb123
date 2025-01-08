package com.dam1.ejercicios.UNIDAD1

import kotlin.math.round

// Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.


fun cantidad_ahorros_años(cuenta_ahorro: Double, años: Int, tasa: Double){
    var ahorro_final = cuenta_ahorro
    for (i in 0..años){
        ahorro_final *= (1 + tasa)
        var ahorro_redondeado = round(ahorro_final * 100) / 100
        println("Tu ahorro durante el año $i es: $ahorro_redondeado")
    }
}





fun pedir_ahorro(msj:String): Double{
    var ahorro_correcto = false
    var ahorro = 0.0
    while(!ahorro_correcto){
        try {
            println(msj)
            ahorro = readln().toDouble()
            ahorro_correcto = true
        }catch (e: NumberFormatException){
            println("Error, introduce un número válido")
        }
    }
    return ahorro
}


fun ejercicio15(){
    var cuenta_ahorro = pedir_ahorro("Introduce tu ahorro: ")
    cantidad_ahorros_años(cuenta_ahorro,3,0.04)
}






