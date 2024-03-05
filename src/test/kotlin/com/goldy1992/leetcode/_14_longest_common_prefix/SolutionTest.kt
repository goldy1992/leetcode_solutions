package com.goldy1992.leetcode._14_longest_common_prefix

import org.example.com.goldy1992.leetcode._14_longest_common_prefix.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf("flower","flow","flight")
        val expected = "fl"
        val result = solution.longestCommonPrefix(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = arrayOf("dog","racecar","car")
        val expected = ""
        val result = solution.longestCommonPrefix(input)
        assertEquals(expected, result)
    }
}