package com.goldy1992.leetcode._141_linked_list_cycle

import com.goldy1992.leetcode.linked_lists.ListNode
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testExample1() {
        val head = ListNode(3)
        val node2 = ListNode(2)
        val node0 = ListNode(0)
        val node2N4 = ListNode(-4)

        head.next = node2
        node2.next = node0
        node0.next = node2N4
        node2N4.next = node2

        val result = solution.hasCycle(head)
        assertTrue(result)
    }

    @Test
    fun testExample2() {
        val head = ListNode(1)
        val node2 = ListNode(2)

        node2.next = head
        head.next = node2

        val result = solution.hasCycle(head)
        assertTrue(result)
    }

    @Test
    fun testExample3() {
        val head = ListNode(1)
        val result = solution.hasCycle(head)
        assertFalse(result)
    }
}