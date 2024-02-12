package com.goldy1992.leetcode.majority_element

import org.example.com.goldy1992.leetcode.majority_element.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    val solution = Solution()

    @Test
    fun testExample1()
    {
        val input = intArrayOf(3, 2, 3)
        val expected = 2
        val actual = solution.majorityElement(input)
        assertEquals(expected, actual)
    }
}