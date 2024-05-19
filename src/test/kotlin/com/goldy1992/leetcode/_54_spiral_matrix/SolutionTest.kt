package com.goldy1992.leetcode._54_spiral_matrix

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9)
        )
        val expected = listOf(1,2,3,6,9,8,7,4,5)
        val result = solution.spiralOrder(input)

        assertEquals(expected.size, result.size)
        for (n in expected.indices) {
            assertEquals(expected[n], result[n])
        }
    }
    @Test
    fun testExample2() {
        val input = arrayOf(
            intArrayOf(1,2,3,4),
            intArrayOf(5,6,7,8),
            intArrayOf(9,10,11,12)
        )
        val expected = listOf(1,2,3,4,8,12,11,10,9,5,6,7)
        val result = solution.spiralOrder(input)

        assertEquals(expected.size, result.size)
        for (n in expected.indices) {
            assertEquals(expected[n], result[n])
        }
    }

    @Test
    fun testExample3() {
        val input = arrayOf(
            intArrayOf( 1, 2, 3, 4),
            intArrayOf(12,13,14, 5),
            intArrayOf(11,16,15, 6),
            intArrayOf(10, 9, 8, 7)
        )
        val expected = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
        val result = solution.spiralOrder(input)

        assertEquals(expected.size, result.size)
        for (n in expected.indices) {
            assertEquals(expected[n], result[n])
        }
    }
}