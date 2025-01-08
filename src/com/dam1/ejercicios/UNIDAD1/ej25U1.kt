package com.dam1.ejercicios.UNIDAD1

// Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año. Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter.



fun comprobar_fecha_correcta(fecha: String): Boolean{
    var numero_barras = 0
    for(caracter in fecha){
        if(caracter.toString() == "/")
            numero_barras += 1
    }
    if(numero_barras == 2){
        return true
    }else{
        return false
    }
}

fun introducir_fecha(msj: String): String{
    var fecha = ""
    var fecha_correcta = false
    while(!fecha_correcta){
        try{
            println(msj)
            fecha = readLine().toString()
            if(!comprobar_fecha_correcta(fecha)){
                throw IllegalArgumentException("Debes introducir una fecha correcta separadas por /")
            }else{
                fecha_correcta = true
            }
        }catch (e: IllegalArgumentException){
            mostrar_error("$e")
        }
    }
    return fecha
}


fun ejercicio25(){
    var fecha = introducir_fecha("Introduce una fecha en formato dd/mm/aaaa")
    println(fecha)

}