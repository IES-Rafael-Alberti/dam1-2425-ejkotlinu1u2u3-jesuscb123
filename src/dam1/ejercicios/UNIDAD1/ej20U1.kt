package dam1.ejercicios.UNIDAD1

//Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34, y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte por un número de teléfono con este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.



fun mostrar_telefono(numero_telefono_completo: String) {
    val lista_numero = numero_telefono_completo.split("-")
    println(lista_numero[1])
}

fun comprobar_numero_correcto(prefijo_numero_extension:List<String>): Boolean {
    var tamaño_lista = 0
        for (numero in prefijo_numero_extension) {
            tamaño_lista += 1
        }
    if(tamaño_lista > 3){
        return false
    }
        return true
}

fun introducir_telefono(msj: String): String {
    var numero_correcto = false
    while(!numero_correcto){
        try{
            println(msj)
            val numero_telefono_completo = readln().toString()
            var prefijo_numero_extension = numero_telefono_completo.split("-")
            if(!comprobar_numero_correcto(prefijo_numero_extension)) {
                throw IllegalArgumentException("El número introducido es incorrecto")
            }
            numero_correcto = true

        }catch (e: IllegalArgumentException){
            mostrar_error("$e")
        }
    }
}



fun ejercicio20(){
    val numero_telefono_completo = introducir_telefono("Ingresa un número de teléfono con prefijo, teléfono y extensión")
    mostrar_telefono(numero_telefono_completo)
}