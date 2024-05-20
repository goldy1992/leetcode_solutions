package com.goldy1992.leetcode._61_rotate_list

import com.goldy1992.leetcode.TestUtils.assertListNodesEqual
import com.goldy1992.leetcode.TestUtils.createListNode
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = createListNode(intArrayOf(1,2,3,4,5))
        val k = 2
        val expected = createListNode(intArrayOf(4,5,1,2,3))
        val result = solution.rotateRight(input, k)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample2() {
        val input = createListNode(intArrayOf(0,1,2))
        val k = 4
        val expected = createListNode(intArrayOf(2,0,1))
        val result = solution.rotateRight(input, k)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample3() {
        val input = createListNode(intArrayOf(0,0,0))
        val k = 1
        val expected = createListNode(intArrayOf(0,0,0))
        val result = solution.rotateRight(input, k)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample4() {
        val input = null
        val k = 0
        val expected = null
        val result = solution.rotateRight(input, k)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample5() {
        val input = createListNode(intArrayOf(1,2))

        val k = 1
        val expected = createListNode(intArrayOf(2,1))
        val result = solution.rotateRight(input, k)
        assertListNodesEqual(expected, result)
    }

    @Test
    fun testExample6() {
        val input = createListNode(intArrayOf(1,2,3))

        val k = 2000000000
        val expected = createListNode(intArrayOf(2,3,1))
        val result = solution.rotateRight(input, k)
        assertListNodesEqual(expected, result)
    }
}