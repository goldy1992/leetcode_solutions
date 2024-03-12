package com.goldy1992.leetcode._151_reverse_words_in_string

import com.goldy1992.leetcode._151_reverse_words_in_string.Solution
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

    @Test
    fun testExample4() {
        val input = " once upon a time "
        val expected = "time a upon once"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample5() {
        val input = "EPY2giL"
        val expected = "EPY2giL"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample6() {
        val input = " asdasd df f"
        val expected = "f df asdasd"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample7() {
        val input = "a"
        val expected = "a"
        val result = solution.reverseWords(input)
        assertEquals(expected, result)
    }
}