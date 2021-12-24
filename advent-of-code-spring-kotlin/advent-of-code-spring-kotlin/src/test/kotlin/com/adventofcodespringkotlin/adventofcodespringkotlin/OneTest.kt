package com.adventofcodespringkotlin.adventofcodespringkotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import com.adventofcodespringkotlin.adventofcodespringkotlin.One


internal class OneTest {

    val one: One = One();

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
    fun biggerVal() {
        val input: List<Int> = listOf(1, 2, 3)
        val expected = 2
        val actual = one.BiggerVal(input)
        assertEquals(expected, actual)
    }
}