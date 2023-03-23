package br.com.grupoliberal

fun main(args: Array<String>) {
    
    //if
    val tipoDeRota = "adsadad" // A_PE  CARRO ONIBUS E TREM
    //nao é recomendado fazer if encadeados
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
    when(tipoDeRota) {
        "A_PE" -> {
            println("tracando rota a pe")
        }
        "CARRO" -> {
            println("tracando rota a carro")
        }
        "ONIBUS" -> {
            println("tracando rota a onibus")
        }
        "TREM" -> {
            println("tracando rota a trem")
        }
        else -> {
            println("rota nao implementada")
        }
    }





    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}