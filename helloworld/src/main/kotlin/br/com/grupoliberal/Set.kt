package br.com.grupoliberal

import java.math.BigDecimal

fun main(args: Array<String>) {
    val hashSet = hashSetOf<Int>(1,2,3,4)
    val sortedSet = sortedSetOf<Int>(1,2,3,4)
    val linkedSet = linkedSetOf<Int>(1,2,3,4)
    val mutableList = mutableListOf<Int>(1,2,3,4)
    //comportamento
    hashSet.add(5)//elemento nao existe
    printElements(hashSet)
    sortedSet.add(5)//elemento nao existe
    printElements(sortedSet)
    linkedSet.add(5)//elemento nao existe
    printElements(linkedSet)

    mutableList.add(5)
    printElements(mutableList)


    //teste de perfomace
    val hashSet2 = hashSetOf<Int>(1,2,3,4)
    val sortedSet2 = sortedSetOf<Int>(1,2,3,4)
    val set2 = linkedSetOf<Int>(1,2,3,4)













    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun printElements(set:Set<Int>) {
    println(set.joinToString(", "))
}

