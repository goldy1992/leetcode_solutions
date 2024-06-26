package com.goldy1992.leetcode._57_insert_interval

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val intervals = arrayOf(
            intArrayOf(1,3),
            intArrayOf(6,9)
        )
        val newInterval = intArrayOf(2,5)
        val expected = arrayOf(
            intArrayOf(1,5),
            intArrayOf(6,9)
        )
        val result = solution.insert(intervals, newInterval)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val intervals = arrayOf(
            intArrayOf(1,2),
            intArrayOf(3,5),
            intArrayOf(6,7),
            intArrayOf(8,10),
            intArrayOf(12,16),
        )
        val newInterval = intArrayOf(4,8)
        val expected = arrayOf(
            intArrayOf(1,2),
            intArrayOf(3,10),
            intArrayOf(12,16)
        )
        val result = solution.insert(intervals, newInterval)
        assertArrayEquals(expected, result)
    }




    @Test
    fun testExample3() {
        val intervals = arrayOf(
            intArrayOf(1,5),
        )
        val newInterval = intArrayOf(2,7)
        val expected = arrayOf(
            intArrayOf(1,7),
        )
        val result = solution.insert(intervals, newInterval)
        assertArrayEquals(expected, result)
    }

    @Test
    fun testExample4() {
        val intervals = arrayOf(
            intArrayOf(1,5),
        )
        val newInterval = intArrayOf(6,7)
        val expected = arrayOf(
            intArrayOf(1,5),
            intArrayOf(6,7)
        )
        val result = solution.insert(intervals, newInterval)
        assertArrayEquals(expected, result)
    }
   @Test
    fun testExample5() {
        val intervals = arrayOf(
            intArrayOf(6,7),
        )
        val newInterval = intArrayOf(1,5)
        val expected = arrayOf(
            intArrayOf(1,5),
            intArrayOf(6,7)
        )
        val result = solution.insert(intervals, newInterval)
        assertArrayEquals(expected, result)
    }

   @Test
    fun testExample6() {
        val intervals = arrayOf(
            intArrayOf(1,5),
        )
        val newInterval = intArrayOf(2,3)
        val expected = arrayOf(
            intArrayOf(1,5)
        )
        val result = solution.insert(intervals, newInterval)
        assertArrayEquals(expected, result)
    }


}