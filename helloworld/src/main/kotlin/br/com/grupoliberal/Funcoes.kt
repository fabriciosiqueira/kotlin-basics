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

    val precoDosProdutos2 = arrayOf(
        BigDecimal("1.99"),
        BigDecimal("1.99"),
        BigDecimal("2.99"),
        BigDecimal("7.99"),
        BigDecimal("10.99"),
        BigDecimal("0.50"),
        BigDecimal("3.99")
    )

    val precoDosProdutos3 = arrayOf(
        BigDecimal("1.99"),
        BigDecimal("1.99"),
        BigDecimal("2.99"),
        BigDecimal("7.99"),
        BigDecimal("10.99"),
        BigDecimal("0.50"),
        BigDecimal("3.99")
    )
    var precoTotalProdutos = somarProdutos(precoDosProdutos)
    println("Preco total: ${precoTotalProdutos}")
    var precoTotalProdutos2 = somarProdutos(precoDosProdutos2)
    println("Preco total2: ${precoTotalProdutos2}")
    var precoTotalProdutos3 = somarProdutos(precoDosProdutos3)
    println("Preco total3: ${precoTotalProdutos3}")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun somarProdutos(produtos: Array<BigDecimal>):BigDecimal {
    var precoTotal = BigDecimal.ZERO

    for(preco in produtos) {
        precoTotal += preco
    }

    return precoTotal
}

