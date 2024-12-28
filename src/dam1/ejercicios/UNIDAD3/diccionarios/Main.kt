package dam1.ejercicios.UNIDAD3.diccionarios

import dam1.ejercicios.UNIDAD2.mainunidad2
import dam1.ejercicios.UNIDAD3.listasytuplas.mainlistasytuplas


fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 3 | Diccionarios
        ----------------------------------
        Indica a que ejercicio quieres acceder: 
        3. Ejercicio3. 
        5. Ejercicio5.
        6. Ejercicio6.
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

fun maindiccionarios() {
    val EJERCICIOS = listOf(3,5)
    mostrar_menu()
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)

    when(ejercicio_usuario){
        3 -> ejercicio3diccionarios()
        5 -> ejercicio5diccionarios()
        //6 -> mainunidad3()
        else ->{
            println("has finalizado el programa")
        }
    }
}