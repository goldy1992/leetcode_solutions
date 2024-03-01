package com.goldy1992.leetcode._135_candy

import org.example.com.goldy1992.leetcode._135_candy.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val ratings = intArrayOf(1, 0, 2)
        val expected = 5
        val result = solution.candy(ratings)
        assertEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val ratings = intArrayOf(1, 2, 2)
        val expected = 4
        val result = solution.candy(ratings)
        assertEquals(expected, result)
    }
    @Test
    fun testExample3() {
        val ratings = intArrayOf(1,2,87,87,87,2,1)
        // expected candies (1,2,3,1,3,2,1)
        val expected = 13
        val result = solution.candy(ratings)
        assertEquals(expected, result)
    }
}