package com.dam1.ejercicios.UNIDAD1

//explicame esto en kotlin Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.


fun pausa(){
    println("Pulsa ENTER para continuar...")
    readln()
}

fun pedir_temperatura(): Float? {
    println("Dime la temperatura en Celsius")
    try {
        var celsius_temperatura = readln().toFloat()
        return celsius_temperatura
    } catch (e: Exception) {
        return null
    }
}




fun convertir_fare(n_temperatura: Float): Float? {
    try {
    var far_temperatura = n_temperatura * (9 / 5) + 32
        return far_temperatura
    } catch (e: Exception) {
        return null
    }
}


fun ejercicio4() {
    var temperatura_correcta = false
    var celsius_temperatura: Float? = null
    while (temperatura_correcta == false){
        celsius_temperatura = pedir_temperatura()
        if (celsius_temperatura != null){
            temperatura_correcta = true
        } else{
            println("Entrada incorrecta, vuelve a ingresar una temperatura válida")
        }
    }

    var far_temperatura = convertir_fare(celsius_temperatura!!)
    if (far_temperatura != null){
        println("La temperatura en Celsius es: $celsius_temperatura y la temperatura en Fahrenheit es: $far_temperatura")
        pausa()
    }else{
        println("Error de conversión")
    }
}
