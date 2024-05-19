package com.goldy1992.leetcode._202_happy_number

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val n = 19
        val result = solution.isHappy(n)
        assertTrue(result)
    }

    @Test
    fun testExample2() {
        val n = 2
        val result = solution.isHappy(n)
        assertFalse(result)
    }

}