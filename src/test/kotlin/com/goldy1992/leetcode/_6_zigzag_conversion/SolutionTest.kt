package com.goldy1992.leetcode._6_zigzag_conversion

import com.goldy1992.leetcode._6_zigzag_conversion.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = "PAYPALISHIRING"
        val expected = "PAHNAPLSIIGYIR"
        val numRows = 3
        val result = solution.convert(input, numRows)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = "PAYPALISHIRING"
        val expected = "PINALSIGYAHRPI"
        val numRows = 4
        val result = solution.convert(input, numRows)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val input = "A"
        val expected = "A"
        val numRows = 1
        val result = solution.convert(input, numRows)
        assertEquals(expected, result)
    }
    @Test
    fun testExample4() {
        val input = "ABABAB"
        val expected = "AAABBB"
        val numRows = 2
        val result = solution.convert(input, numRows)
        assertEquals(expected, result)
    }
    @Test
    fun testExample5() {
        val input = "AB"
        val expected = "AB"
        val numRows = 1
        val result = solution.convert(input, numRows)
        assertEquals(expected, result)
    }
}