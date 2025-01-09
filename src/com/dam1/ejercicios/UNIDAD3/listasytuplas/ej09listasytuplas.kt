package com.dam1.ejercicios.UNIDAD3.listasytuplas

import com.dam1.ejercicios.UNIDAD1.pausa


//Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.




fun contador_vocal_en_palabra(VOCALES:List<String>,palabra: String){
    var cont_a = 0
    var cont_e = 0
    var cont_i = 0
    var cont_o = 0
    var cont_u = 0
    for(vocal in VOCALES){
        if(vocal in palabra){
            if(vocal == "a"){
                cont_a ++
            }else if(vocal == "e"){
                cont_e++
            }else if(vocal == "i"){
                cont_i++
            }else if(vocal == "o"){
                cont_o++
            }else{
                cont_u++
            }
        }
    }
    println("La vocal a aparece $cont_a veces.")
    println("La vocal e aparece $cont_e veces.")
    println("La vocal i aparece $cont_i veces.")
    println("La vocal o aparece $cont_o veces.")
    println("La vocal u aparece $cont_u veces.")
 }


fun ejercicio9listasytuplas() {
    val VOCALES = listOf("a","e","i","o","u")
    val palabra = pedir_dato_string("Introduce una palabra")
    contador_vocal_en_palabra(VOCALES,palabra)
    pausa()
}