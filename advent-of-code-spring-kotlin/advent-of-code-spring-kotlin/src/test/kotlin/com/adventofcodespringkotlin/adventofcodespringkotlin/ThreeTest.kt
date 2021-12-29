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

    @Test
    fun oxygenRatingTest() {
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
            "01010",)
        val expected = "10111"// 10111 is correct or 23
        val actual = three.oxygenRating(input, 4)
        assertEquals(expected, actual)
    }

    @Test
    fun oxygenRatingTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        val expected = "111101011111"// this might be wrong
        val actual = three.oxygenRating(input, 11)
        assertEquals(expected, actual)
    }

    @Test
    fun co2RatingTest() {
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
            "01010",)
        val expected = "01010"// 01010 is correct or 10
        val actual = three.co2Rating(input, 4)
        assertEquals(expected, actual)
    }

    @Test
    fun co2RatingTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        val expected = listOf("10111")// 10111 is correct or 23
        val actual = three.co2Rating(input, 11)
        assertEquals(expected, actual)
    }

    @Test
    fun lifeSupportRatingTest() {
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
        val expected = 230
        val actual = three.lifeSupportRating(input, 4)
        assertEquals(expected, actual)
    }

    @Test
    fun lifeSupportRatingTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        val expected = 236100// best guess so far is 236100 which is too low
        val actual = three.lifeSupportRating(input, 11)
        assertEquals(expected, actual)
    }

    @Test
    fun betteroxygenRatingTest() {
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
            "01010",)
        val expected = listOf("10111")// 10111 is correct or 23
        val actual = three.betteroxygenRating(input, 4, 0)
        assertEquals(expected, actual)
    }

    @Test
    fun betteroxygenRatingTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        val expected = listOf("111111111001")// 111111111001 different than other method
        val actual = three.betteroxygenRating(input, 11, 0)
        assertEquals(expected, actual)
    }

    @Test
    fun betterco2RatingTest() {
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
            "01010",)
        val expected = "01010"// 01010 is correct or 10
        val actual = three.betterco2Rating(input, 4, 0)
        assertEquals(expected, actual)
    }

    @Test
    fun betterco2RatingTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        val expected = "011110000011"// new answer 011110000011
        val actual = three.betterco2Rating(input, 11, 0)
        assertEquals(expected, actual)
    }

    @Test
    fun betterlifeSupportRatingTest() {
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
        val expected = 230
        val actual = three.betterlifeSupportRating(input, 4)
        assertEquals(expected, actual)
    }

    @Test
    fun betterlifeSupportRatingTestFinal() {
        val  input: List<String> = three.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input3")
        val expected = 7863147 // best guess so far is 236100 which is too low
        val actual = three.betterlifeSupportRating(input, 11)
        assertEquals(expected, actual)
    }
}

