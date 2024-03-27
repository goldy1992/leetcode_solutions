package com.goldy1992.leetcode._289_game_of_life

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val board = arrayOf(
            intArrayOf(0,1,0),
            intArrayOf(0,0,1),
            intArrayOf(1,1,1),
            intArrayOf(0,0,0)
        )

        val expected = arrayOf(
            intArrayOf(0,0,0),
            intArrayOf(1,0,1),
            intArrayOf(0,1,1),
            intArrayOf(0,1,0)
        )

        solution.gameOfLife(board)
        for (row in expected.indices) {
            for (col in expected[0].indices) {
                assertEquals(expected[row][col], board[row][col])
            }
        }
    }
    @Test
    fun testExample2() {
        val board = arrayOf(
            intArrayOf(1,1),
            intArrayOf(1,0)
        )

        val expected = arrayOf(
            intArrayOf(1,1),
            intArrayOf(1,1)
        )

        solution.gameOfLife(board)
        for (row in expected.indices) {
            for (col in expected[0].indices) {
                assertEquals(expected[row][col], board[row][col])
            }
        }
    }

    @Test
    fun testExample3() {
        val board = arrayOf(
            intArrayOf(0,0),
        )

        val expected = arrayOf(
            intArrayOf(0,0)
        )

        solution.gameOfLife(board)
        for (row in expected.indices) {
            for (col in expected[0].indices) {
                assertEquals(expected[row][col], board[row][col])
            }
        }
    }
}