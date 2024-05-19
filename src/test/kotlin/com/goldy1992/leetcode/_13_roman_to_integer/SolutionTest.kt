package com.goldy1992.leetcode._13_roman_to_integer

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = "III"
        val expected = 3
        val result = solution.romanToInt(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = "LVIII"
        val expected = 58
        val result = solution.romanToInt(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample3() {
        val input = "MCMXCIV"
        val expected = 1994
        val result = solution.romanToInt(input)
        assertEquals(expected, result)
    }


    @Test
    fun testExample4() {
        val input = "MCMXCIVI"
        val expected = 1995
        val result = solution.romanToInt(input)
        assertEquals(expected, result)
    }
}