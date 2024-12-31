package dam1.ejercicios.UNIDAD2.iterativas

//Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.


fun mostrar_cuenta_atras(numero: Int){
    var cuenta_atras = ""
    for(i: Int in numero downTo 1){
        if(i == 1){
            cuenta_atras += i.toString() + "."
        } else{
            cuenta_atras += i.toString() + ","
        }
    }
    println(cuenta_atras)
}

fun ejercicio4iterativa(){
    var numero = pedir_numero("Introduce un número positivo")
    mostrar_cuenta_atras(numero)
}