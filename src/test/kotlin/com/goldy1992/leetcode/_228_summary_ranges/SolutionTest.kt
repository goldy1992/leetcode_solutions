package com.goldy1992.leetcode._228_summary_ranges

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val nums = intArrayOf(0,1,2,4,5,7)
        val expected = arrayOf("0->2","4->5","7")
        val result = solution.summaryRanges(nums)
        assertResult(expected, result)
    }
    @Test
    fun testExample2() {
        val nums = intArrayOf(0,2,3,4,6,8,9)
        val expected = arrayOf("0","2->4","6","8->9")
        val result = solution.summaryRanges(nums)
        assertResult(expected, result)
    }
    @Test
    fun testExample3() {
        val nums = intArrayOf()
        val result = solution.summaryRanges(nums)
        assertTrue(result.isEmpty())
    }

    @Test
    fun testExample4() {
        val nums = intArrayOf(0)
        val expected = arrayOf("0")
        val result = solution.summaryRanges(nums)
        assertResult(expected, result)
    }

    private fun assertResult(expected: Array<String>, actual: List<String>) {
        assertEquals(expected.size, actual.size)
        for (s in expected) {
            assertTrue(actual.contains(s))
        }
    }

}