package org.generadorsecuencias

interface IEntradaSalida {
    fun salida(salida: Any)
    fun entrada():String

    fun pedirNumero():Int

    fun mostrarMenu():Int
}