package dam1.ejercicios.UNIDAD1

fun mostrar_menu(){
    println("")
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
    val EJERCICIOS = listOf(4,6,12,15,18,20,21,22,24,25)
    val ejercicio_usuario = pedir_ejercicio("Introduce a que ejercicio quieres acceder",EJERCICIOS)

    when(ejercicio_usuario){
        4 -> ejercicio4()
        6 -> ejercicio6()
        12 -> ejercicio12() //pendiente
        15 -> ejercicio15() //pendiente
        18 -> ejercicio18()
        20 -> ejercicio20()
        21 -> ejercicio21()
        22 -> ejercicio22()
        24 -> ejercicio24()
        //25 -> ejercicio25()
        else ->{
            println("has finalizado el programa")
        }
    }
}



