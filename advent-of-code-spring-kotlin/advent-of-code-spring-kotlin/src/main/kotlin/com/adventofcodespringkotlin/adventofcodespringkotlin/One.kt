package com.adventofcodespringkotlin.adventofcodespringkotlin

import java.io.File

public class One {

    fun sum(input: List<Int>): Int {
        return input.sum()
    }

    fun BiggerVal(input: List<Int>): Int {
        var prev = 0;
        var count = 0;
        for (i in input.indices) {
            if (i == 0) {
                //prev = input[i]
                continue
            }
            if (input[i] > prev) {
                ++count
            }
            prev = input[i]
        }
        return count;
    }


    fun ListMaker(input: String): List<Int> {
        val inputFile = input
        val lines: List<String> = File(inputFile).readLines()
        val myParsedList = lines.map {value -> value.toInt()}
        //for (number in myParsedList) println(number+1)
        //lines.forEach {line -> println(line) }
        return myParsedList
    }

    fun BiggerVal_Categories(input: List<Int>): Int {
        var sum1 = 0
        var sum2 = 0
        var count = 0

        for (i in input.indices) {
            if (i > (input.size - 4)) {
                break
            }
            var sum1List = listOf(input[i], input[i+1], input[i+2])
            var sum2List = listOf(input[i+1], input[i+2], input[i+3])
            sum1 = sum(sum1List)
            sum2 = sum(sum2List)
            if (sum2 > sum1) {
                ++count
            }
        }
        return count
    }

}