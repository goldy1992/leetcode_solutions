package com.goldy1992.leetcode._224_basic_calculator

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = "1 + 1"
        val expected = 2
        val result = solution.calculate(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = " 2-1 + 2 "
        val expected = 3
        val result = solution.calculate(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample3() {
        val input = "(1+(4+5+2)-3)+(6+8)"
        val expected = 23
        val result = solution.calculate(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample4() {
        val input = "(1+(44+5+2)-3)+(6+8)"
        val expected = 63
        val result = solution.calculate(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample5() {
        val input = "1-(     -2)"
        val expected = 3
        val result = solution.calculate(input)
        assertEquals(expected, result)
    }
}