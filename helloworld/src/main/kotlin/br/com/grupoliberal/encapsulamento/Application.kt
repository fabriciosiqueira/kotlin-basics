package br.com.grupoliberal.encapsulamento

import java.math.BigDecimal

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal("7"))//7
            calculadora.subtrair(BigDecimal("3"))//4
            calculadora.multiplicar(BigDecimal("3"))//12
            calculadora.dividir(BigDecimal("2"))//6

        }
    }
}