package dam1.ejercicios.UNIDAD2.excepciones

//Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.


fun mostrar_impares(numero: Int){
    var numeros_por_comas = ""
    for(i in 1..numero step 2){
        if(i == numero){
            numeros_por_comas += i.toString() + "."
        }else{
            numeros_por_comas += i.toString() + ","
        }
    }
    println(numeros_por_comas)
}

fun pedir_numero_positivo(msj: String): Int{
    var numero = 0
    var numero_positivo = false
    do{
        try{
            println(msj)
            numero = readln().toInt()
            if(numero < 0){
                throw IllegalArgumentException("**ERROR** Introduce un número positivo.")
            }
            numero_positivo = true
        }catch (e: IllegalArgumentException){
            mostrar_error("$e")
        }catch (e: NumberFormatException){
            mostrar_error("**ERROR** introduce un número entero.")
        }
    }while(!numero_positivo)
    return numero
}

fun ejercicio2excepciones() {
    val numero = pedir_numero_positivo("Introduce un número entero")
    mostrar_impares(numero)
}