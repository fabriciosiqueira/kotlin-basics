package br.com.grupoliberal.heranca

import java.math.BigDecimal
import java.math.RoundingMode

open class Calculadora {
    /**
     * public
     * private
     * protected
     * internal
     */

    protected var resultado: BigDecimal = BigDecimal.ZERO

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
        resultado /= resultado.divide(a,8,RoundingMode.HALF_UP)
        getResultado()
    }

    protected fun getResultado() {
        println("O resultado é: $resultado")
        //return resultado
    }

}