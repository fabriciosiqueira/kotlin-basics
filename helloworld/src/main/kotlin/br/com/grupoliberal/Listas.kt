package br.com.grupoliberal

import java.math.BigDecimal

fun main(args: Array<String>) {
    //manipulando  listas
    var array = arrayOf(
        1,2,3,4,5,6
    )

    array[1] = 9
    println(array[1])

    //array[6]
    array += arrayOf(7)
    println(array[6])

    var lista = listOf(
        9,8,7,4,5,6
    )
    lista += listOf(7)
    println(lista[6])

    var arrayList = arrayListOf(
        1,2,3,4,5,6,7,8,9
    )

    var mutableListOf = mutableListOf(
        1,2,3,4,5,6,7,8,9
    )
    mutableListOf.add(10)
    println(mutableListOf[9])

    mostrarElementos(mutableListOf)
    mostrarElementos(lista)



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun mostrarElementos(lista:List<Int>) {
    lista.forEachIndexed{index, i ->
        println("index: $index, valor: $i")
    }
}

