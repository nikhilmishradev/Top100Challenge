package com.androidtechguru.top100challenge.convert

fun main() {
    val number = 129
    println("number: $number ---> binary: " + convertToBinaryCode(number))
    println("number: $number ---> Formated Binary Code: " + convertToBinary(number).formatBinaryCodes())
}

fun convertToBinaryCode(num: Int): String {
    if (num == 0) return "0" else if (num < 0) return ""

    var number = num
    val binaryString = StringBuilder()

    while (number > 0) {
        val remainder = number % 2
        binaryString.append(remainder)
        number /= 2
    }

    return binaryString.reverse().toString()
}

fun String.formatBinaryCodes(): String {
    val stringBuilder = StringBuilder()
    this.reversed().forEachIndexed { index, char ->
        stringBuilder.append(char)
        if ((index + 1) % 4 == 0) stringBuilder.append(' ')
    }
    return stringBuilder.reverse().toString()
}