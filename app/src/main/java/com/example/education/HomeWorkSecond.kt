package com.example.education

fun main() {

    var arrayOfNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)

//
//    println(someFunction())
//    someTestPrintFunction()
//    println(sumFunction(10,101))
//    println(sumFubctionSimple(1, 9, 10))
//    println(testDefaultWorflow(4, 4, 5))
//    println(testNamedFunction(b = 10, a = 2))
//    println(testVariousNumbers(1,2,3,4,5,6,7,8,9,10,22))
//    println(testVariousNumbers(*arrayOfNumbers))
//    testWhen("курсы")
}

fun someFunction(): Int {
    return 10
}

fun someTestPrintFunction() {
    println("Hi")
}

fun sumFunction(a: Int, b: Int): Int {
    return a + b;
}

fun sumFubctionSimple(a: Int, b: Int, c: Int): Int = a + b + c

fun testDefaultWorflow(a: Int = 0, b: Int = 0, c: Int = 0): Int {
    return a + b + c
}

fun testNamedFunction(a: Int = 1, b: Int = 2, c: Int = 3): Int {
    return a * b * c
}

fun testVariousNumbers(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) print("$e ") }  // for (number in numbers}
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 3..10 -> println("In range")
        is String -> println("This string length ${input.length}")
        else -> println("Some another type")
    }
}

fun square(
    type: String,
    firstSide: Int = 0,
    secondSide: Int = 0,
    thirdSide: Int = 0,
    radios: Int = 0
): Double {
    var result: Double = 0.0

    when {

        ((Regex(".?прямоугольник.?").containsMatchIn(type)) &&
                firstSide > 0 && secondSide > 0) -> {
            result = (firstSide * secondSide).toDouble()
        }

        ((Regex(".?окружность.?").containsMatchIn(type) ||
                Regex(".?круг.?").containsMatchIn(type)) &&
                radios != 0
                ) -> {
            result = 3.14 * radios * radios
        }

        (Regex(".?параллеллограмм.?").containsMatchIn(type) &&
                firstSide > 0 && secondSide > 0) -> {
            result = (firstSide * secondSide).toDouble()
        }

        (Regex(".?треугольник.?").containsMatchIn(type) &&
                firstSide > 0 && secondSide > 0 && thirdSide > 0) -> {
            var P: Double = ((firstSide + secondSide + thirdSide) / 2).toDouble()
            result = Math.sqrt(P * (P - firstSide) * (P - secondSide) * (P - thirdSide))
        }
        else -> {
            println("Не корректный тип фигуры, попробуйте снова")
        }
    }
    return result
}