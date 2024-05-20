package com.goldy1992.leetcode._82_remove_duplicates_from_sorted_list_ii

import com.goldy1992.leetcode.TestUtils.assertListNodesEqual
import com.goldy1992.leetcode.TestUtils.createListNode
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val head = createListNode(intArrayOf(1,2,3,3,4,4,5))
        val expected = createListNode(intArrayOf(1,2,5))
        val result = solution.deleteDuplicates(head)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample2() {
        val head = createListNode(intArrayOf(1,1,1,2,3))
        val expected = createListNode(intArrayOf(2,3))
        val result = solution.deleteDuplicates(head)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample3() {
        val head = createListNode(intArrayOf(-100, 100))
        val expected = createListNode(intArrayOf(-100, 100))
        val result = solution.deleteDuplicates(head)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample4() {
        val head = null
        val expected = null
        val result = solution.deleteDuplicates(head)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample5() {
        val head =  createListNode(intArrayOf(1,1,1,2,2,2,2,2))
        val expected = null
        val result = solution.deleteDuplicates(head)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample6() {
        val head =  createListNode(intArrayOf(1,2,2))
        val expected = createListNode(intArrayOf(1))
        val result = solution.deleteDuplicates(head)
        assertListNodesEqual(expected, result)
    }
}