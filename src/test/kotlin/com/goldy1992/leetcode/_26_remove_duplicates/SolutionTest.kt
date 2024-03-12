package com.goldy1992.leetcode._26_remove_duplicates

import com.goldy1992.leetcode._26_remove_duplicates.Solution
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = intArrayOf(1,1 ,2)
        val expectedArray = intArrayOf(1,2, -1)
        val expectedSize = 2
        val result = solution.removeDuplicates(input)
        assertEquals(expectedSize, result)
        assertArrayEquals(expectedArray, input)
    }

    @Test
    fun testExample2() {
        val input = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val expectedArray = intArrayOf(0,1,2,3,4,-1,-1,-1,-1,-1)
        val expectedSize = 5
        val result = solution.removeDuplicates(input)
        assertEquals(expectedSize, result)
        assertArrayEquals(expectedArray, input)
    }
}