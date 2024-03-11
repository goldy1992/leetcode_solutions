package com.goldy1992.leetcode._15_3sum

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(-1,0,1,2,-1,-4)
        val expected = setOf(
            listOf(-1,-1,2),
            listOf(-1, 0, 1)
        )
        val result = solution.threeSum(input)
        for (r in result) {
            assertTrue(expected.contains(r))
        }
    }
    @Test
    fun testExample2() {
        val input = intArrayOf(0, 1, 1)
        val expected = setOf<List<Int>>()
        val result = solution.threeSum(input)
        for (r in result) {

            assertTrue(expected.contains(r))
        }
    }
}