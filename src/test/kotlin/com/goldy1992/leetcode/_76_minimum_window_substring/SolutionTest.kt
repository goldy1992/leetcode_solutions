package com.goldy1992.leetcode._76_minimum_window_substring

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val s = "ADOBECODEBANC"
        val t = "ABC"
        val expected = "BANC"
        val result = solution.minWindow(s, t)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val s = "a"
        val t = "a"
        val expected = "a"
        val result = solution.minWindow(s, t)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val s = "a"
        val t = "aa"
        val expected = ""
        val result = solution.minWindow(s, t)
        assertEquals(expected, result)
    }
}