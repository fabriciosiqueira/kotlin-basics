package br.com.grupoliberal.herancaII

import java.time.LocalDate

class Pessoa(
    val cpf:String,
    val nome:String,
    val dtNascimento: LocalDate
) {
    val animaisAdotados = mutableListOf<Animal>()
    val idade = LocalDate.now().year - dtNascimento.year
    var email = ""
        set(value) {
            if(!Regex("^[\\w-.]+([\\w-]+\\.)+[\\w-]{2,4}\$").matches(value)){
                throw Exception("Opps! Email invalido.")
            }
            field = value
        }


    fun falar(msg:String){
        println("$nome falou: $msg")
    }
    fun adotar(animal:Animal){
        animaisAdotados.add(animal)
    }
}