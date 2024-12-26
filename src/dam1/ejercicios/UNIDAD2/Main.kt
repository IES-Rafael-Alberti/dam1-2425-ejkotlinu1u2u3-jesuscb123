package dam1.ejercicios.UNIDAD2

import dam1.ejercicios.UNIDAD1.*
import dam1.ejercicios.UNIDAD2.SentenciasCondicionales.maincondicionales
import dam1.ejercicios.UNIDAD2.excepciones.mainexcepciones
import dam1.ejercicios.UNIDAD2.iterativas.mainiterativas

fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 2
        -------------------
        Indica a que paquete de ejercicios quieres acceder: 
        1:  Condicionales
        2:  Iterativas
        3:  Captura de excepciones.
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

fun mainunidad2() {
    val EJERCICIOS = listOf(1,2,3)
    mostrar_menu()
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)
    when(ejercicio_usuario){
    1 -> maincondicionales()
    2 -> mainiterativas()
    3 -> mainexcepciones()
        else ->{
            println("has finalizado el programa")
        }
    }
}