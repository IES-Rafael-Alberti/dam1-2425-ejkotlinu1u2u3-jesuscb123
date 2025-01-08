package com.dam1.ejercicios.UNIDAD1//Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).



fun pedir_importe(): Float? {
    var importe_correcto = false
    var importe: Float? = null
    while(importe_correcto == false){
        try{
            println("Introduce el importe total para calcular el precio sin iva")
            importe = readln().toFloat()
            if(importe != null){
                importe_correcto = true
                return importe
            }else{
                println("Error, introduce un importe correcto.")
            }
        } catch (e: Exception){
            println(e.message)
        }
    }
    return null
}



fun calcular_sin_iva(importe: Float,iva: Int): Float? {
    try {
        var iva_decimal = (iva / 100.0)
        var importe_sin_iva = importe / (iva_decimal + 1).toFloat()
        return importe_sin_iva
    } catch (e: Exception){
        println("error, no se puede calcular el importe sin iva")
    }
    return null
}



fun ejercicio6(){
    val iva = 10
    var importe = pedir_importe()
    if (importe != null) {
        val importe_sin_iva = calcular_sin_iva(importe,iva)
        if (importe_sin_iva != null) {
            println("El importe con iva es: $importe y quitando el iva es: $importe_sin_iva")
        } else{
            println("Error al calcular el importe sin iva")
        }
    } else{
        println("Error, el importe no es válido")
    }
}