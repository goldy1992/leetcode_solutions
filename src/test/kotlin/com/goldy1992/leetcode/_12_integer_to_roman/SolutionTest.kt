package com.goldy1992.leetcode._12_integer_to_roman

import com.goldy1992.leetcode._12_integer_to_roman.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = 3
        val expected = "III"
        val result = solution.intToRoman(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = 58
        val expected = "LVIII"
        val result = solution.intToRoman(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample3() {
        val input = 1994
        val expected = "MCMXCIV"
        val result = solution.intToRoman(input)
        assertEquals(expected, result)
    }


    @Test
    fun testExample4() {
        val input = 1995
        val expected = "MCMXCV"
        val result = solution.intToRoman(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample6() {
        val input = 10
        val expected = "X"
        val result = solution.intToRoman(input)
        assertEquals(expected, result)
    }
}