package dam1.ejercicios.UNIDAD1

// Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.

fun mostrar_vocal_mayuscula(frase: String, vocal: String){
    val vocal_mayuscula = vocal.uppercase()
    var frase = frase.replace(vocal,vocal_mayuscula)
    println(frase)
}

fun comprobar_vocal(vocal: String,vocales: List<String>): Boolean{
    if(vocal in vocales){
        return true
    } else{
        return false
    }
}

fun introducir_vocal(msj: String): String{
    val vocales = listOf("a","e","i","o","u")
    var vocal_correcta = false
    var vocal = ""
    while(!vocal_correcta){
        try{
            println(msj)
            vocal = readln().toString()
            if(!comprobar_vocal(vocal,vocales))
                throw   IllegalArgumentException("Lo que has introducido no es una vocal.")
            vocal_correcta = true

        }catch(e:IllegalArgumentException){
            mostrar_error("$e")
        }
    }
    return vocal
}

fun ejercicio22(){
    val frase = introducir_frase("Introduce una frase: ")
    val vocal = introducir_vocal("Introduce una vocal para encontrarla en la frase: ")
    mostrar_vocal_mayuscula(frase,vocal)
}