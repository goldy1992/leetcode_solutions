package com.goldy1992.leetcode._383_ransom_note

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val ransomNote = "a"
        val magazine = "b"
        val result = solution.canConstruct(ransomNote, magazine)
        assertFalse(result)
    }
    @Test
    fun testExample2() {
        val ransomNote = "aa"
        val magazine = "ab"
        val result = solution.canConstruct(ransomNote, magazine)
        assertFalse(result)
    }
    @Test
    fun testExample3() {
        val ransomNote = "aa"
        val magazine = "aab"
        val result = solution.canConstruct(ransomNote, magazine)
        assertTrue(result)
    }
}