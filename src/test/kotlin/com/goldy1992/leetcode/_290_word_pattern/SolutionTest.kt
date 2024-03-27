package com.goldy1992.leetcode._290_word_pattern

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val pattern = "abba"
        val s = "dog cat cat dog"
        val result = solution.wordPattern(pattern, s)
        assertTrue(result)
    }
    @Test
    fun testExample2() {
        val pattern = "abba"
        val s = "dog cat cat fish"
        val result = solution.wordPattern(pattern, s)
        assertFalse(result)
    }
    @Test
    fun testExample3() {
        val pattern = "aaaa"
        val s = "dog cat cat dog"
        val result = solution.wordPattern(pattern, s)
        assertFalse(result)
    }
}