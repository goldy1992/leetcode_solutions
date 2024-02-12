package com.goldy1992.leetcode.h_index

import org.example.com.goldy1992.leetcode.h_index.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp
import kotlin.test.expect

class SolutionTest {

    val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(3,0,6,1,5)
        val expected = 3
        val actual = solution.hIndex(input)
        assertEquals(expected, actual)
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(1,3,1)
        val expected = 1
        val actual = solution.hIndex(input)
        assertEquals(expected, actual)
    }
}