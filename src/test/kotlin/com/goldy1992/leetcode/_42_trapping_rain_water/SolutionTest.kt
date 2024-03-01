package com.goldy1992.leetcode._42_trapping_rain_water

import org.example.com.goldy1992.leetcode._42_trapping_rain_water.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()
    @Test
    fun testExample1() {
        val input = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)
        val expected = 6
        val result = solution.trap(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(4,2,0,3,2,5)
        val expected = 9
        val result = solution.trap(input)
        assertEquals(expected, result)
    }
}