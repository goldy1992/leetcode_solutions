package com.goldy1992.leetcode._151_reverse_words_in_string

import org.example.com.goldy1992.leetcode._151_reverse_words_in_string.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = "the sky is blue"
        val expected = "blue is sky the"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = "  hello world  "
        val expected = "world hello"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val input = "a good   example"
        val expected = "example good a"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
}