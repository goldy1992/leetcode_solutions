package com.goldy1992.leetcode._58_length_of_last_word

import com.goldy1992.leetcode._58_length_of_last_word.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = "Hello World"
        val expected = 5
        val result = solution.lengthOfLastWord(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = "   fly me   to   the moon  "
        val expected = 4
        val result = solution.lengthOfLastWord(input)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val input = "luffy is still joyboy"
        val expected = 6
        val result = solution.lengthOfLastWord(input)
        assertEquals(expected, result)
    }

}