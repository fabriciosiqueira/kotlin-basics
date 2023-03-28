package br.com.grupoliberal.heranca

import br.com.grupoliberal.encapsulamento.Calculadora
import java.math.BigDecimal

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal("2"))//4
            //calculadora.potencia(8)

            val CalculadoraCientifica = CalculadoraCientifica()
            CalculadoraCientifica.somar(BigDecimal("2"))//4
            CalculadoraCientifica.potencia(8)//256

        }
    }
}