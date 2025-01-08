package com.dam1.ejercicios.UNIDAD3.listasytuplas

import com.dam1.ejercicios.UNIDAD2.mainunidad2


fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 3 | listas y tuplas
        -------------------------------------------
        Indica a que unidad quieres acceder: 
        4.  Ejercicio4.
        6.  Ejercicio6.
        8.  Ejercicio8.
        9.  Ejercicio9.
        10. Ejercicio10.
        
        0. Salir.
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

fun mainlistasytuplas() {
    val EJERCICIOS = listOf(4,6,8,9,10,13)
    mostrar_menu()
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)

    when(ejercicio_usuario){
        4 -> ejercicio4listasytuplas()
        6 -> ejercicio6listasytuplas()
        8 -> ejercicio8listasytuplas()
        9 -> ejercicio9listasytuplas()
        10 -> ejercicio10listasytuplas()
        13 -> ejercicio13listasytuplas()
        else ->{
            println("has finalizado el programa")
        }
    }
}