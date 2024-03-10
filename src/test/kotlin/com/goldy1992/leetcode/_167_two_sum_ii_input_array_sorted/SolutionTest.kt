package com.goldy1992.leetcode._167_two_sum_ii_input_array_sorted

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(2,7,11,15)
        val target = 9
        val expected = intArrayOf(1, 2)
        val result = solution.twoSum(input, target)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(2,3,4)
        val target = 6
        val expected = intArrayOf(1, 3)
        val result = solution.twoSum(input, target)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val input = intArrayOf(-1, 0)
        val target = -1
        val expected = intArrayOf(1, 2)
        val result = solution.twoSum(input, target)
        assertArrayEquals(expected, result)
    }
}