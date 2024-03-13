package com.goldy1992.leetcode._209_minimum_size_subarray_sum

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(2,3,1,2,4,3)
        val target = 7
        val expected = 2
        val result = solution.minSubArrayLen(target, input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(1,4,4)
        val target = 4
        val expected = 1
        val result = solution.minSubArrayLen(target, input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val input = intArrayOf(1,1,1,1,1,1,1,1)
        val target = 11
        val expected = 0
        val result = solution.minSubArrayLen(target, input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample4() {
        val input = intArrayOf(12,28,83,4,25,26,25,2,25,25,25,12)
        val target = 213
        val expected = 8
        val result = solution.minSubArrayLen(target, input)
        assertEquals(expected, result)
    }
}