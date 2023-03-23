package br.com.grupoliberal

import java.math.BigDecimal

fun main(args: Array<String>) {
    
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"),
        BigDecimal("1.99"),
        BigDecimal("2.99"),
        BigDecimal("7.99"),
        BigDecimal("10.99"),
        BigDecimal("0.50"),
        BigDecimal("3.99")
    )
    var precoTotal = BigDecimal.ZERO

    //interacao com array
    /**
     * for
     * while
     * doWhile
     */
    //for
    for(preco in precoDosProdutos) {
        precoTotal += preco
        println("Preco total: ${precoTotal}")
    }
    println("Usando for")
    println("Preco total: ${precoTotal}")

    //While
    var contador = 0
    precoTotal = BigDecimal.ZERO
    while(contador < precoDosProdutos.size) {
        precoTotal += precoDosProdutos[contador]
        contador += 1
        println("Preco total: ${precoTotal}")
    }

    println("Usando while")
    println("Preco total: ${precoTotal}")

    //doWhile
    contador = 0
    precoTotal = BigDecimal.ZERO
    do {
        precoTotal += precoDosProdutos[contador]
        contador += 1
        println("Preco total: ${precoTotal}")
    } while (contador < precoDosProdutos.size)
    println("Usando doWhile")
    println("Preco total: ${precoTotal}")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}