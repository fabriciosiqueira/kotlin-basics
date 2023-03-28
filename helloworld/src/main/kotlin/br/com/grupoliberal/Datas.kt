package br.com.grupoliberal

import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.Calendar
import java.util.Date

fun main(args: Array<String>) {
    //Conhecendo os tipos datas no kotlin
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

    //Como parsear de string para data
    var yesterday = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("20/11/2021"))
    var yesterdayTime = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("20/11/2021 04:00"))
    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
    var yesterdayDayDate = simpleDateFormat.parse("20/11/2021")

    println(yesterday)//2021-11-20
    println(yesterdayTime)//2021-11-20T04:00
    println(yesterdayDayDate)//Sat Nov 20 00:00:00 BRT 2021


    println(DateTimeFormatter.ofPattern("yyyyMMdd").format(yesterday))//20211120
    println(DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(yesterdayTime))//202111200400
    println(yesterdayDayDate)//Sat Nov 20 00:00:00 BRT 2021


    //Fazendo operacoes com datas
    //Somar Data e Subtrair Data
    println("Somar Data e Subtrair Data")
    yesterday = yesterday.plusDays(7)
    yesterdayTime = yesterdayTime.plusDays(3)
    println(yesterday)
    println(yesterdayTime)
    yesterdayDayDate = Date(yesterdayDayDate.toInstant().plus(7, ChronoUnit.DAYS).toEpochMilli())
    println(yesterdayDayDate)



    //Comparacao de datas
    println("Comparacao de datas")
    println(yesterday.isAfter(yesterdayTime.toLocalDate()))
    println(yesterdayTime.isAfter(yesterday.atStartOfDay()))
    println(date.after(yesterdayDayDate))





    //Comparacao dia da semana
    println("Comparacao dia da semana")
    while(yesterday.dayOfWeek == DayOfWeek.SUNDAY || yesterday.dayOfWeek == DayOfWeek.SATURDAY) {
        yesterday = yesterday.plusDays(1)
        println(yesterday)
    }

    var calendar = Calendar.getInstance()
    calendar.time = yesterdayDayDate
    while(calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7) {
        yesterdayDayDate = Date(yesterdayDayDate.toInstant().plus(1, ChronoUnit.DAYS).toEpochMilli())
        calendar.time = yesterdayDayDate

    }
    println(yesterdayDayDate)
}



