package com.goldy1992.leetcode._20_valid_parentheses

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
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
    @Test
    fun testExample4() {
        val s = "()]"
        val result = solution.isValid(s)
        assertFalse(result)
    }
    @Test
    fun testExample5() {
        val s = "([{{(())}}])"
        val result = solution.isValid(s)
        assertTrue(result)
    }

    @Test
    fun testExample6() {
        val s = "([{{(())}}]}"
        val result = solution.isValid(s)
        assertFalse(result)
    }
    @Test
    fun testExample7() {
        val s = "[[(())]]([{{(())}}])"
        val result = solution.isValid(s)
        assertTrue(result)
    }
}