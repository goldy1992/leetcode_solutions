package com.goldy1992.leetcode._20_valid_parantheses

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testExample1() {
        val s = "()"
        val result = solution.isValid(s)
        assertTrue(result)
    }

    @Test
    fun testExample2() {
        val s = "()[]{}"
        val result = solution.isValid(s)
        assertTrue(result)
    }

    @Test
    fun testExample3() {
        val s = "(]"
        val result = solution.isValid(s)
        assertFalse(result)
    }
}