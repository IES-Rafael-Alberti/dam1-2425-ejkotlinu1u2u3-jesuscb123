package com.dam1.ejercicios.UNIDAD1

//Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.


//Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.

fun nombre_capitalizado(nombre_completo: String): String {
    var lista_nombre_completo = separar_nombre_completo(nombre_completo)
    var nombre_completo_capitalizado = ""
    for(palabra in lista_nombre_completo){
        var palabra_capitalizada = palabra.replaceFirstChar { it.uppercase() }
        nombre_completo_capitalizado+= " " + palabra_capitalizada
    }
    return nombre_completo_capitalizado
}

fun separar_nombre_completo(nombre_completo: String): List<String>{
    val nombre_separado = nombre_completo.split(" ")
    return nombre_separado
}

fun mostrar_nombre(nombre_completo: String){
    println("Nombre en minúscula:")
    val nombre_minuscula = nombre_completo.lowercase()
    println(nombre_minuscula)

    println("Nombre en mayúscula")
    val nombre_mayuscula = nombre_completo.uppercase()
    println(nombre_mayuscula)

    println("Nombre capitalizado")
    println(nombre_capitalizado(nombre_completo))
}

fun pedir_nombre(msj: String): String{
    println(msj)
    val nombre_completo = readln().toString()
    return nombre_completo
}

fun ejercicio18(){
    val nombre_completo = pedir_nombre("Introduce tu nombre")
    mostrar_nombre(nombre_completo)

}