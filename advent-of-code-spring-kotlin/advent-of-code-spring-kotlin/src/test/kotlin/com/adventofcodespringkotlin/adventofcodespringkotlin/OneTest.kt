package com.adventofcodespringkotlin.adventofcodespringkotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import com.adventofcodespringkotlin.adventofcodespringkotlin.One


internal class OneTest {

    val one: One = One()

    @Test
    fun sumTest3() {
        // given: input
        val input: List<Int> = listOf(1, 2, 3)
        val expected = 6
        // when: call your method/function under test
        val actual = one.sum(input)
        // then: assert your expectation
        assertEquals(expected, actual)
    }

    @Test
    fun sumTest4() {
        // given: input
        val input: List<Int> = listOf(1, 2, 3, 1)
        val expected = 7
        // when: call your method/function under test
        val actual = one.sum(input)
        // then: assert your expectation
        assertEquals(expected, actual)
    }

    @Test
    fun biggerValTest() {
        val input: List<Int> = one.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input1")
        val expected = 7
        val actual = one.BiggerVal(input)
        assertEquals(expected, actual)
    }

    @Test
    fun listMaker() {
        val input = "C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input1"
        val expected = listOf(1, 2, 3)
        val actual = one.ListMaker(input)
        assertEquals(expected, actual)

    }

    @Test
    fun biggerVal_Categories() {
        val input = listOf(199,
        200,
        208,
        210,
        200,
        207,
        240,
        269,
        260,
        263)
        val expected = 5;
        val actual = one.BiggerVal_Categories(input)
        assertEquals(expected, actual)
    }

    @Test
    fun biggerVal_Categories2() {
        val input = listOf(1, 2, 3, 4, 5)
        val expected = 2
        val actual = one.BiggerVal_Categories(input)
        assertEquals(expected, actual)
    }

    @Test
    fun biggerVal_CategoriesFinal() {
        val input: List<Int> = one.ListMaker("C:\\Users\\Jrous\\repositories\\advent-of-code-cheeseycube\\advent-of-code-spring-kotlin\\advent-of-code-spring-kotlin\\Input1")
        val expected = 1743
        val actual = one.BiggerVal_Categories(input)
        assertEquals(expected, actual)
    }
}