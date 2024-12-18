package dam1.ejercicios.UNIDAD1// Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.


/*fun cantidad_ahorros_años(cuenta_ahorro: Float, años: Int = 3){
    for (i in 0..años){

    }
}

 */



fun pedir_ahorro(msj:String): Float{
    var ahorro_correcto = false
    var ahorro: Float = 0.0F
    while(!ahorro_correcto){
        try {
            println(msj)
            ahorro = readln().toFloat()
            ahorro_correcto = true
        }catch (e: NumberFormatException){
            print("Error, introduce un número válido")
        }
    }
    return ahorro
}


fun ejercicio15(){
    var cuenta_ahorro = pedir_ahorro("Introduce tu ahorro: ")
    //cantidad_ahorros_años(cuenta_ahorro,3)
}






