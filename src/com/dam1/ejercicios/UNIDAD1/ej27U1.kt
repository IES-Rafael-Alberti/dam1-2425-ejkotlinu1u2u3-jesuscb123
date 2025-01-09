package com.dam1.ejercicios.UNIDAD1

// Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades y muestre por pantalla una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales, el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.


fun mostrar_producto_precio_total(producto: String, precio: Float, unidades: Int){
    val precio_formateado = "%6.2f".format(precio)
    val unidades_formateadas = "%03d".format(unidades)
    val coste_total = (precio * unidades)
    val coste_total_formateado = "%08.2f".format(coste_total)
    println("Producto: $producto")
    println("Precio/u: $precio_formateado")
    println("Unidades: $unidades_formateadas")
    println("Coste total: $coste_total_formateado")

}

fun introducir_numero(msj: String): Int{
    println(msj)
    val precio = readln().toInt()
    return precio
}

fun ejercicio27(){
    val producto = introducir_productos("Introduce un producto")
    val precio = introducir_numero("Introduce el precio del producto").toFloat()
    val unidades = introducir_numero("Introduce el número de unidades")
    mostrar_producto_precio_total(producto,precio,unidades)
    pausa()
}