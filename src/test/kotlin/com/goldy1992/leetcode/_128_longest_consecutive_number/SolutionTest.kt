package com.goldy1992.leetcode._128_longest_consecutive_number

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val nums = intArrayOf(100,4,200,1,3,2)
        val expected = 4
        val result = solution.longestConsecutive(nums)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val nums = intArrayOf(0,3,7,2,5,8,4,6,0,1)
        val expected = 9
        val result = solution.longestConsecutive(nums)
        assertEquals(expected, result)
    }
}