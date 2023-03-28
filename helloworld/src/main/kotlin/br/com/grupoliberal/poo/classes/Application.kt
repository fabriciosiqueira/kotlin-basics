package br.com.grupoliberal.poo.classes

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args:Array<String>) {
            val pessoa = Pessoa("98092030200", "Fabricio", LocalDate.of(1989,11,9))
            pessoa.falar("Ola Mundo do kotlin")
        }
    }
}