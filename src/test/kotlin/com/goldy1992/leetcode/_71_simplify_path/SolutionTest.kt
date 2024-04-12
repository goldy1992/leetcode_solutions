package com.goldy1992.leetcode._71_simplify_path

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val path = "/home/"
        val expected = "/home"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val path = "/../"
        val expected = "/"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val path = "/home//foo/"
        val expected = "/home/foo"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }
}