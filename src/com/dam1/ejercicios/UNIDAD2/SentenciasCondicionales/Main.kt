package com.dam1.ejercicios.UNIDAD2.SentenciasCondicionales


import com.dam1.ejercicios.UNIDAD2.iterativas.limpiar_pantalla
import com.dam1.ejercicios.UNIDAD2.mainunidad2

fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 2 | Condicionales
        -----------------------------------
        Indica el ejercicio al que quieres acceder: 
        2. ejercicio2.
        3. ejercicio3.
        6. ejercicio6.
        8. ejercicio8.
        10. ejercicio10.
        
        0. Atrás.

                """.trimIndent()
    println(menu)
}

fun mostrar_error(msj: String){
    println(msj)
}

fun pedir_ejercicio(msj:String,EJERCICIOS: List<Int>):Int{
    var ejercicio_correcto = false
    var ejercicio_usuario = 0
    while(!ejercicio_correcto){
        try{
            println(msj)
            ejercicio_usuario = readln().toInt()
            if (ejercicio_usuario !in EJERCICIOS && ejercicio_usuario != 0) {
                throw IllegalArgumentException("Debes meter una opción correcta")
            }else{
                ejercicio_correcto = true
            }

        } catch (e: IllegalArgumentException){
            mostrar_error("$e")
        } catch (e: NumberFormatException){
            mostrar_error("Introduce un número correcto")
        }
    }
    return ejercicio_usuario
}

fun maincondicionales() {
    val EJERCICIOS = listOf(2,3,6,8,10)

    var salir = false
    while(!salir){
        limpiar_pantalla()
        mostrar_menu()
        val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)
        when(ejercicio_usuario){
            2 -> ejercicio2condicionales()
            3 -> ejercicio3condicionales()
            6-> ejercicio6condicionales()
            8 -> ejercicio8condicionales()
            10 -> ejercicio10condicionales()
            else ->{
                salir = true
                println("has finalizado el programa")
            }
        }
    }

}