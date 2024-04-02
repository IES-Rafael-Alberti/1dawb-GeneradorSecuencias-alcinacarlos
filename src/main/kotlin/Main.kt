package org.generadorsecuencias

fun main() {
    val consola = Consola()
    val generadorSecuencias = GeneradorSecuencias(consola)
    generadorSecuencias.menu()
}