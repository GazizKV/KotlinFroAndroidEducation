package com.example.education

fun main() {
    var kotlinClassConstructor = KotlinClassesAndModifires(3)
}

class KotlinClassesAndModifires private constructor(){
    init {
        println("Init block")
    }

    constructor(i:Int) : this() {
        println("Constructor $i")
    }

    init {
        println("Init after block")
    }

}