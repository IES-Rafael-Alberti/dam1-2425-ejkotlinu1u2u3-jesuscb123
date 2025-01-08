package com.dam1.ejercicios.UNIDAD2.SentenciasCondicionales

//Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.


fun mostrar_grupo_correspondiente(nombre: String, sexo: String){
    var letra_nombre: Char = nombre[0]
    if (letra_nombre < 'm' && sexo == "mujer"){
        println("Perteneces al grupo A")
    }else if(letra_nombre > 'n' && sexo == "hombre"){
        println("Perteneces al grupo A")
    }else{
        println("Perteneces al grupo B")
    }
}

fun introducir_dato(msj: String): String{
    println(msj)
    val dato = readln().toString().lowercase()
    return dato
}


fun ejercicio6condicionales(){
    val nombre = introducir_dato("Introduce tu nombre:")
    val sexo = introducir_dato("Introduce tu sexo:")
    mostrar_grupo_correspondiente(nombre, sexo)
}