package com.goldy1992.leetcode._19_remove_nth_node_from_list

import com.goldy1992.leetcode.TestUtils.assertListNodesEqual
import com.goldy1992.leetcode.TestUtils.createListNode
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = createListNode(intArrayOf(1,2,3,4,5))
        val n = 2
        val expected = createListNode(intArrayOf(1,2,3,5))
        val result = solution.removeNthFromEnd(input, n)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample2() {
        val input = createListNode(intArrayOf(1))
        val n = 1
        val expected = null
        val result = solution.removeNthFromEnd(input, n)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample3() {
        val input = createListNode(intArrayOf(1,2))
        val n = 1
        val expected = createListNode(intArrayOf(1))
        val result = solution.removeNthFromEnd(input, n)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample4() {
        val input = createListNode(intArrayOf(1,2))
        val n = 2
        val expected = createListNode(intArrayOf(2))
        val result = solution.removeNthFromEnd(input, n)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample5() {
        val input = createListNode(intArrayOf(1,2,3,4,5))
        val n = 1
        val expected = createListNode(intArrayOf(1,2,3,4))
        val result = solution.removeNthFromEnd(input, n)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample6() {
        val input = createListNode(intArrayOf(1,2,3))
        val n = 2
        val expected = createListNode(intArrayOf(1,3))
        val result = solution.removeNthFromEnd(input, n)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample7() {
        val input = createListNode(intArrayOf(1,2,3))
        val n = 3
        val expected = createListNode(intArrayOf(2,3))
        val result = solution.removeNthFromEnd(input, n)
        assertListNodesEqual(expected, result)
    }

}