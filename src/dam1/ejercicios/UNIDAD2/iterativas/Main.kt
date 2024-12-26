package dam1.ejercicios.UNIDAD2.iterativas

import dam1.ejercicios.UNIDAD1.*

fun mostrar_menu(){
    val menu = """
        EJERCICIOS UNIDAD 2 | Iterativas
        --------------------------------
        Indica el ejercicio al que quieres acceder: 
        2:  Ejercicio2
        4:  Ejercicio4
        6:  Ejercicio6
        7:  Ejercicio7
        8:  Ejercicio8
        13: Ejercicio13
        15: Ejercicio15
        18: Ejercicio18
        19: Ejercicio19
        25: Ejercicio25
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

fun main() {
    val EJERCICIOS = listOf(2,4,6,7,8,13,15,18,19,25)
    mostrar_menu()
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)

    when(ejercicio_usuario){
        2 -> ejercicio2iterativa()
        4 -> ejercicio4iterativa()
        6 -> ejercicio6iterativa()
        7 -> ejercicio7iterativa()
        //8 -> ejercicio8iterativa() //pendiente
        13 -> ejercicio13iterativa()
        15 -> ejercicio15iterativa()
        18 -> ejercicio18iterativa()
        19 -> ejercicio19iterativa()
        25 -> ejercicio25iterativa()
        else ->{
            println("has finalizado el programa")
        }
    }
}