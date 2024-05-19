package com.goldy1992.leetcode._73_set_matrix_zeroes

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val matrix = arrayOf(
            intArrayOf(1,1,1),
            intArrayOf(1,0,1),
            intArrayOf(1,1,1),
        )

        val expected = arrayOf(
            intArrayOf(1,0,1),
            intArrayOf(0,0,0),
            intArrayOf(1,0,1),
        )
        solution.setZeroes(matrix)
        for (row in matrix.indices) {
            for (col in matrix[0].indices) {
                assertEquals(expected[row][col], matrix[row][col])
            }
        }
    }
    @Test
    fun testExample2() {
        val matrix = arrayOf(
            intArrayOf(0,1,2,0),
            intArrayOf(3,4,5,2),
            intArrayOf(1,3,1,5),
        )

        val expected = arrayOf(
            intArrayOf(0,0,0,0),
            intArrayOf(0,4,5,0),
            intArrayOf(0,3,1,0),
        )
        solution.setZeroes(matrix)
        for (row in matrix.indices) {
            for (col in matrix[0].indices) {
                assertEquals(expected[row][col], matrix[row][col])
            }
        }
    }

    @Test
    fun testExample3() {
        val matrix = arrayOf(
            intArrayOf(0,1,2,6),
            intArrayOf(3,4,5,2),
            intArrayOf(1,3,1,5),
            intArrayOf(1,3,1,5),
            intArrayOf(1,3,1,0),
        )

        val expected = arrayOf(
            intArrayOf(0,0,0,0),
            intArrayOf(0,4,5,0),
            intArrayOf(0,3,1,0),
            intArrayOf(0,3,1,0),
            intArrayOf(0,0,0,0),
        )
        solution.setZeroes(matrix)
        for (row in matrix.indices) {
            for (col in matrix[0].indices) {
                assertEquals(expected[row][col], matrix[row][col])
            }
        }
    }
}