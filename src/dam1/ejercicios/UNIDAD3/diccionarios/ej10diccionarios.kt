package dam1.ejercicios.UNIDAD3.diccionarios

import dam1.ejercicios.UNIDAD2.iterativas.limpiar_pantalla
import dam1.ejercicios.UNIDAD2.iterativas.pedir_opcion
import dam1.ejercicios.UNIDAD3.listasytuplas.pedir_dato_string

//Escribir un programa que permita gestionar la base de datos de clientes de una empresa. Los clientes se guardarán en un diccionario en el que la clave de cada cliente será su NIF, y el valor será otro diccionario con los datos del cliente (nombre, dirección, teléfono, correo, preferente), donde preferente tendrá el valor True si se trata de un cliente preferente. El programa debe preguntar al usuario por una opción del siguiente menú: (1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los clientes, (5) Listar clientes preferentes, (6) Terminar. En función de la opción elegida el programa tendrá que hacer lo siguiente:
//
//Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la base de datos.
//Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
//Preguntar por el NIF del cliente y mostrar sus datos.
//Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
//Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
//Terminar el programa.



    val MENU = """
                1. Añadir cliente.
                2. Eliminar cliente.
                3. Mostrar cliente.
                4. Listar clientes.
                5. Listar clientes preferentes.
                6. terminar.
                """.trimIndent()




fun pedir_dni(msj: String): String{
    var dni_correcto = false
    var dni = ""
    while(!dni_correcto) {
        try {
            dni = pedir_dato_string("Introduce tu dni")
            if(dni.length != 9){
                throw IllegalArgumentException("El dni debe tener 9 caracteres")
            }else{
                dni_correcto = true
            }
        }catch(e: IllegalArgumentException){
            dam1.ejercicios.UNIDAD1.mostrar_error("$e")
        }
    }
    return dni.lowercase()
}

fun mostrar_solo_preferentes(base_datos: MutableMap<String, MutableMap<String, String>>){
    for(dni in base_datos.keys){
        val datos_cliente = base_datos[dni]
        if(datos_cliente != null){
            if(datos_cliente["preferente"] == "Si"){
                println("Dni: $dni datos del cliente: $datos_cliente")
            }
        }
    }
}

fun mostrar_todos_clientes(base_datos: MutableMap<String, MutableMap<String, String>>){
    limpiar_pantalla()
    for(dni in base_datos.keys){
        val datos_cliente = base_datos[dni]
        if(datos_cliente != null){
            val nombre_cliente = datos_cliente["nombre"]
            println("Dni: $dni Nombre: $nombre_cliente")
        }else{
            println("No se encuentra el dni")
        }
    }
}

fun mostrar_cliente(base_datos: MutableMap<String, MutableMap<String, String>>){
    limpiar_pantalla()
    var dni_cliente = pedir_dni("Introduce el dni del cliente que quieres mostrar")
    if(dni_cliente in base_datos.keys){
        println(base_datos.get(dni_cliente))
    }else{
        println("El dni del cliente introducido no se encuentra disponible en la base de datos.")
    }
}


fun eliminar_cliente(base_datos: MutableMap<String, MutableMap<String, String>>){
    limpiar_pantalla()
    var dni_cliente = pedir_dni("Introduce el dni del cliente que quieras eliminar.")
    if(dni_cliente in base_datos.keys){
        base_datos.remove(dni_cliente)
    }else{
        println("El dni del cliente introducido no se encuentra disponible en la base de datos.")
    }
}

fun es_preferenciado(msj: String): String{
    println(msj)
    var opcion = pedir_opcion(OPCIONES = 2)
    if(opcion == 1){
        return "Si"
    }else{
        return "No"
    }
}

fun añadir_cliente(base_datos: MutableMap<String,MutableMap<String,String>>){
    limpiar_pantalla()
    var datos_cliente = mutableMapOf<String,String>()

    var DNI = pedir_dni("Introduce tu DNI")

    var nombre = pedir_dato_string("Introduce tu nombre")
    datos_cliente.put("nombre",nombre)

    var apellido = pedir_dato_string("Introduce tu apellido")
    datos_cliente.put("apellido",apellido)

    var telefono = pedir_dato_string("Introduce tu telefono")
    datos_cliente.put("telefono",telefono)

    var correo = pedir_dato_string("Introduce tu correo")
    datos_cliente.put("correo",correo)

    var preferenciado = es_preferenciado("Introduce 1 si el cliente es preferenciado o 2 si no lo es")
    datos_cliente.put("preferenciado",preferenciado)
    base_datos.put(DNI,datos_cliente)
    println(base_datos)
}


fun ejercicio10diccionarios(){
   var base_datos = mutableMapOf<String,MutableMap<String,String>>()
    val OPCIONES = 6
    var terminar = false
    while(!terminar){
        limpiar_pantalla()
        println(MENU)
        var opcion = pedir_opcion(OPCIONES)
        when(opcion) {
            1 -> añadir_cliente(base_datos)
            2 -> eliminar_cliente(base_datos)
            3 -> mostrar_cliente(base_datos)
            4 -> mostrar_todos_clientes(base_datos)
            5 -> mostrar_solo_preferentes(base_datos)
            6-> terminar = true
        }

    }
    println("Has finalizado el programa.")
}