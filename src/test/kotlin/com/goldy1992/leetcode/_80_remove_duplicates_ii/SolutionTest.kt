package com.goldy1992.leetcode._80_remove_duplicates_ii

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(1,1, 1,2,2,3)
        val expectedArray = intArrayOf(1,1,2,2,3,-1)
        val expectedSize = 5
        val result = solution.removeDuplicates(input)
        assertEquals(expectedSize, result)
        assertArrayEquals(expectedArray, input)
    }

    @Test
    fun testExample2() {
        val input = intArrayOf(0,0,1,1,1,1,2,3,3)
        val expectedArray = intArrayOf(0,0,1,1,2,3,3,-1,-1)
        val expectedSize = 5
        val result = solution.removeDuplicates(input)
        assertEquals(expectedSize, result)
        assertArrayEquals(expectedArray, input)
    }

}