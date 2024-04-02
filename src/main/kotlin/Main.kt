package org.generadorsecuencias

fun main() {
    val consola = Consola()
    val generadorSecuencias = GeneradorSecuencias(consola)
    generadorSecuencias.fraseIncremental(consola.pedirNumero())
}