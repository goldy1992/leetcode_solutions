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
    @Test
    fun testExample4() {
        val path = "/a/./b/../../c/"
        val expected = "/c"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }
    @Test
    fun testExample5() {
        val path = "/a//b////c/d//././/.."
        val expected = "/a/b/c"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }
    @Test
    fun testExample6() {
        val path = "/."
        val expected = "/"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }
    @Test
    fun testExample7() {
        val path = "/home/of/foo/../../bar/../../is/./here/."
        val expected = "/is/here"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }
    @Test
    fun testExample8() {
        val path = "///TJbrd/owxdG//"
        val expected = "/TJbrd/owxdG"
        val result = solution.simplifyPath(path)
        assertEquals(expected, result)
    }


}