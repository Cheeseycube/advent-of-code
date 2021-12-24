package com.adventofcodespringkotlin.adventofcodespringkotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ThreeTest {

    val three: Three = Three()

    @Test
    fun binaryDecoderTest() {
        val  input:  List<String> = listOf("00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010")
        val expected = 0 // will be 198 later
        val actual = three.binaryDecoder(input)
        assertEquals(expected, actual)
    }

    @Test
    fun gammaDecoderTest() {
        val  input:  List<String> = listOf("00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010")
        val expected = "null" // will be 198 later
        val actual = three.gammaDecoder(input)
        assertEquals(expected, actual)
    }
}