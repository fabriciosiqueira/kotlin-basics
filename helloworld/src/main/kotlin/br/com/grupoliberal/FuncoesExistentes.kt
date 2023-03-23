package br.com.grupoliberal

import java.math.BigDecimal

fun main(args: Array<String>) {
    //String
    val nome = "Fulano"
    val tamanhoNome = nome.count()
    println("tamanho: ${tamanhoNome}")
    val splitNome = nome.split("")
    println("splitNome: ${splitNome}")
    val dropLastname = nome.dropLast(4)
    println("dropLastname: ${dropLastname}")
    val dropFirstname = nome.drop(4)
    println("dropFirstname: ${dropFirstname}")
    val containsNome = nome.contains("d")
    println("containsNome: ${containsNome}")

    //Array e mais interacoes
    val array = arrayOf(0,1,2,3,4,5,6,7,8,9)
    val sumOfArray = array.sumOf{it}
    println("sumOfArray: ${sumOfArray}")
    val reversedArray = array.reversedArray()
    println("reversedArray: ${arrayToString(reversedArray)}")
    val sortArray = array.sortedArray()
    println("reversedArray: ${arrayToString(sortArray)}")


    //BigDecimal
    val bigDecimal = BigDecimal("2")
    val powBigDecimal = bigDecimal.pow(3)
    println("bigDecimal: ${bigDecimal}")
    println("powBigDecimal: ${powBigDecimal}")




    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun arrayToString(array: Array<Int>) = array.fold("") {acc, i -> "$acc $i"}



