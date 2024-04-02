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

    fun getSec(){
        var resultado = ""
        sec.forEach { resultado+= "${it} " }
        entradaSalida.salida(sec)
    }

    fun mostrarSec(){
        entradaSalida.salida(sec)
    }
}