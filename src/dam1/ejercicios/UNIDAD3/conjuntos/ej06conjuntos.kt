package dam1.ejercicios.UNIDAD3.conjuntos

// Dado el conjunto de letras:
//
//vocales = {'a', 'e', 'i', 'o', 'u'}
//Crea un conjunto consonantes que contenga las letras del alfabeto que no son vocales.
//Crea un conjunto letras_comunes que contenga las letras que están tanto en el conjunto vocales como en el conjunto consonantes.
//Estos ejercicios te ayudarán a practicar y comprender mejor cómo trabajar con conjuntos en Python. ¡Espero que te sean útiles! Si tienes alguna pregunta o necesitas más ejercicios, no dudes en decírmelo.





fun ejercicio6conjuntos(){
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val consonantes = setOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')
    val letras_comunes = vocales.intersect(vocales)
    println(letras_comunes)
}