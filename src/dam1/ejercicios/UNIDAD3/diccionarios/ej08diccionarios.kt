package dam1.ejercicios.UNIDAD3.diccionarios

import dam1.ejercicios.UNIDAD3.listasytuplas.pedir_dato_string


//Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las palabras en español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas. El programa debe crear un diccionario con las palabras y sus traducciones. Después pedirá una frase en español y utilizará el diccionario para traducirla palabra a palabra. Si una palabra no está en el diccionario debe dejarla sin traducir.


fun traducir_frase(frase: String, diccionario_español_ingles: Map<String,String>){
    var frase_traducida = ""
    var lista_frase = frase.split(" ")
    for(palabra in lista_frase){
        if(palabra in diccionario_español_ingles.keys){
            frase_traducida += " " + diccionario_español_ingles.get(palabra)
        }else{
            frase_traducida += " "+ palabra
        }
    }
    println(frase_traducida)
}

fun crear_diccionario(lista_pares: List<String>):Map<String, String>{
    var diccionario_español_ingles = mutableMapOf<String,String>()
    for(pares in lista_pares){
        var par_español_ingles = pares.split(':')
        diccionario_español_ingles[par_español_ingles[0]] = par_español_ingles[1]
    }
    return diccionario_español_ingles
}

fun introduce_español_ingles(msj: String): List<String>{
    println(msj)
    var español_ingles = readln().lowercase()
    val lista_pares = español_ingles.split(',')
    return lista_pares
}

fun ejercicio8diccionarios(){
    var lista_pares_español_ingles = introduce_español_ingles("Introduce una palabra en español : palabra ingles y separa por , cada par.")
    var diccionario_español_ingles = crear_diccionario(lista_pares_español_ingles)
    println(diccionario_español_ingles)
    val frase = pedir_dato_string("Introduce una frase")
    traducir_frase(frase,diccionario_español_ingles)


}