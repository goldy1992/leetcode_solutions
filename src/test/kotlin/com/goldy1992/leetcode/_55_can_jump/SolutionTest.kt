package com.goldy1992.leetcode._55_can_jump

import org.example.com.goldy1992.leetcode._55_can_jump.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(2,3,1,1,4)
        val expected = true
        assertEquals(expected, solution.canJump(input))
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(3,2,1,0,4)
        val expected = false
        assertEquals(expected, solution.canJump(input))
    }
    @Test
    fun testExample3() {
        val input = intArrayOf(0)
        val expected = true
        assertEquals(expected, solution.canJump(input))
    }
    @Test
    fun testExample4() {
        val input = intArrayOf(5,9,3,2,1,0,2,3,3,1,0,0)
        val expected = true
        assertEquals(expected, solution.canJump(input))
    }

}