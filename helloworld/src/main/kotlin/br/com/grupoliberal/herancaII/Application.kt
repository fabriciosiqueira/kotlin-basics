package br.com.grupoliberal.herancaII


import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args:Array<String>) {
            val pessoa = Pessoa("98092030200", "Fabricio", LocalDate.of(1989,11,9))
            pessoa.falar("Ola Mundo do kotlin")
            pessoa.adotar(Gato())
            pessoa.adotar(Cachorro())
            pessoa.adotar(Peixe())
            for(animal in pessoa.animaisAdotados) {
                //validacao com is
//                when {
//                    animal is Cachorro -> animal.latir()
//                    animal is Gato -> animal.miar()
//                    animal is Peixe -> animal.glub()
//                    animal is Mamifero -> println("É um mamifero")
//                }

                //validacao com as e ?, caso haja uma duvida se usa ? ou podendo ser null
                (animal as? Gato)?.miar()
                (animal as? Cachorro)?.latir()
                (animal as? Peixe)?.glub()
            }
        }
    }
}