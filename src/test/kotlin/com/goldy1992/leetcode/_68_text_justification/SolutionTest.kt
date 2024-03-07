package com.goldy1992.leetcode._68_text_justification

import org.example.com.goldy1992.leetcode._68_text_justification.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
        val maxWidth = 16
        val expected = listOf(
            "This    is    an",
            "example  of text",
            "justification.  "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }

    @Test
    fun testExample2() {
        val input = arrayOf("What","must","be","acknowledgment","shall","be")
        val maxWidth = 16
        val expected = listOf(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }
    @Test
    fun testExample3() {
        val input = arrayOf("Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do")
        val maxWidth = 20
        val expected = listOf(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        )
        val result = solution.fullJustify(input, maxWidth)
        assertLinesMatch(expected, result)
    }

}