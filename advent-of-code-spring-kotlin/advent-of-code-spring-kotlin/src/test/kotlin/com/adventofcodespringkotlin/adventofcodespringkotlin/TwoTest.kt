package com.adventofcodespringkotlin.adventofcodespringkotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TwoTest {

    val two: Two = Two()

    @Test
    fun pilot_submarineTest() {
        val input: List<String> = listOf("forward 5", "down 5",
        "forward 8", "up 3", "down 8", "forward 2")
        val expected = 150
        val actual = two.pilot_submarine(input)
        assertEquals(expected, actual)
    }

    @Test
    fun pilot_submarineTestFinal() {
        val input: List<String> = two.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input2")
        val expected = 1693300 // this is the correct answer
        val actual = two.pilot_submarine(input)
        assertEquals(expected, actual)
    }

    @Test
    fun pilot_submarine_aimTest() {
        val input: List<String> = listOf("forward 5", "down 5",
            "forward 8", "up 3", "down 8", "forward 2")
        val expected = 900
        val actual = two.pilot_submarine_aim(input)
        assertEquals(expected, actual)
    }

    @Test
    fun pilot_submarine_aimTestFinal() {
        val input: List<String> = two.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input2")
        val expected = 1857958050 // this is correct
        val actual = two.pilot_submarine_aim(input)
        assertEquals(expected, actual)
    }

    @Test
    fun listMaker() {
        val input = "C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input2"
        val expected = listOf("forward 1", "down 3")
        val actual = two.ListMaker(input)
        assertEquals(expected, actual)
        // this is expected to fail
    }


}