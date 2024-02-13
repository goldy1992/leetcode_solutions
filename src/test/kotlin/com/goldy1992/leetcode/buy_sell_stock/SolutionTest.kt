package com.goldy1992.leetcode.buy_sell_stock

import org.example.com.goldy1992.leetcode.buy_sell_stock.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(7,1,5,3,6,4)
        val expected = 5
        val actual = solution.maxProfit(input)
        assertEquals(expected, actual)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(7,6,4,3,1)
        val expected = 0
        val actual = solution.maxProfit(input)
        assertEquals(expected, actual)
    }
}