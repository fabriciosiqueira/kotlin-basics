package br.com.grupoliberal

import java.math.BigDecimal

fun main(args: Array<String>) {

    // Byte, Short, Int, Long
    val byte: Byte = 127;
    val short: Short = 32767;
    val int: Int = 2147483647;
    val long: Long = 9223372036854775807;

    // Float e Double
    //voltada a precisao numerica
    val float: Float = 1.38423f
    val double: Double = 1.38423
    val bigDecimal: BigDecimal = BigDecimal("1.38423")

    //Boolean
    val boolean: Boolean = false
    val boolean2: Boolean = true

    //String
    val char: String = "F"


    //Array
    val array: Array<Int> = arrayOf(0,2,4,6,8,10,12,14,16,18,20)

    println("Tipos Primitivos")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}