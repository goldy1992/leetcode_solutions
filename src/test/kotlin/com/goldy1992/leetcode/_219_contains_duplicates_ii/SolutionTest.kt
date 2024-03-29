package com.goldy1992.leetcode._219_contains_duplicates_ii

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val nums = intArrayOf(1,2,3,1)
        val k = 3
        val result = solution.containsNearbyDuplicate(nums, k)
        assertTrue(result)
    }
    @Test
    fun testExample2() {
        val nums = intArrayOf(1,0,1,1)
        val k = 1
        val result = solution.containsNearbyDuplicate(nums, k)
        assertTrue(result)
    }
    @Test
    fun testExample3() {
        val nums = intArrayOf(1,2,3,1,2,3)
        val k = 2
        val result = solution.containsNearbyDuplicate(nums, k)
        assertFalse(result)
    }
}