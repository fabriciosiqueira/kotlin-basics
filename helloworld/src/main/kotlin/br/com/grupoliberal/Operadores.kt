package br.com.grupoliberal

fun main(args: Array<String>) {
    //Sinal de Atribuicao (=)
    val inteiro = 1
    val helloWorld = "Ola, mundo"

    /*
    * Operadores com Stirng
    *  + -> Concatenar
    * */
    val msg = "passando chave sifrao"
    println("ola " + "mundo")
    println("outra forma de concatenacao é ${msg}")

    /*
    * Operadores Numericos
    * + -> soma
    * - -> subtracao
    * * -> multiplicacao
    * / -> Divisao
    * % -> Divisao inexata(pegando o resto)
    * */
    println("33 + 47 = ${33+47}")
    println("33 - 47 = ${33-47}")
    println("3 * 4 = ${3*4}")
    println("10 / 3 = ${10.0 / 3.0}")
    println("10.0 / 3.0 = ${10.0 / 3.0}")
    println("10 % 3 = ${10 % 3}")









    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}