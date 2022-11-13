package com.example.education

fun main(){

    val someList: List<Int> = listOf(1,2,3,4,5,-10,-30,22)
    val someListToCompare: List<Int> = listOf(1,2,3,4)
    val someMutableListToTrain = mutableListOf<Int>(1,2,3,4,5,6,7,8)
    val someMap: Map<Int, String> = mapOf(1 to "John", 2 to "Doe", 3 to "Alice")

    for (key in someMap.keys) {
        print("начение ключа $key \t")
    }
    println("\n")
    for (value in someMap.values) {
        print("Pyfxtybt $value \t")
    }
    println("\n")

    println(someMap.filter { it.value.contains(regex = Regex("[a,b]", option = RegexOption.IGNORE_CASE)) })

    println("\n")
    someMutableListToTrain[2] = 2
    println(someList.intersect(someListToCompare))
    println(someList.sorted())
    println(someList.filter { it in 2..10 })
    println(someList.sortedDescending())

    var anotherList = someList.filter { it > 0 }
    println(anotherList.sorted())
    println(someMutableListToTrain.filter { it >= 2 })

    var someListString:List<String> = listOf("Banana", "Apple", "Orange")

    val (positive, negative) = someList.partition { it > 0 }
    println(negative)
    println(positive)

    val toGroupList = arrayOf("aa", "acd", "bbb","ef", "s")

    val groupedBy = toGroupList.groupBy { it.length>2 }

    println(groupedBy)

    println(groupedBy.get(false))
    println(groupedBy.get(true)?.get(1))

    alphabetRu()

}

fun alphabetRu() {
    val alphabet:String = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    for (letter in alphabet) {
        print("$letter ")
    }
}