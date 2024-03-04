package com.goldy1992.leetcode._13_roman_to_integer

import org.example.com.goldy1992.leetcode._13_roman_to_integer.Solution
import org.junit.jupiter.api.Assertions.*
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
}