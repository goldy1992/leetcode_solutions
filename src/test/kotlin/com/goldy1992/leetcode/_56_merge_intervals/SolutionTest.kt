package com.goldy1992.leetcode._56_merge_intervals

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()
    
    @Test
    fun testExample1() {
        val intervals = arrayOf(
            intArrayOf(1,3),
            intArrayOf(2,6),
            intArrayOf(8,10),
            intArrayOf(15,18)
        )
        val expected = arrayOf(
            intArrayOf(1,6),
            intArrayOf(8,10),
            intArrayOf(15,18)
        )
        val result = solution.merge(intervals)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val intervals = arrayOf(
            intArrayOf(1,4),
            intArrayOf(4,5)
        )
        val expected = arrayOf(
            intArrayOf(1,5)
        )
        val result = solution.merge(intervals)
        assertArrayEquals(expected, result)
    }
}