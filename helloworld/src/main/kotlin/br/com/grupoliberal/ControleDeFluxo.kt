package br.com.grupoliberal

fun main(args: Array<String>) {
    
    //if
    val tipoDeRota = "A_PE" // A_PE  CARRO ONIBUS E TREM
    if(tipoDeRota == "TREM") {
        println("tracando rota a pe")
    } else {
        if(tipoDeRota == "CARRO") {
            println("tracando rota a carro")
        } else {
            if(tipoDeRota == "ONIBUS") {
                println("tracando rota a onibus")
            } else {
                println("tracando rota a trem")
            }
        }
    }

    //when





    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}