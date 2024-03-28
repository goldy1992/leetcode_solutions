package com.goldy1992.leetcode._242_valid_anagram

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val s = "anagram"
        val t = "nagaram"
        val result = solution.isAnagram(s, t)
        assertTrue(result)
    }
    @Test
    fun testExample2() {
        val s = "rat"
        val t = "car"
        val result = solution.isAnagram(s, t)
        assertFalse(result)
    }
}