package br.com.grupoliberal.encapsulamento

import java.math.BigDecimal

class Calculadora {


    /**
     * public
     * private
     * protected
     * internal
     */

    private var resultado: BigDecimal = BigDecimal.ZERO

    fun somar(a: BigDecimal) {
        resultado += a
        getResultado()
    }

    fun subtrair(a: BigDecimal) {
        resultado -= a
        getResultado()
    }

    fun multiplicar(a: BigDecimal) {
        resultado *= a
        getResultado()
    }

    fun dividir(a: BigDecimal) {
        resultado /= a
        getResultado()
    }

    private fun getResultado() {
        println("O resultado é: $resultado")
        //return resultado
    }
}