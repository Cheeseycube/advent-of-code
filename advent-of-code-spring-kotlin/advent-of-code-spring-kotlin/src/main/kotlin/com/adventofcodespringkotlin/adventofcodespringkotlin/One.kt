package com.adventofcodespringkotlin.adventofcodespringkotlin

public class One {
    fun sum(input: List<Int>): Int {
        return input.sum()
    }

    fun BiggerVal(input: List<Int>): Int {
        var prev = null;
        var count = 0;
        for (x in input) {
            if (prev == null) {
                prev = x;
            }
            else if (x > prev) {
                ++count
                prev = x
            }
        }
        return count;
    }
}