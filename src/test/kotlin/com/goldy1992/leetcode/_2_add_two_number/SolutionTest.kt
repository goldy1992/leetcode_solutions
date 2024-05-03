package com.goldy1992.leetcode._2_add_two_number

import com.goldy1992.leetcode.TestUtils.assertListNodeResult
import com.goldy1992.leetcode.TestUtils.createListNode
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val l1 = createListNode(intArrayOf(2,4,3))
        val l2 = createListNode(intArrayOf(5,6,4))
        val expected = listOf(7,0,8)
        val result = solution.addTwoNumbers(l1, l2)
        assertListNodeResult(result, expected)
    }

    @Test
    fun testExample2() {
        val l1 = createListNode(intArrayOf(0))
        val l2 = createListNode(intArrayOf(0))
        val expected = listOf(0)
        val result = solution.addTwoNumbers(l1, l2)
        assertListNodeResult(result, expected)
    }

    @Test
    fun testExample3() {
        val l1 = createListNode(intArrayOf(9,9,9,9,9,9,9))
        val l2 = createListNode(intArrayOf(9,9,9,9))
        val expected = listOf(8,9,9,9,0,0,0,1)
        val result = solution.addTwoNumbers(l1, l2)
        assertListNodeResult(result, expected)
    }

}