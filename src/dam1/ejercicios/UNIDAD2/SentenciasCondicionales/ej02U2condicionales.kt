package dam1.ejercicios.UNIDAD2.SentenciasCondicionales



fun comprobar_coincidencia(contrasenia_defecto: String,contrasenia: String): String{
    if(contrasenia_defecto == contrasenia){
        return "Contraseña correcta"
    } else{
        return "Contraseña incorrecta"
    }
}

fun introducir_contrasenia(msj: String): String{
    println(msj)
    val contrasenia = readLine().toString()
    return contrasenia.lowercase()

}

fun ejercicio2condicionales(){
    val contrasenia_defecto = "contraseña"
    val contrasenia = introducir_contrasenia("Introduce la constraseña")
    print(comprobar_coincidencia(contrasenia_defecto,contrasenia))
}