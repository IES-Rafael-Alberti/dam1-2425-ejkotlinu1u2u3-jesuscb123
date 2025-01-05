package dam1.ejercicios.UNIDAD1//Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales.
import kotlin.math.pow
import kotlin.math.roundToInt

fun pedir_dato_double(msj: String): Double{
    var  numero_double_correcto = false
    var dato = 0.0
    while(!numero_double_correcto){
        try{
            println(msj)
            dato = readln().toDouble()
            if(dato < 0){
                throw IllegalArgumentException("**ERROR** el número no puede ser negativo.")
            }
            numero_double_correcto = true

        }catch (e: IllegalArgumentException){
            mostrar_error("$e")
        }catch (e: NumberFormatException){
            mostrar_error("$e")
        }
    }
    return dato
}

fun calcular_masa_muscular(peso: Double,metros: Double): Double{
       var masa_muscular = peso / metros.pow(2)
    var masa_muscular_redondeada = masa_muscular
    return masa_muscular_redondeada
}


fun ejercicio12(){
    var peso = pedir_dato_double("Introduce tu peso")
    var metros = pedir_dato_double("Introduce tu altura")
    var masa_muscular = calcular_masa_muscular(peso,metros)
    println("Tu masa muscular es: $masa_muscular")

}