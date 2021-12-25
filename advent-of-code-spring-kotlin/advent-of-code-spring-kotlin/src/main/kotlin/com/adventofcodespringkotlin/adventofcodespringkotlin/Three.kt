package com.adventofcodespringkotlin.adventofcodespringkotlin

import java.io.File

class Three {

    fun ListMaker(input: String): List<String> {
        val inputFile = input
        val lines: List<String> = File(inputFile).readLines()
        //lines.forEach {line -> println(line) }
        return lines
    }

    fun binaryDecoder(input: String): Int {
        //var binaryNum = input.toLong() not needed anymore
        return input.toInt(2)
    }

    fun gammaDecoder(input: List<String>): String {
        var strLength = 11
        var numZeros_last = 0
        var numOnes_last = 0
        var numZeros = 0
        var numOnes = 0
        var temp: String
        var final = "" // defaulting to 0
        var j = 0
        for (i in 0..strLength) { // this is the length of each string
            for (x in input) {
                temp = x.get(i).toString() // gets the number for each column
                if (temp.equals("0")) {
                    ++numZeros
                }
                else {
                    ++numOnes
                }
                if (i > j) {
                    //println("new column")
                    // determine most then add to string
                    if (numOnes > numZeros) {
                        final += "1"
                    }
                    else {
                        final += "0"
                    }
                    // reset numZeros and numOnes
                    numZeros = 0
                    numOnes = 0
                    ++j
                }

                if (i == strLength) {
                    if (temp.equals("0")) {
                        ++numZeros_last
                    }
                    else {
                        ++numOnes_last
                    }
                }

            }
        }
        // for the very last column otherwise missed
        if (numOnes_last > numZeros_last) {
            final += "1"
        }
        else {
            final += "0"
        }
        return final
    }

    fun epsilonDecoder(input: String): String {
        val strList:  MutableList<Char> = mutableListOf<Char>()
        for (x in input) {
            strList.add(x)
        }
        for (i in strList.indices) {
            if (strList[i].equals('0')) {
                strList[i] = '1'
            }
            else {
                strList[i] = '0'
            }
        }

        return String(strList.toCharArray())
    }

    fun powerConsumption(input: List<String>): Int {
        var gammaBinary = gammaDecoder(input)
        var epsilonBinary = epsilonDecoder(gammaBinary)
        var gammaInt = binaryDecoder(gammaBinary)
        var epsilonInt = binaryDecoder(epsilonBinary)

        return gammaInt * epsilonInt
    }



}



// the plan: look at first index, see if it is 0 or 1 and add to a running total