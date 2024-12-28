package dam1.ejercicios.UNIDAD3.listasytuplas

//Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8 y muestre por pantalla el menor y el mayor de los precios.



fun dar_menor_mayor(precios: List<Int>): Pair<Int,Int>{
   val precio_min = precios.min()
    val precio_mayor = precios.max()
    return Pair(precio_min,precio_mayor)
}

fun ejercicio10listasytuplas(){
    val precios = listOf(50,75,46,22,80,65,8)
    val(menor,mayor) = dar_menor_mayor(precios)
    println("El menor de la lista es $menor y el mayor es $mayor")
}