package com.goldy1992.leetcode._92_reverse_linked_list_ii

import com.goldy1992.leetcode.TestUtils.assertListNodesEqual
import com.goldy1992.leetcode.TestUtils.createListNode
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val head = createListNode(intArrayOf(1, 2, 3, 4, 5))
        val expected = createListNode(intArrayOf(1, 4, 3, 2, 5))
        val left = 2
        val right = 4
        val result = solution.reverseBetween(head, left, right)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample2() {
        val head = createListNode(intArrayOf(5))
        val expected = createListNode(intArrayOf(5))
        val left = 1
        val right = 1
        val result = solution.reverseBetween(head, left, right)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample3() {
        val head = createListNode(intArrayOf(1,2,3))
        val expected = createListNode(intArrayOf(3,2,1))
        val left = 1
        val right = 3
        val result = solution.reverseBetween(head, left, right)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample4() {
        val head = createListNode(intArrayOf(3,5))
        val expected = createListNode(intArrayOf(5,3))
        val left = 1
        val right = 2
        val result = solution.reverseBetween(head, left, right)
        assertListNodesEqual(expected, result)
    }


}