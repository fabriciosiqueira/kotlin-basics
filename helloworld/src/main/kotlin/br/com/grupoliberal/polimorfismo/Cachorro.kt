package br.com.grupoliberal.polimorfismo

class Cachorro:Mamifero() {
    fun latir(){
        println("AuAu")
    }

    override fun comunicar() {
        latir()
    }
}