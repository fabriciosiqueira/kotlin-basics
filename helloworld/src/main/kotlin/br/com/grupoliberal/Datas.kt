package br.com.grupoliberal

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

fun main(args: Array<String>) {
    //Conhecendo os tipos datas no kotlin
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()


    //Como parsear de string para data?
    var yesterday = localDate.from(DateTimeFormatter.ofPattern("dd//MM/yyyy").parse("20/11/2021"))
    var yesterdayTime = localDateTime.from(DateTimeFormatter.ofPattern("dd//MM/yyyy HH:mm").parse("20/11/2021 04:00"))
    var simpleDateFormat = SimpleDateFormat("ddMMyyyy")
    var simpleDateFormat2 = SimpleDateFormat("yyyyMMdd")
    var yesterdayDayDate = SimpleDateFormat("20/11/2021")

    println(yesterday)
    println(yesterdayTime)
    println(yesterdayDayDate)



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}



