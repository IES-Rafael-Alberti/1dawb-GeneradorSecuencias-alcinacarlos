package org.generadorsecuencias

class GeneradorSecuencias(
    private val entradaSalida: IEntradaSalida
){
    private lateinit var sec:Sequence<String>


    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(npalabras:Int){
        sec = lineSequence(npalabras)
        sec.forEach { entradaSalida.salida(it) }
    }
    fun fraseFinal(npalabras:Int){
        sec = lineSequence(npalabras)
        mostrarSec()
    }

    fun getSec(): String {
        var resultado = ""
        sec.forEach { resultado+= "${it} " }
        return resultado
    }

    fun mostrarSec(){
        entradaSalida.salida(getSec())
    }

    fun menu(){
        var opcion:Int? = null
        while (opcion != 3){
            opcion = entradaSalida.mostrarMenu()
            when(opcion){
                1 -> fraseIncremental(entradaSalida.pedirNumero())
                2 -> fraseFinal(entradaSalida.pedirNumero())
                3 -> entradaSalida.salida("Adios bro")
                else -> entradaSalida.salida("Opcion equivicada bro")
            }
        }
    }
}