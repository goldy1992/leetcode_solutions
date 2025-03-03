package com.goldy1992.leetcode._27_remove_element

import com.goldy1992.leetcode.remove_element.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()
    @Test
    fun testExample1() {
        val input = intArrayOf(3, 2, 2, 3)
        val removeElement = 3
        val expectedArray = intArrayOf(2, 2, -1, -1)
        val expectedSize = 2
        val result = solution.removeElement(input, removeElement)
        assertArrayEquals(expectedArray, input)
        assertEquals(expectedSize, result)
    }

    @Test
    fun testExample2() {
        val input = intArrayOf(0,1,2,2,3,0,4,2)
        val removeElement = 2
       // val expectedArray = intArrayOf(0,1,4,0,3, -1, -1, -1)
        val expectedSize = 5
        val result = solution.removeElement(input, removeElement)
        assertEquals(expectedSize, result)
    }
}