package com.goldy1992.leetcode._45_jump_game_ii

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()
    @Test
    fun testExample1() {
        val input = intArrayOf(2,3,1,1,4)
        val expected = 2
        val result = solution.jump(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(2,3,0,1,4)
        val expected = 2
        val result = solution.jump(input)
        assertEquals(expected, result)
    }

    @Test
    fun testExample3() {
        val input = intArrayOf(2,3,1)
        val expected = 1
        val result = solution.jump(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample4() {
        val input = intArrayOf(1,2,1,1,1)
        val expected = 3
        val result = solution.jump(input)
        assertEquals(expected, result)
    }
}