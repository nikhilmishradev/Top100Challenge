package com.androidtechguru.top100challenge.convertfun main() {    val number = 99999    val words = NumberIntoWords().convert(number)    println(words)}class NumberIntoWords {        fun convert(num: Int): String {        if (num == 0) return "Zero"                val parts = mutableListOf<String>()        var currentNumber = num        var scaleIndex = 0                while (currentNumber > 0) {            println("$currentNumber")            val part = currentNumber % 1000            if (part > 0) {                val partInWords = belowThousand(part)                parts.add(0, partInWords + if (scaleIndex > 0) " " + scales[scaleIndex] else "")            }            currentNumber /= 1000            scaleIndex++        }        println("$num")        return parts.joinToString(" ").trim()    }        private fun belowHundred(n: Int): String {        return when {            n < 10 -> {                units[n]            }                        n < 20 -> {                teens[n - 10]            }                        else -> {                tens[n / 10] + if (n % 10 > 0) " " + units[n % 10] else ""            }        }    }        private fun belowThousand(n: Int): String {        return if (n < 100) {            belowHundred(n)        } else {            units[n / 100] + " $hundred" + if (n % 100 > 0) " and " + belowHundred(n % 100) else ""        }    }        val units =        arrayOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")    val teens = arrayOf("Ten",        "Eleven",        "Twelve",        "Thirteen",        "Fourteen",        "Fifteen",        "Sixteen",        "Seventeen",        "Eighteen",        "Nineteen")    val tens = arrayOf("",        "",        "Twenty",        "Thirty",        "Forty",        "Fifty",        "Sixty",        "Seventy",        "Eighty",        "Ninety")    val hundred = "Hundred"    val scales = arrayOf("", "Thousand", "Lakh")}