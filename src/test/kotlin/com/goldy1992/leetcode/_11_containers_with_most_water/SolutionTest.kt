package com.goldy1992.leetcode._11_containers_with_most_water

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(1,8,6,2,5,4,8,3,7)
        val expected = 49
        val result = solution.maxArea(input)
        kotlin.test.assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(1,1)
        val expected = 1
        val result = solution.maxArea(input)
        kotlin.test.assertEquals(expected, result)
    }
}