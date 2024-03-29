package com.goldy1992.leetcode._1_two_sum

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val expected = intArrayOf(0, 1)
        val result = solution.twoSum(nums, target)
        assertEquals(expected.size, result.size)
        assertTrue(result.contains(expected[0]))
        assertTrue(result.contains(expected[1]))
    }
    @Test
    fun testExample2() {
        val nums = intArrayOf(3,2,4)
        val target = 6
        val expected = intArrayOf(1,2)
        val result = solution.twoSum(nums, target)
        assertEquals(expected.size, result.size)
        assertTrue(result.contains(expected[0]))
        assertTrue(result.contains(expected[1]))
    }
    @Test
    fun testExample3() {
        val nums = intArrayOf(3,3)
        val target = 6
        val expected = intArrayOf(0, 1)
        val result = solution.twoSum(nums, target)
        assertEquals(expected.size, result.size)
        assertTrue(result.contains(expected[0]))
        assertTrue(result.contains(expected[1]))
    }
}