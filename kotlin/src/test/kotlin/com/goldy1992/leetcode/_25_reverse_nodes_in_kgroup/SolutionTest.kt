package com.goldy1992.leetcode._25_reverse_nodes_in_kgroup

import com.goldy1992.leetcode.TestUtils.assertListNodesEqual
import com.goldy1992.leetcode.TestUtils.createListNode
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val head = createListNode(intArrayOf(1,2,3,4,5))
        val k = 2
        val expected = createListNode(intArrayOf(2,1,4,3,5))
        val result = solution.reverseKGroup(head, k)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample2() {
        val head = createListNode(intArrayOf(1,2,3,4,5))
        val k = 3
        val expected = createListNode(intArrayOf(3,2,1,4,5))
        val result = solution.reverseKGroup(head, k)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample3() {
        val head = createListNode(intArrayOf(1,2,3,4,5))
        val k = 1
        val expected = createListNode(intArrayOf(1,2,3,4,5))
        val result = solution.reverseKGroup(head, k)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample4() {
        val head = createListNode(intArrayOf(1,2,3,4,5))
        val k = 5
        val expected = createListNode(intArrayOf(5,4,3,2,1))
        val result = solution.reverseKGroup(head, k)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample5() {
        val head = createListNode(intArrayOf(1,2))
        val k = 2
        val expected = createListNode(intArrayOf(2,1))
        val result = solution.reverseKGroup(head, k)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample6() {
        val head = createListNode(intArrayOf(1,2,3,4))
        val k = 2
        val expected = createListNode(intArrayOf(2,1,4,3))
        val result = solution.reverseKGroup(head, k)
        assertListNodesEqual(expected, result)
    }
}