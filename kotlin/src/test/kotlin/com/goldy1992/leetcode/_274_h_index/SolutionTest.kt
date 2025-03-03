package com.goldy1992.leetcode._274_h_index

import com.goldy1992.leetcode.h_index.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    val solution = Solution()

    @Test
    fun testExample1() {
        // 6,5,3,1,0
        val input = intArrayOf(3,0,6,1,5)
        val expected = 3
        val actual = solution.hIndex(input)
        assertEquals(expected, actual)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(1,3,1)
        val expected = 1
        val actual = solution.hIndex(input)
        assertEquals(expected, actual)
    }
    @Test
    fun testExample3() {
        val input = intArrayOf(100)
        val expected = 1
        val actual = solution.hIndex(input)
        assertEquals(expected, actual)
    }
}