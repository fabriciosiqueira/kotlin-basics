package br.com.grupoliberal.polimorfismo

class Peixe:Animal() {
    fun glub(){
        println("GlubGlub")
    }

    override fun comunicar() {
        glub()
    }
}