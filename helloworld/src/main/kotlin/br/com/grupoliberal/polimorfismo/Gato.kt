package br.com.grupoliberal.polimorfismo

class Gato:Mamifero() {
    fun miar(){
        println("MiauMiau")
    }

    override fun comunicar() {
        miar()
    }
}