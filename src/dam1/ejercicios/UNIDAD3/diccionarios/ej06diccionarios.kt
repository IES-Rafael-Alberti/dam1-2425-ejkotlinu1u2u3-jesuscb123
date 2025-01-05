package dam1.ejercicios.UNIDAD3.diccionarios

import dam1.ejercicios.UNIDAD3.listasytuplas.pedir_dato_string

// Escribir un programa que cree un diccionario vacío y lo vaya llenado con información sobre una persona (por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.) que se le pida al usuario. Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.


fun añadir_datos(tipo_dato: String, datos_usuario: MutableMap<String,String>,dato: String){
    datos_usuario[tipo_dato] = dato
    println(datos_usuario)

}

fun pedir_numero_positivo(msj: String): Int{
    var edad_correcta = false
    var edad = 0
    while(!edad_correcta) {
        try {
            println(msj)
            edad = readln().toInt()
            if(edad < 0){
                throw IllegalArgumentException("Error, introduce una edad correcta.")
            }
            edad_correcta = true
        }catch(e: IllegalArgumentException){
            dam1.ejercicios.UNIDAD2.excepciones.mostrar_error("$e")
        }
    }
    return edad
}

fun ejercicio6diccionarios(){
    var datos_usuario = mutableMapOf<String,String>()
    var nombre = pedir_dato_string("Introduce tu nombre")
    añadir_datos("nombre", datos_usuario,nombre)
    var edad = pedir_numero_positivo("Introduce tu edad").toString()
    añadir_datos("edad",datos_usuario,edad)
    var sexo = pedir_dato_string("Introduce tu sexo")
    añadir_datos("sexo",datos_usuario,sexo)
    var telefono = pedir_numero_positivo("Introduce tu teléfono").toString()
    añadir_datos("teléfono",datos_usuario, telefono)
    var correo = pedir_dato_string("Introduce correo")
    añadir_datos("correo",datos_usuario,correo)
}