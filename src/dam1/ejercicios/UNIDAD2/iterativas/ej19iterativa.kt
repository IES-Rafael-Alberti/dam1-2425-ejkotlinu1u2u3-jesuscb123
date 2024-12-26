package dam1.ejercicios.UNIDAD2.iterativas

//Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-finalizar programa. A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El menú se debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las opciones 1 ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará.

var MENU ="""
          Bienvenido a mi programa
          ------------------------
          1. Comenzar programa.
          2. Imprimir listado.
          3. Salir.
            """.trimIndent()

fun limpiar_pantalla(){
    for (i in 1..10) {
        println(" ")
    }
}

fun pedir_opcion(): Int{
   var opcion_correcta = false
    var opcion = 0
    while(!opcion_correcta){
        try{
            println(MENU)
            println("Introduce una opción")
            opcion = readln().toInt()
            if(opcion < 1 || opcion > 3){
                throw IllegalArgumentException("**ERROR** Introduce una opción correcta")
            }
            opcion_correcta = true
        }catch(e:IllegalArgumentException){
            mostrar_error("$e")
        }catch(e:Exception){
            mostrar_error("$e")
        }
    }
  return opcion
}



fun ejercicio19iterativa(){
    do{
        limpiar_pantalla()
        var opcion = pedir_opcion()
        when(opcion){
            1 -> println("Has comenzado el programa")
            2 -> println("Imprimiendo listado...")
            else ->{
                println("Has finalizado el programa.")
            }
        }
    } while(opcion != 3)

}