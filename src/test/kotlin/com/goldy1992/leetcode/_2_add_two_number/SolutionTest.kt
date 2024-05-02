package com.goldy1992.leetcode._2_add_two_number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val l1 = createNode(intArrayOf(2,4,3))
        val l2 = createNode(intArrayOf(5,6,4))
        val expected = listOf(7,0,8)
        val result = solution.addTwoNumbers(l1, l2)
        var currentNode = result
        for (i in expected.size - 1 downTo 0) {
            assertNotNull(result?.`val`)
            assertEquals(result?.`val`, expected[i])
            currentNode = currentNode?.next
        }
    }


    @Test
    fun testExample2() {
        val l1 = createNode(intArrayOf(0))
        val l2 = createNode(intArrayOf(0))
        val expected = listOf(0)
        val result = solution.addTwoNumbers(l1, l2)
        var currentNode = result
        for (i in expected.size - 1 downTo 0) {
            assertNotNull(result?.`val`)
            assertEquals(result?.`val`, expected[i])
            currentNode = currentNode?.next
        }
    }

    @Test
    fun testExample3() {
        val l1 = createNode(intArrayOf(9,9,9,9,9,9,9))
        val l2 = createNode(intArrayOf(9,9,9,9))
        val expected = listOf(8,9,9,9,0,0,0,1)
        val result = solution.addTwoNumbers(l1, l2)
        var currentNode = result
        for (i in expected.size - 1 downTo 0) {
            assertNotNull(result?.`val`)
            assertEquals(result?.`val`, expected[i])
            currentNode = currentNode?.next
        }
    }

    private fun createNode(arr: IntArray): ListNode {
        val toReturn = ListNode(arr[arr.size - 1])
        var currentNode = toReturn
        for (n in arr.size - 2 downTo 0) {
            val node = ListNode(arr[n])
            currentNode.next = node
            currentNode = node
        }
        return toReturn
    }
}