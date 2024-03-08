package com.goldy1992.leetcode._125_valid_palindrome

import org.example.com.goldy1992.leetcode._125_valid_palindrome.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = "A man, a plan, a canal: Panama"
        val result = solution.isPalindrome(input)
        assertTrue(result)
    }
    @Test
    fun testExample2() {
        val input = "race a car"
        val result = solution.isPalindrome(input)
        assertFalse(result)
    }
    @Test
    fun testExample3() {
        val input = " "
        val result = solution.isPalindrome(input)
        assertTrue(result)
    }
}