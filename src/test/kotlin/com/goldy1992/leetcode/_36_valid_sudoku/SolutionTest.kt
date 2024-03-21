package com.goldy1992.leetcode._36_valid_sudoku

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )
        val result = solution.isValidSudoku(input)
        assertTrue(result)
    }
    @Test
    fun testExample2() {
        val input = arrayOf(
            charArrayOf('8','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )
        val result = solution.isValidSudoku(input)
        assertFalse(result)
    }

    @Test
    fun testExample3() {
        val input = arrayOf(
            charArrayOf('.','.','.','.','5','.','.','1','.'),
            charArrayOf('.','4','.','3','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','3','.','.','1'),
            charArrayOf('8','.','.','.','.','.','.','2','.'),
            charArrayOf('.','.','2','.','7','.','.','.','.'),
            charArrayOf('.','1','5','.','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','2','.','.','.'),
            charArrayOf('.','2','.','9','.','.','.','.','.'),
            charArrayOf('.','.','4','.','.','.','.','.','.')
        )
        val result = solution.isValidSudoku(input)
        assertFalse(result)
    }
}