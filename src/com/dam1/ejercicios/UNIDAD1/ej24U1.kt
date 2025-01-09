package com.dam1.ejercicios.UNIDAD1
//Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido.


fun mostrar_euros_decimales(precio: Float){
    var precio_string = precio.toString()
    var euros_decimales = precio_string.split(".")
    println("El número de euros es: ${euros_decimales[0]}, y el número de céntimos es: 0.${euros_decimales[1]}")
}

fun comprobar_decimales(numero_decimal: Float): Boolean{
    var numero_decimal_string = numero_decimal.toString()
    var entero_decimal = numero_decimal_string.split(".")
    var numero_decimales = 0
    for (digito in entero_decimal[1])
        numero_decimales += 1
    if (numero_decimales == 2){
        return true
    }else{
        return false
    }
}
fun introducir_precio(msj: String): Float{
    var precio_correcto = false
    var precio: Float = 0.0F
    while(!precio_correcto){
        try {
            println(msj)
            precio = readln().toFloat()
            if (!comprobar_decimales(precio)){
                throw IllegalArgumentException("Has introducido un número con más de 2 decimales")
            }
            precio_correcto = true

        }catch(e: NumberFormatException){
            mostrar_error("**ERROR** lo que has introducido no es un número decimal")
        }catch (e: IllegalArgumentException){
            mostrar_error("$e")
        }
    }
    return precio
}


fun ejercicio24(){
    var precio = introducir_precio("Introduce el precio del producto con dos decimales")
    mostrar_euros_decimales(precio)
    pausa()
}