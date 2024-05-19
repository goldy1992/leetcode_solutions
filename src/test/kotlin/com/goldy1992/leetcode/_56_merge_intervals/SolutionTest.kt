package com.goldy1992.leetcode._56_merge_intervals

import org.junit.jupiter.api.Assertions.assertArrayEquals
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

    @Test
    fun testExample3() {
        val intervals = arrayOf(
            intArrayOf(1,4),
            intArrayOf(1,4)
        )
        val expected = arrayOf(
            intArrayOf(1,4)
        )
        val result = solution.merge(intervals)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample4() {
        val intervals = arrayOf(
            intArrayOf(1,4),
            intArrayOf(2,3)
        )
        val expected = arrayOf(
            intArrayOf(1,4)
        )
        val result = solution.merge(intervals)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample5() {
        val intervals = arrayOf(
            intArrayOf(2,3),
            intArrayOf(4,5),
            intArrayOf(6,7),
            intArrayOf(8,9),
            intArrayOf(1,10),

        )
        val expected = arrayOf(
            intArrayOf(1,10)
        )
        val result = solution.merge(intervals)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample6() {
        val intervals = arrayOf(
            intArrayOf(2,3),
            intArrayOf(4,6),
            intArrayOf(5,7),
            intArrayOf(3,4)
        )
        val expected = arrayOf(
            intArrayOf(2,7)
        )
        val result = solution.merge(intervals)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testExample7() {
        val intervals = arrayOf(
            intArrayOf(1,4),
            intArrayOf(5,6)
            )
        val expected = arrayOf(
            intArrayOf(1,4),
            intArrayOf(5,6)
        )
        val result = solution.merge(intervals)
        assertArrayEquals(expected, result)
    }
}