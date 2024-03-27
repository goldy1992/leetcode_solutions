package com.goldy1992.leetcode._205_isomorphic_string

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val s = "egg"
        val t = "add"
        val result = solution.isIsomorphic(s, t)
        assertTrue(result)
    }
    @Test
    fun testExample2() {
        val s = "foo"
        val t = "bar"
        val result = solution.isIsomorphic(s, t)
        assertFalse(result)
    }
    @Test
    fun testExample3() {
        val s = "paper"
        val t = "title"
        val result = solution.isIsomorphic(s, t)
        assertTrue(result)
    }

    @Test
    fun testExample4() {
        val s = "badc"
        val t = "baba"
        val result = solution.isIsomorphic(s, t)
        assertFalse(result)
    }
}