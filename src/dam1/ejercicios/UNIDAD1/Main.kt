package dam1.ejercicios.UNIDAD1

fun mostrar_menu(){
    println("")
}

fun mostrar_error(msj: String){
    println(msj)
}

fun pedir_ejercicio(msj:String,NUMERO_OPCIONES: Int):Int{
   var ejercicio_correcto = false
    var ejercicio_usuario = 0
    while(!ejercicio_correcto){
        try{
            println(msj)
            ejercicio_usuario = readLine()!!.toInt()
            if (ejercicio_usuario < 1 || ejercicio_usuario > NUMERO_OPCIONES){
                throw IllegalArgumentException("Debes meter una opción correcta")
            }
            ejercicio_correcto = true
        } catch (e: IllegalArgumentException){
            mostrar_error("$e")
        } catch (e: NumberFormatException){
            mostrar_error("Introduce un número correcto")
        }
    }
    return ejercicio_usuario
}

fun main() {
    val NUMERO_OPCIONES = 6
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",NUMERO_OPCIONES)

    when(ejercicio_usuario){
        1 -> ejercicio4()
        2 -> ejercicio6()
        3 -> ejercicio12()
        4 -> ejercicio15()
        5 -> ejercicio18()
        else ->{
            println("has finalizado el programa")
        }
    }
}



