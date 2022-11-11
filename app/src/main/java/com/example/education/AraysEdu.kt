package com.example.education

fun main() {

    var arrOfStringsToStudy:Array<String> = arrayOf("apple", "banana", "orange")
    var length:Int = 5
    var listOfStudents:List<String> = listOf("Евгенй", "Игорь", "Валерий")
    var index:Int = 0
    var listOfNewStudents:MutableList<String> = mutableListOf("Кирил", "Лолита", "Дмитрий")
    var sliceOflist = listOfNewStudents.slice(1..2)
    var sublistOfStudents = listOfNewStudents.subList(1,3)

    println(sliceOflist)
    println(sublistOfStudents)

    listOfNewStudents.add(3,"Надежда")
    println(listOfNewStudents)

    listOfNewStudents[2] = "Андрей"

    println(sliceOflist)

    for (student in listOfStudents) {
        println("студент с индексом $index зовут $student")
        index++
    }

    println("Проверка наличия апелсина в массиве. " +
            "${
                if("Orange".lowercase()in arrOfStringsToStudy) 
                "Да, апелсины есь"
            else "Апельсина нет"}")


    var stringFroWhen = when(length){
        7 -> "Семь"
        in 2..10 -> "в диапазоне"
        else -> "Нет значения"
    }

    println(stringFroWhen)

    do {
        length += 4
        println("Значение длины сечас $length")
    } while (length < 20)
}