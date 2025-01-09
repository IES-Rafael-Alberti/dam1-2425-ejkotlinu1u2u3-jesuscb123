package com.dam1.ejercicios.UNIDAD3.diccionarios

import com.dam1.ejercicios.UNIDAD1.pausa

//El directorio de los clientes de una empresa está organizado en una cadena de texto como la de más abajo, donde cada línea contiene la información del nombre, email, teléfono, nif, y el descuento que se le aplica. Las líneas se separan con el carácter de cambio de línea \n y la primera línea contiene los nombres de los campos con la información contenida en el directorio.

//"nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"

//Escribir un programa que genere un diccionario con la información del directorio, donde cada elemento corresponda a un cliente y tenga por clave su nif y por valor otro diccionario con el resto de la información del cliente. Los diccionarios con la información de cada cliente tendrán como claves los nombres de los campos y como valores la información de cada cliente correspondientes a los campos. Es decir, un diccionario como el siguiente

//{'01234567L': {'nombre': 'Luis González', 'email': 'luisgonzalez@mail.com', 'teléfono': '656343576', 'descuento': 12.5}, '71476342J': {'nombre': 'Macarena Ramírez', 'email': 'macarena@mail.com', 'teléfono': '692839321', 'descuento': 8.0}, '63823376M': {'nombre': 'Juan José Martínez', 'email': 'juanjo@mail.com', 'teléfono': '664888233', 'descuento': 5.2}, '98376547F': {'nombre'


fun crear_diccionario_datos_cliente(lista_datos: List<String>): Map<String, String> {
    var diccionario_cliente = mapOf<String,String>("nombre" to lista_datos[1],"email" to lista_datos[2], "teléfono" to lista_datos[3], "descuento" to lista_datos[4])
    return diccionario_cliente
}
fun crear_diccionario_clientes(lista_todos_los_clientes: List<String>):MutableMap<String,Map<String,String>>{
    var diccionario_clientes = mutableMapOf<String,Map<String,String>>()
    for(cliente in lista_todos_los_clientes){
        var lista_datos = cliente.split(";")
        var dni = lista_datos[0]
        var diccionario_datos_cliente = crear_diccionario_datos_cliente(lista_datos)
        diccionario_clientes[dni] = diccionario_datos_cliente
    }
    return diccionario_clientes
}

fun crear_lista_datos(informacion_directorio: String): List<String>{
    val lista_clientes = informacion_directorio.split("\n")
    return lista_clientes
}

fun ejercicio11diccionarios() {
    val informacion_directorio = "n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    val lista_todos_los_clientes = crear_lista_datos(informacion_directorio)
    val diccionario_clientes = crear_diccionario_clientes(lista_todos_los_clientes)
    println(diccionario_clientes)
    pausa()
}

