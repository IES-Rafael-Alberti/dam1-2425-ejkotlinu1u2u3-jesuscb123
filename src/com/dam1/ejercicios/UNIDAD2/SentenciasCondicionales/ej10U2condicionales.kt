package com.dam1.ejercicios.UNIDAD2.SentenciasCondicionales

//La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los ingredientes para cada tipo de pizza aparecen a continuación.
//
//Ingredientes vegetarianos: Pimiento y tofu.
//Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
//Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija. Solo se puede eligir un ingrediente además de la mozzarella y el tomate que están en todas la pizzas. Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes que lleva.

val MENU1 = """
               Bienvenido a la pizzeria Bella Napoli
               -------------------------------------
               Elige que tipo de pizza que deseas pedir:
               1. Vegetariana
               2. No vegetariana
                """.trimIndent()
val MENU_VEGETARINO = """
                        Elige un ingrediente para añadir a tu pizza vegetariana
                        -------------------------------------------------------
                        1. Pimiento
                        2. Tofu
                        """.trimIndent()

val MENU_NOVEGETARIANO = """
                         Elige un ingrediente para añadir a tu pizza no vegetariana
                         ----------------------------------------------------------
                         1. Peperoni
                         2. Jamón
                         3. Salmón
                         """.trimIndent()

fun pizza_vegetariana(): String{
    var ingrediente_correcto = false
    var ingrediente_usuario = ""
    while(!ingrediente_correcto){
        println(MENU_VEGETARINO)
        try {
            var opcion_usuario = readln().toInt()
            if (opcion_usuario < 1 || opcion_usuario > 2) {
                throw IllegalArgumentException("Introduce una opción correcta.")
            }
            ingrediente_correcto = true
            when(opcion_usuario){
                1 -> ingrediente_usuario = "pimiento"
                2 -> ingrediente_usuario = "tofu"
            }
        }catch (e: NumberFormatException){
            mostrar_error("$e")
        }catch (e: IllegalArgumentException){
            mostrar_error("$e")
        }
    }
    return ingrediente_usuario
}

fun pizza_novegetariana(): String{
    var ingrediente_correcto = false
    var ingrediente_usuario = ""
    while(!ingrediente_correcto){
        println(MENU_NOVEGETARIANO)
        try {
            var opcion_usuario = readln().toInt()
            if (opcion_usuario < 1 || opcion_usuario > 3) {
                throw IllegalArgumentException("Introduce una opción correcta.")
            }
            ingrediente_correcto = true
            when(opcion_usuario){
                1 -> ingrediente_usuario = "peperoni"
                2 -> ingrediente_usuario = "jamón"
                3 -> ingrediente_usuario = "salmón"
            }
        }catch (e: NumberFormatException){
            mostrar_error("$e")
        }catch (e: IllegalArgumentException){
            mostrar_error("$e")
        }
    }
    return ingrediente_usuario
}


fun introducir_ingrediente(tipo_pizza: String):String {
    var ingrediente_usuario = ""
    if (tipo_pizza == "vegetariana") {
        ingrediente_usuario = pizza_vegetariana()
    }else if(tipo_pizza == "no vegetariana") {
        ingrediente_usuario = pizza_vegetariana()
    }
    return ingrediente_usuario
}

fun introducir_tipo_pizza(): String{
   var opcion_correcta = false
    var pizza = ""
    while(!opcion_correcta){
        try{
            println(MENU1)
           var opcion_usuario = readln().toInt()
            if(opcion_usuario < 1 || opcion_usuario > 2){
                throw IllegalArgumentException("Opción incorrecta, elige una opción disponible")
            }
            opcion_correcta = true
            when(opcion_usuario){
                1 -> pizza = "vegetariana"
                2 -> pizza = "no vegetariana"
                else -> {
                    println("No has elegido ningún tipo de pizza.")
                }
            }
        }catch(e:IllegalArgumentException){
            mostrar_error("$e")
        }catch (e: NumberFormatException){
            mostrar_error("$e")
        }
    }
    return pizza
}

fun mostrar_pedido(tipo_pizza: String, ingrediente: String){
    if(tipo_pizza == "vegetariana"){
        println("Tu pizza es: $tipo_pizza. Ingredientes: tomate, mozarella y $ingrediente")
    }else if(tipo_pizza == "no vegetariana"){
        println("Tu pizza es $tipo_pizza. Ingredientes: tomate, mozarella y $ingrediente")
    }
}

fun ejercicio10condicionales(){
    val tipo_pizza = introducir_tipo_pizza()
    val ingrediente_usuario = introducir_ingrediente(tipo_pizza)
    mostrar_pedido(tipo_pizza, ingrediente_usuario)



}