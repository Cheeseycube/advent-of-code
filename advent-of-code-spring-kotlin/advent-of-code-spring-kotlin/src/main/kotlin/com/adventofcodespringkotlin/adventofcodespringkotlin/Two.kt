package com.adventofcodespringkotlin.adventofcodespringkotlin

import java.io.File

class Two {

    fun pilot_submarine(input: List<String>): Int {
        var extractedNum: Int
        var horiz_pos = 0
        var depth = 0
        for (x in input) {
            extractedNum = x.filter { it.isDigit() }.toInt()
            //println(extractedNum)
            if (x.contains("forward")) {
                horiz_pos += extractedNum
            }
            if (x.contains("down")) {
                depth += extractedNum
            }
            if (x.contains("up")) {
                depth -= extractedNum
            }
        }
        // returns final horizontal position times final depth
        return horiz_pos * depth
    }

    fun pilot_submarine_aim(input: List<String>): Int {
        var extractedNum: Int
        var horiz_pos = 0
        var depth = 0
        var aim = 0
        for (x in input) {
            extractedNum = x.filter { it.isDigit() }.toInt()
            //println(extractedNum)
            if (x.contains("forward")) {
                horiz_pos += extractedNum
                depth += (aim * extractedNum)
            }
            if (x.contains("down")) {
                aim += extractedNum
            }
            if (x.contains("up")) {
                aim -= extractedNum
            }
        }
        // returns final horizontal position times final depth
        return horiz_pos * depth
    }

    fun ListMaker(input: String): List<String> {
        val inputFile = input
        val lines: List<String> = File(inputFile).readLines()
        //lines.forEach {line -> println(line) }
        return lines
    }
}