package com.goldy1992.leetcode.merge_sorted_array

import org.example.com.goldy1992.leetcode.merge_sorted_array.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SolutionTest {
    val solution = Solution()

    @Test
    fun testExample1() {
        val m = 3
        val n = 3

        val nums1 = IntArray(m+n)
        nums1[0] = 1
        nums1[1] = 2
        nums1[2] = 3

        val nums2 = intArrayOf(2,5,6)
        val expected = intArrayOf(1,2,2,3,5,6)
        solution.merge(nums1, m, nums2, n)
        assertContentEquals(expected, nums1)
    }
    @Test
    fun testExample2() {
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0
        val expected = intArrayOf(1)
        solution.merge(nums1, m, nums2, n)
        assertContentEquals(expected, nums1)
    }

}