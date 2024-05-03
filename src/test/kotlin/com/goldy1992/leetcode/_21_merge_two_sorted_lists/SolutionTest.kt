package com.goldy1992.leetcode._21_merge_two_sorted_lists

import com.goldy1992.leetcode.TestUtils.assertListNodeResult
import com.goldy1992.leetcode.TestUtils.createListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val l1 = createListNode(intArrayOf(1,2,4))
        val l2 = createListNode(intArrayOf(1,3,4))
        val expected = listOf(1,1,2,3,4,4)
        val result = solution.mergeTwoLists(l1, l2)
        assertListNodeResult(result, expected)
    }
    @Test
    fun testExample2() {
        val l1 = createListNode(intArrayOf())
        val l2 = createListNode(intArrayOf())
        val expected = listOf<Int>()
        val result = solution.mergeTwoLists(l1, l2)
        assertListNodeResult(result, expected)
    }
    @Test
    fun testExample3() {
        val l1 = createListNode(intArrayOf())
        val l2 = createListNode(intArrayOf(0))
        val expected = listOf(0)
        val result = solution.mergeTwoLists(l1, l2)
        assertListNodeResult(result, expected)
    }
}