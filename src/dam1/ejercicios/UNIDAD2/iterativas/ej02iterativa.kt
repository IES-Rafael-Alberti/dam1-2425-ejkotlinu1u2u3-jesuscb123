package dam1.ejercicios.UNIDAD2.iterativas

//Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).


fun mostrar_años(edad_usuario: Int){
    var año = 0
    for(i: Int in 1..edad_usuario){
        println(i)
    }
}

fun pedir_numero(msj: String): Int{
    println(msj)
    var edad_usuario = readln().toInt()
    return edad_usuario
}

fun ejercicio2iterativa(){
    val edad_usuario = pedir_numero("Introduce tu edad")
    mostrar_años(edad_usuario)
}