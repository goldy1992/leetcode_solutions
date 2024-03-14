package com.goldy1992.leetcode._30_substring_with_concatentation_of_all_words

import kotlin.test.Test
import kotlin.test.*

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val s = "barfoothefoobarman"
        val words = arrayOf("foo","bar")
        val expected = setOf(0, 9)
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
        for (e in expected) {
            assertTrue(result.contains(e))
        }
    }
    @Test
    fun testExample2() {
        val s = "wordgoodgoodgoodbestword"
        val words = arrayOf("word","good","best","word")
        val expected = emptySet<Int>()
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
    }

    @Test
    fun testExample3() {
        val s = "barfoofoobarthefoobarman"
        val words = arrayOf("foo","bar","the")
        val expected = setOf(6,9,12)
        val result = solution.findSubstring(s, words)
        assertEquals(expected.size, result.size)
        for (e in expected) {
            assertTrue(result.contains(e))
        }
    }
}