package com.example.education

/*
* Лекция по циклам и условиям
* 11 ноября 2002 года
* */

fun main() {

    val width:Int = 4
    val length:Int = 8
    var perimeter = (width + length) * 2 // Периметрп по заданным параметрам
    val conditionToCheck:Boolean = true  // true or false

    if (length/width == 2) {        // Знак = это присвоение, а дава знака равно == это сравнение.
        println("Да все верно")
    } else {
        println("Упс, это не двойка")
    }

    if (length/width != 2) {// != занк не равенства
        println("Да все версно")
    } else {
        println("Упс, это же двойка")
    }

    if ((length/width == 2) && conditionToCheck) {
        println("Да, все верно")
    } else {
        println("Упс, это же двойка")
    }

    var ostatok = length+1 % width
    println("Остаток при делении у нас $ostatok")

    if (width % 2 == 0){
        println("число четное")
    } else {
        println("не четное число")
    }

    val a1:Double = 4.1
    val a2:Double = 2.0

    println("Результат деления a1 на a2 ${a1/a2}")


    println(8 in 5..10) // проверка вхождения в диапазон

    println('c' in 'a'..'z')

    for(number in 1..10) {
        print(number)
    }
    println()

    for (number in 10..0) {
        print(number)
    }
    println()
    for (number in 0 until 10) {
        print(number)
    }

    println()

    for (number in 10 downTo 0) {
        print("$number ")
    }
    println()

    for (number in 0 .. 20 step 4) {
        print("$number ")
    }

    println()

    for (number in 20 downTo 0 step 4) {
        print("$number ")
    }

    println()

    var iterator:Int = 0;

    while (iterator < 10) {
        println("value = $iterator")
        iterator++;
    }

    var someLabelToCheck:String = "Содействие"

    when (someLabelToCheck[0]) {
        'С' -> println("Да это буква С")
        'д' -> println("Это буква д")
        else -> println("Таких символов нет")
    }

    when (length) {
        7 -> println("Длина у нас $length")
        in 9..10 -> println("Длина у нас в диапазоне от 1 до 10")
        else -> println("Не выполняется условие")
    } // TODO проверить значения


}