package org.generadorsecuencias

class Consola:IEntradaSalida {
    override fun salida(salida: Any) {
        println(salida)
    }

    override fun entrada(): String = readln()

    fun pedirNumero():Int{
        var num: Int? = null
        while (num == null){
            salida("Introduze un número: ")
            num = entrada().toIntOrNull()
        }
        return num
    }

}