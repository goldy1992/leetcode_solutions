package com.goldy1992.leetcode._11_containers_with_most_water

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(1,8,6,2,5,4,8,3,7)
        val expected = 49
        val result = solution.maxArea(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(1,1)
        val expected = 1
        val result = solution.maxArea(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val input = intArrayOf(5,26, 26, 5)
        val expected = 26
        val result = solution.maxArea(input)
        assertEquals(expected, result)
    }
}