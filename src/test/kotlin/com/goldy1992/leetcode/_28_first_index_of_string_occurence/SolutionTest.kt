package com.goldy1992.leetcode._28_first_index_of_string_occurence

import com.goldy1992.leetcode._28_first_index_of_string_occurence.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun textExample1() {
        val haystack = "sadbutsad"
        val needle = "sad"
        val expected = 0
        val result = solution.strStr(haystack, needle)
        assertEquals(expected, result)
    }
    @Test
    fun textExample2() {
        val haystack = "leetcode"
        val needle = "leeto"
        val expected = -1
        val result = solution.strStr(haystack, needle)
        assertEquals(expected, result)
    }
    @Test
    fun textExample3() {
        val haystack = "leetcodeleeto"
        val needle = "leeto"
        val expected = 8
        val result = solution.strStr(haystack, needle)
        assertEquals(expected, result)
    }
}