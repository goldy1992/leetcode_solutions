package com.goldy1992.leetcode._125_valid_palindrome

import com.goldy1992.leetcode._125_valid_palindrome.Solution
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
    @Test
    fun testExample4() {
        val input = "+++a_+_+_a"
        val result = solution.isPalindrome(input)
        assertTrue(result)
    }
    @Test
    fun testExample5() {
        val input = "girafarig"
        val result = solution.isPalindrome(input)
        assertTrue(result)
    }
    @Test
    fun testExample7() {
        val input = "  g "
        val result = solution.isPalindrome(input)
        assertTrue(result)
    }
    @Test
    fun testExample8() {
        val input = ".,"
        val result = solution.isPalindrome(input)
        assertTrue(result)
    }
    @Test
    fun testExample9() {
        val input = "0P"
        val result = solution.isPalindrome(input)
        assertFalse(result)
    }
}