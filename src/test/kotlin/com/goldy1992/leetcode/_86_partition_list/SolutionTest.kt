package com.goldy1992.leetcode._86_partition_list

import com.goldy1992.leetcode.TestUtils.assertListNodesEqual
import com.goldy1992.leetcode.TestUtils.createListNode
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val input = createListNode(intArrayOf(1,4,3,2,5,2))
        val x = 3
        val expected = createListNode(intArrayOf(1,2,2,4,3,5))
        val result = solution.partition(input, x)
        assertListNodesEqual(expected, result)
    }
    @Test
    fun testExample2() {
        val input = createListNode(intArrayOf(2,1))
        val x = 3
        val expected = createListNode(intArrayOf(1,2))
        val result = solution.partition(input, x)
        assertListNodesEqual(expected, result)
    }
}