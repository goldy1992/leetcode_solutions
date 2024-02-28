package com.goldy1992.leetcode._238_product_of_array_except_self

import org.example.com.goldy1992.leetcode._238_product_of_array_except_self.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(1, 2, 3,4)
        val expected = intArrayOf(24,12,8,6)
        val result = solution.productExceptSelf(input)
        assertArrayEquals(expected, result)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(-1,1,0,-3,3)
        val expected = intArrayOf(0,0,9,0,0)
        val result = solution.productExceptSelf(input)
        assertArrayEquals(expected, result)
    }

}