package com.goldy1992.leetcode._2_add_two_number

import com.goldy1992.leetcode.linked_lists.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var remainder = 0
        var currentL1 = l1
        var currentL2 = l2
        var toReturn: ListNode? = null
        var currentNode: ListNode? = null

        while (currentL1 != null || currentL2 != null || remainder > 0) {
            var sum = (currentL1?.`val` ?: 0) + (currentL2?.`val` ?: 0) + remainder
            if (sum >= 10) {
                sum -= 10
                remainder = 1
            } else {
                remainder = 0
            }
            val toAdd = ListNode(sum)
            if (toReturn == null) {
                toReturn = toAdd
            }

            if (currentNode != null) {
                currentNode.next = toAdd
            }
            currentNode = toAdd

            if (currentL1 != null) {
                currentL1 = currentL1.next
            }

            if (currentL2 != null) {
                currentL2 = currentL2.next
            }

        }
        return toReturn
    }
}