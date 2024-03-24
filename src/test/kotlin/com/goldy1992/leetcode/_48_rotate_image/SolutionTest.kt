package com.goldy1992.leetcode._48_rotate_image

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9),
        )
        val expected = arrayOf(
            intArrayOf(7,4,1),
            intArrayOf(8,5,2),
            intArrayOf(9,6,3),
        )
        solution.rotate(input)
        assertEquals(expected.size, input.size)
        assertEquals(expected[0].size, input[0].size)

        for (i in expected.indices) {
            for (j in expected.indices) {
                assertEquals(expected[i][j], input[i][j])
            }
        }
    }
    @Test
    fun testExample2() {
        val input = arrayOf(
            intArrayOf( 5,  1,  9, 11),
            intArrayOf( 2,  4,  8, 10),
            intArrayOf(13,  3,  6,  7),
            intArrayOf(15, 14, 12, 16),
        )
        val expected = arrayOf(
            intArrayOf(15, 13,  2,  5),
            intArrayOf(14,  3,  4,  1),
            intArrayOf(12,  6,  8,  9),
            intArrayOf(16,  7, 10, 11),
        )

        solution.rotate(input)
        assertEquals(expected.size, input.size)
        assertEquals(expected[0].size, input[0].size)

        for (i in expected.indices) {
            for (j in expected.indices) {
                assertEquals(expected[i][j], input[i][j])
            }
        }
    }
}