package com.adventofcodespringkotlin.adventofcodespringkotlin

class Three {

    fun binaryDecoder(input: List<String>): Int {

        for (x in input) {
            // index through a string
            println(x)
        }
        return 0
    }

    fun gammaDecoder(input: List<String>): String {
        var index1_ones = 0
        var index1_twos = 0
        var temp: String
        for (x in input) {
            temp = x.get(0).toString()
            println(temp)

        }

        return "null"
    }
}



// the plan: look at first index, see if it is 0 or 1 and add to a running total