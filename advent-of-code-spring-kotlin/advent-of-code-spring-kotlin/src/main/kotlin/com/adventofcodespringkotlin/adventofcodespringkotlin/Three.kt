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
                temp = x.get(i).toString() // gets the bit for each column
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

        return String(strList.toCharArray()) // converting a list to a string
    }

    fun powerConsumption(input: List<String>): Int {
        var gammaBinary = gammaDecoder(input)
        var epsilonBinary = epsilonDecoder(gammaBinary)
        var gammaInt = binaryDecoder(gammaBinary)
        var epsilonInt = binaryDecoder(epsilonBinary)

        return gammaInt * epsilonInt
    }

// to find oxygen generator rating: look at first column of bits,
// and find the most common value, kind of like what we did before
// now remove any sets of bits that don't have that common value in
// the given position.  rinse and repeat on each column until only one left
// also if equal just pretend that 1 is the most common

    fun oxygenRating(input: List<String>, strLength: Int): String {
        val strList = input.toMutableList()
        var numZeros_last = 0
        var numOnes_last = 0
        var numZeros = 0
        var numOnes = 0
        var temp: String
        var j = 0
        for (i in 0..strLength) { // this is the length of each string
            // short circuiting if done
            if (strList.size < 2) {
                return strList.joinToString() // optional separator could be used here for future reference
            }
            for (x in strList.reversed()) {
                temp = x.get(i).toString() // gets the bit for each column
                if (temp.equals("0")) {
                    ++numZeros
                }
                else {
                    ++numOnes
                }
                if (i > j) {
                    // determine most common
                    if (numOnes >= numZeros) {
                        // checking every string at only the current index
                        // then deleting from the list as needed
                        for (c in strList.indices.reversed()) {
                            temp = strList[c].get(j).toString()
                            if (temp.equals("0")) {
                                strList.removeAt(c)
                            }
                        }
                    }
                    else {
                        for (c in strList.indices.reversed()) {
                            temp = strList[c].get(j).toString()  // was x.get
                            if (temp.equals("1")) {
                                strList.removeAt(c)
                                //println("removed")
                            }
                        }
                    }
                    // reset numZeros and numOnes
                    numZeros = 0
                    numOnes = 0
                    ++j
                }
                //return strList

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
        if (numOnes_last >= numZeros_last) {
            for (c in strList.indices.reversed()) {
                temp = strList[c].get(j).toString()  // was x.get
                if (temp.equals("0")) {
                    strList.removeAt(c)
                    //println("removed")
                }
            }
        }
        else {
            for (c in strList.indices.reversed()) {
                temp = strList[c].get(j).toString()  // was x.get
                if (temp.equals("1")) {
                    strList.removeAt(c)
                    //println("removed")
                }
            }
        }
        return strList.joinToString()
    }


    fun co2Rating(input: List<String>, strLength: Int): String {
        val strList = input.toMutableList()
        var numZeros_last = 0
        var numOnes_last = 0
        var numZeros = 0
        var numOnes = 0
        var temp: String
        var j = 0
        for (i in 0..strLength) { // this is the length of each string
            // short circuiting if done
            if (strList.size < 2) {
                return strList.joinToString()
            }
            for (x in strList.reversed()) {  // reversed did not work so well
                temp = x.get(i).toString() // gets the bit for each column
                if (temp.equals("0")) {
                    ++numZeros
                }
                else {
                    ++numOnes
                }
                if (i > j) {
                    // determine most common
                    if (numZeros > numOnes) {
                        // checking every string at only the current index
                        // then deleting from the list as needed
                        for (x in strList.reversed()) {
                            temp = x.get(j).toString()
                            if (temp.equals("0")) {
                                if (strList.size < 2) {  // hotfix
                                    return strList.joinToString()
                                }
                                strList.remove(x)
                                //return(strList)
                            }
                        }
                    }
                    else {
                        for (x in strList.reversed()) {
                            temp = x.get(j).toString()
                            if (temp.equals("1")) {
                                if (strList.size < 2) {  // hotfix
                                    return strList.joinToString()
                                }
                                strList.remove(x)
                            }
                        }
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
        if (numZeros_last > numOnes_last) {
            for (x in strList.reversed()) {
                temp = x.get(j).toString()  // was x.get
                if (temp.equals("0")) {
                    if (strList.size < 2) {  // hotfix
                        return strList.joinToString()
                    }
                    strList.remove(x)
                    //println("removed")
                }
            }
        }
        else {
            for (x in strList.reversed()) {
                temp = x.get(j).toString()  // was x.get
                if (temp.equals("1")) {
                    if (strList.size < 2) {  // hotfix
                        return strList.joinToString()
                    }
                    strList.remove(x)
                    //println("removed")
                }
            }
        }
        return strList.joinToString()
    }

    fun lifeSupportRating(input: List<String>, strLength: Int): Int {
        var oxygenRating = binaryDecoder(oxygenRating(input, strLength))
        var co2Rating = binaryDecoder(co2Rating(input, strLength))

        return oxygenRating * co2Rating
    }




    fun betteroxygenRating(input: List<String>, strLength: Int, i: Int): String {
        val strList = input.toMutableList()
        var temp: String
        var numZeros = 0
        var numOnes = 0
        /*if (Iterator > strLength) {
            return strList
        }*/
        for (x in strList) {
            temp = x.get(i).toString()
            if (temp.equals("0")) {
                ++numZeros
            }
            else {
                ++numOnes
            }
        }

        if (numOnes >= numZeros) {
            for (x in strList.reversed()) {
                temp = x.get(i).toString()
                if (temp.equals("0")) {
                    strList.remove(x)
                }
            }
        }
        else {
            for (x in strList.reversed()) {
                temp = x.get(i).toString()
                if (temp.equals("1")) {
                    strList.remove(x)
                }
            }
        }
        //println(strList)
        if (strList.size < 2) {
            //println(strList)
            return strList.joinToString()
        }
        /*else {
            betteroxygenRating(strList, strLength, i + 1)
        }*/
        return betteroxygenRating(strList, strLength, i + 1)
    }

    fun betterco2Rating(input: List<String>, strLength: Int, i: Int): String {
        val strList = input.toMutableList()
        var temp: String
        var numZeros = 0
        var numOnes = 0
        /*if (i > strLength) {
            return strList.joinToString()
        }*/
        for (x in strList) {
            temp = x.get(i).toString()
            if (temp.equals("0")) {
                ++numZeros
            }
            else {
                ++numOnes
            }
        }

        if (numZeros <= numOnes) {
            for (x in strList.reversed()) {
                temp = x.get(i).toString()
                if (temp.equals("1")) {
                    strList.remove(x)
                }
            }
        }
        else {
            for (x in strList.reversed()) {
                temp = x.get(i).toString()
                if (temp.equals("0")) {
                    strList.remove(x)
                }
            }
        }
        //println(strList)
        if (strList.size < 2) {
            println(strList)
            return strList.joinToString()
        }

        return betterco2Rating(strList, strLength, i + 1)
    }

    fun betterlifeSupportRating(input: List<String>, strLength: Int): Int {
        var oxygenRating = binaryDecoder(betteroxygenRating(input, strLength, 0))
        var co2Rating = binaryDecoder(betterco2Rating(input, strLength, 0))

        return oxygenRating * co2Rating
    }

}


// ok ok new plan it turns out removing elements from an array while iterating is bad
// so instead we find the most common for a specific index, starting with the very first
// then we of course remove accordingly
// THEN instead of trying to do it again in the same function, we call ANOTHER function whose only job
// is to give me a new iterator, and we of course just run our own function again. ez clap


