package com.adventofcodespringkotlin.adventofcodespringkotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ThreeTest {

    val three: Three = Three()

    @Test
    fun binaryDecoderTest() {
        val  input = "01001"
        val expected = 9
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
        val expected = "10110"// 10110 is correct or 22
        val actual = three.gammaDecoder(input)
        assertEquals(expected, actual)
    }

    @Test
    fun epsilonDecoderTest() {
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
        val expected = "0110"// 01001 is correct or 9
        val actual = three.epsilonDecoder("1001")
        assertEquals(expected, actual)
    }

    @Test
    fun powerConsumption() {
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
        val expected = 198
        val actual = three.powerConsumption(input)
        assertEquals(expected, actual)
    }

    @Test
    fun listMakerTest() {
        val input = "C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3"
        val expected = listOf("11001", "00010")
        val actual = three.ListMaker(input)
        assertEquals(expected, actual)
        // this is expected to fail
    }

    /*@Test
    fun gammaDecoderTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        val expected = "10110"// 10110 is correct or 22
        val actual = three.gammaDecoder(input)
        assertEquals(expected, actual)
    }*/

    @Test
    fun powerConsumptionTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        /*val  input:  List<String> = listOf("00100",
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
            "01010",)*/
        val expected = 1131506 // my answer, 1131506
        val actual = three.powerConsumption(input)
        assertEquals(expected, actual)
    }
}