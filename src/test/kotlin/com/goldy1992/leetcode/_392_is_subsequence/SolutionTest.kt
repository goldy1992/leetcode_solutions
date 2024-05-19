package com.goldy1992.leetcode._392_is_subsequence

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val s = "abc"
        val t = "ahbgdc"
        val result = solution.isSubsequence(s, t)
        assertTrue(result)
    }

    @Test
    fun testExample2() {
        val s = "axc"
        val t = "ahbgdc"
        val result = solution.isSubsequence(s, t)
        assertFalse(result)
    }
    @Test
    fun testExample3() {
        val s = ""
        val t = "ahbgdc"
        val result = solution.isSubsequence(s, t)
        assertTrue(result)
    }
}