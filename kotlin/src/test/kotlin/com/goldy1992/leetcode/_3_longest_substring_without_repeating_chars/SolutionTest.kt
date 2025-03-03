package com.goldy1992.leetcode._3_longest_substring_without_repeating_chars

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = "abcabcbb"
        val expected = 3
        val result = solution.lengthOfLongestSubstring(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = "bbbbb"
        val expected = 1
        val result = solution.lengthOfLongestSubstring(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val input = "pwwkew"
        val expected = 3
        val result = solution.lengthOfLongestSubstring(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample4() {
        val input = "au"
        val expected = 2
        val result = solution.lengthOfLongestSubstring(input)
        assertEquals(expected, result)
    }
}