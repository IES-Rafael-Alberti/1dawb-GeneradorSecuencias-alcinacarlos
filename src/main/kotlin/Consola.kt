package org.generadorsecuencias

class Consola:IEntradaSalida {
    override fun salida(salida: Any) {
        println(salida)
    }

    override fun entrada(): String = readln()

    override fun pedirNumero():Int{
        var num: Int? = null
        while (num == null || num < 1 ){
            salida("Introduze un número: ")
            num = entrada().toIntOrNull()
        }
        return num
    }

    override fun mostrarMenu():Int{
        var opcion:Int? = null
        while (opcion !in 1..3){
            salida("1. Frase incremental")
            salida("2. Frase final")
            salida("3. Salir")
            salida("Selecciona una opción válida")
            opcion = readln().toIntOrNull()
        }
        return opcion!!
    }

}