package com.goldy1992.leetcode._452_min_arrows_burst_balloons

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()
    
    @Test
    fun testExample1() {
        val points = arrayOf(
            intArrayOf(10,16),
            intArrayOf(2,8),
            intArrayOf(1,6),
            intArrayOf(7,12)
        )
        val expected = 2
        val result = solution.findMinArrowShots(points)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val points = arrayOf(
            intArrayOf(1,2),
            intArrayOf(3,4),
            intArrayOf(5,6),
            intArrayOf(7,8)
        )
        val expected = 4
        val result = solution.findMinArrowShots(points)
        assertEquals(expected, result)
    }

    @Test
    fun testExample3() {
        val points = arrayOf(
            intArrayOf(1,6),
            intArrayOf(2,5),
            intArrayOf(3,4),
        )
        val expected = 1
        val result = solution.findMinArrowShots(points)
        assertEquals(expected, result)
    }
    @Test
    fun testExample4() {
        val points = arrayOf(
            intArrayOf(3,4),
            intArrayOf(2,5),
            intArrayOf(1,6)
        )
        val expected = 1
        val result = solution.findMinArrowShots(points)
        assertEquals(expected, result)
    }

    @Test
    fun testExample5() {
        val points = arrayOf(
            intArrayOf(3,9),
            intArrayOf(7,12),
            intArrayOf(3,8),
            intArrayOf(6,8),
            intArrayOf(9,10),
            intArrayOf(2,9),
            intArrayOf(0,9),
            intArrayOf(3,9),
            intArrayOf(0,6),
            intArrayOf(2,8)
        )
        val expected = 2
        val result = solution.findMinArrowShots(points)
        assertEquals(expected, result)
    }
}