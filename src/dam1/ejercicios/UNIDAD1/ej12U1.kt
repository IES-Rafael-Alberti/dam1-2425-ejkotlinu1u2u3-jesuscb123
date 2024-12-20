package dam1.ejercicios.UNIDAD1//Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales.
import kotlin.math.pow
import kotlin.math.roundToInt

fun pedir_dato(): Float{
    var dato: Float? = null
    var dato_correcto = false
    try {
        while (dato_correcto == false) {
            println("Introduce tu peso")
            var dato = readln().toFloat()
            dato_correcto = true
        }
    } catch (e: Exception) {
        dato_correcto = false
        println("Error, introduce un peso correcto")
    }
    return dato!!
}

fun calcular_masa_muscular(peso: Float,metros: Float):Float?{
   var masa_muscular_redondeada: Float? = null
    try{
       var masa_muscular = peso / metros.pow(2)
        masa_muscular_redondeada = masa_muscular.roundToInt().toFloat()
    }catch (e: Exception){
        println("error, no se puede calcular el índice de masa muscular")
    }
    return masa_muscular_redondeada
}


fun ejercicio12(){
    var peso = pedir_dato()
    var metros = pedir_dato()
    var masa_muscular = calcular_masa_muscular(peso,metros)
    println("Tu masa muscular es: $masa_muscular")

}