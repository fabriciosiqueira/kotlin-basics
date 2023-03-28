package br.com.grupoliberal.poo.classes

import java.time.LocalDate

class Pessoa(
    val cpf:String,
    val nome:String,
    val dtNascimento:LocalDate
) {

    val idade = LocalDate.now().year - dtNascimento.year


    fun falar(msg:String){
        println("$nome falou: $msg")
    }
}