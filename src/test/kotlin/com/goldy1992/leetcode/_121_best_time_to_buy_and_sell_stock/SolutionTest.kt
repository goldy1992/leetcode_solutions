package com.goldy1992.leetcode._121_best_time_to_buy_and_sell_stock

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

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

    @Test
    fun testExample3() {
        val input = intArrayOf(8,9,1,7)
        val expected = 6
        val actual = solution.maxProfit(input)
        assertEquals(expected, actual)
    }
}